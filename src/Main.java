import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Creating variables
        int a,b;
        double c;

        // Get data from user, scanner class must be imported
        Scanner entry = new Scanner(System.in);
        System.out.println("Please enter 1st side of triangle");
        a = entry.nextInt();

        System.out.println("Please enter 2nd side of triangle");
        b = entry.nextInt();

        //With "Math.sqrt" class, we get square root, it's necessary
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse  :" + c);





    }

}
