package Gawande;
// method overloading

/*
Create a Java class called Geometry that provides methods to calculate the area of different geometric pes. Overload the methods for calculating the area based on the shape's characteristics.

You need to implement the following overloaded methods:

1.calculatetrea(double radius) =Calculates and returns the area of a circle with the given radius.

2. calculatetrea(double length, double width) =Calculates and returns the area of a rectangle with

the given length and width.

calculateArea(double side)= Calculates and returns the area of a square with the given side

ength

4. calculators(doble base, double height) = Calculates and returns the area of a triangle with the give base and height.

your task is to create the Geometry class with these overloaded methods for calculating areas.

Demonstrate the usage of these methods in a sample Java program by calculating the area of various

geometric shapes.

**Constraints:

Ensure that the methods handle invalid inputs or cases where it's not possible to calculate the area (eg, negative values).
 */
import java.util.Scanner;
public class Task57_Oops_poly
{
    double calculatearea(double radius) //Area of circle
    {
        // πr2
            if(radius>0)
            {
                radius= 3.14*(radius*radius);

            }
            else
            {
                System.out.println("Invalid input");
            }
            return radius;
    }

    double calculatearea(double length, double width) // area of rectangle
    {
        //l*w
        int area;
        if(length>0 && width>0)

             return length*width;

        else
        {
            System.out.println("Invalid input");
            return 0.0;
        }

    }

     double calculatearea(float side)// area of square
     {
         // side2

         if(side>0)
         {
             return side*side;
         }
         else
         {
             System.out.println("Invalid input");
             return 0.0;
         }
     }

    double calculatearea(float base, double height) // area of tringle
     {
         //1/2(base*height)
         if (base>0 && height>0)
         {
             return  (0.5*(base*height));
         }
         else
         {
             System.out.println("Invalid input");
             return 0.0;
         }

     }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

      Task57_Oops_poly obj = new Task57_Oops_poly();


        System.out.println("Please enter the radius: ");
        System.out.println("Enter the area of circle: ");
        System.out.println("area of circle: "+obj.calculatearea(sc.nextDouble()));
        System.out.println("Enter the area of rectangle: ");
        System.out.println("area of rectangle : "+obj.calculatearea(sc.nextDouble(),sc.nextDouble()));
        System.out.println("Enter the area of square: ");
        System.out.println("area of square : "+obj.calculatearea(sc.nextFloat()));
        System.out.println("Enter the area of triangle: ");
        System.out.println("area of triangle : "+obj.calculatearea(sc.nextFloat(),sc.nextDouble()));
        sc.close();
        System.out.println("Enjoy the Java program !!!!");

    }




}
