import java.util.Scanner;

public class  Main {
    public static void main(String[] args)
    {
       Lift l = new Lift();
       char userPresent = 'y';
       while( userPresent != 'n' )
       {
           Scanner sc= new Scanner(System.in);
           System.out.print("User present :");
           userPresent = sc.next().charAt(0);
           Scanner scPos= new Scanner(System.in);
           System.out.print("Enter user position :");
           int userPos = scPos.nextInt();
           l.selectDirection(userPos,3);
       }
    }
}