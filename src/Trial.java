import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Trial
{
    public static void main(String[] args)
    {
        int userNum = 3;
        int liftPos = 0;
        ArrayList<Integer> floorInput = new ArrayList<Integer>();
        for(int i = 0 ; i < userNum ; i++)
        {
            System.out.println("Enter the floor input for user "+i+" :");
            Scanner sc= new Scanner(System.in);
            floorInput.add(sc.nextInt());
        }

        Object[] floorInputArray = floorInput.toArray();
        for (int i = 0 ; i < floorInputArray.length ; i++)
        {
            if(liftPos < (Integer)floorInputArray[i])
            {
                do
                {
                    if(liftPos ==  (Integer)floorInputArray[i])
                    {
                        System.out.println("YAAAAY !!!!a ");
                    }
                    System.out.println("GOING UP"+liftPos) ;
                    liftPos += 1;
                }while (liftPos != (Integer)floorInputArray[i]);
            }
            else
            {
                do
                {
                    if(liftPos ==  (Integer)floorInputArray[i])
                    {
                        System.out.println("YAAAAY !!!! ");
                    }
                    System.out.println("GOING DOWN"+liftPos) ;
                    liftPos -= 1;
                }while (liftPos != (Integer)floorInputArray[i]);
            }
        }
    }
}