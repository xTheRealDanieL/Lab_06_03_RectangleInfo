import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length=0;
        double width=0;
        double diagonal;
        double area;
        double perimeter;
        String trash="";

        System.out.println("Please enter the length and the width of the rectangle: ");

        if(in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();

                perimeter = (length + width) * 2;
                area = length * width;
                diagonal = Math.sqrt(length * length + width * width);

                System.out.println("The area is: " + area);
                System.out.println("The perimeter is: " + perimeter);
                System.out.println("The diagonal is: " + diagonal);
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is an invalid input");
        }
    }
}