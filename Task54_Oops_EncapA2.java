package Gawande;
import java.util.Scanner;
public class Task54_Oops_EncapA2
{
    void meth1()
    {
        Scanner sc = new Scanner(System.in);
        Task53_Oops_EncapA obj = new Task53_Oops_EncapA();

        System.out.println("Enter Student Name: ");
        String name = sc.next();
        obj.setStudentName(name);

        System.out.println("Enter Student Attendance in percentage");
        int attendance = sc.nextInt();
        obj.setStudentAttendance(attendance);

        System.out.println("Enter Student Marks in percentage: ");
        int marks = sc.nextInt();
        obj.setStudentMarks(marks);
        /*
        I am not write logic here only call a method present in
        Task53_Oops_EncapA
         */
        obj.attend(); // updated marks
        System.out.println("Updated values of Students: ");
        System.out.println("StudentName: "+obj.getStudentName());
        System.out.println("StudentMarks: "+obj.getStudentMarks());
        System.out.println("StudentAttendance: "+obj.getStudentAttendance());
        sc.close();

    }

    public static void main(String[] args)
    {
        new Task54_Oops_EncapA2().meth1();

    }

}
