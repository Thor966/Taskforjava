package Gawande;
/*
Final Keyword assignment:

Create a Java class named Shape that includes the following:

Declare a method named calculateArea() without the final keyword.

Create two subclasses, e.g., Circle and Rectangle, that inherit from the Shape class and provide their own implementations of calculateArea().

In the Shape class, create a method named displayArea() that calls calculateArea().

In the displayArea() method, use the final keyword to prevent further overriding.

Create a separate Java class to test the behavior of these methods by creating instances of

Circle and Rectangle and calling displayArea().
 */

  class Shape
{
    public void calculateArea()
    {
        System.out.println("Calculating Area");
    }

   public final void display()
    {
        calculateArea();
    }

}

 class Circle extends Shape
{
    int radious;

    Circle(int radious)
    {
        this.radious=radious;
    }
    public void calculateArea()
    {
        double area = 3.14 * radious * radious;
        System.out.println("Area of circle:"+area);
    }
}

 class Rectangle extends Shape
{
 double length;
 double width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 public void calculateArea()
 {
     double area = length * width;
     System.out.println("Area of rectangle: " + area);
 }
}
public class Task59_finalkeyword
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4,8);
        rectangle.calculateArea();
    }

}
