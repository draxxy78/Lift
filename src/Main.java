import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       Lift l = new Lift();
       Lift l1 = new Lift();
       char userPresent = 'y';
       while( userPresent != 'n' )
       {
           Scanner sc= new Scanner(System.in);
           System.out.print("User present :");
           userPresent = sc.next().charAt(0);
           l.selectDirection();
       }

    }
}