import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Lift
{

    int weightCapacity = 120;
    int liftPos = 0 ;


    public void selectDirection(int userPos,int numUsers)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 0 for DOWN , 1 for UP : ");
        int upOrDown= sc.nextInt();

        boolean weightFlag;
        if(userPos != liftPos)
        {

            liftPos = moveLiftToUserPos(liftPos,userPos,numUsers);
            Scanner sc1= new Scanner(System.in);
            System.out.println("Enter the weight of users:");
            int totalUserWeight = 0;
            for(int i=0 ; i<numUsers ; i++)
            {
                totalUserWeight = totalUserWeight + sc1.nextInt();
            }

            weightFlag = userWeightCheck(totalUserWeight);
        }
        else
        {
            int totalUserWeight = 0;
            Scanner sc1= new Scanner(System.in);
            System.out.println("Enter the weight of users:");
            for(int i=0 ; i<numUsers ; i++)
            {
                totalUserWeight = totalUserWeight + sc1.nextInt();
            }
            weightFlag = userWeightCheck(totalUserWeight);
        }

        if (!weightFlag)
        {
            Scanner sc1= new Scanner(System.in);
            System.out.println("Enter the floor you want to go to :");
            ArrayList<Integer> floorInput = new ArrayList<Integer>();
            for(int i = 0 ;i < numUsers; i++  )
            {
                floorInput.add(sc.nextInt());
            }
            liftPos = moveLiftToUserInput(floorInput,liftPos);

        }
        else
        {
            System.out.println("Overweight !!");
        }

    }



    public boolean userWeightCheck(int totalUserWeight)
    {
        boolean weightFlag;
        if( totalUserWeight > weightCapacity)
        {
            weightFlag =  true;
        }
        else
        {
            weightFlag = false;
        }

        return weightFlag;
    }

    public int moveLiftToUserInput(List floorInput , int liftPos)
    {
        Object[] floorInputArray = floorInput.toArray();
        for(int i = 0 ; i < floorInputArray.length ; i++)
        {
            if(liftPos < (Integer)floorInputArray[i])
            {
                do
                {

                    System.out.println("GOING UP"+liftPos) ;
                    liftPos += 1;
                }while (liftPos != (Integer)floorInputArray[i]);
            }
            else
            {
                do
                {
                    System.out.println("GOING DOWN"+liftPos) ;
                    liftPos -= 1;
                }while (liftPos != (Integer)floorInputArray[i]);
            }
        }
        return this.liftPos;
    }

    public int moveLiftToUserPos(int liftPos, int userPos,int numUsers)
    {
        if(this.liftPos > userPos)
        {
            do{

                System.out.println("Lift is at "+ this.liftPos) ;
                this.liftPos--;
            }while(this.liftPos != userPos);
        }
        else
        {
            do
            {
                System.out.println("Lift is at "+ this.liftPos) ;
                this.liftPos++;
            }while(this.liftPos != userPos);
        }

        return this.liftPos;
    }

}
