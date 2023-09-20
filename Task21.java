package Gawande;

// Task on selection statements
/*
Write a Java program that calculates the price of a movie ticket based on the age and time of day.
Use the following pricing rules:

1)Children (age 0-12): 50 for morning shows (before 5 PM), 80 for evening shows (5 PM and later).
2)Adults (age 13-64): 100 for morning shows, 150 for evening shows.
3)Seniors (age 65+): 80 for morning shows, 120 for evening shows.
 */

public class Task21
{
  void movie(int age, int time)
  {
      if(age>0&&age<=12)
      {
          if(time>=12&&time<5)
          {
              System.out.println("The time is "+time+" PM the price is 50rs for children");
          }
          else
          {
              System.out.println("The time is "+time+" PM the price is 80rs for children");
          }
      }

      if(age>=13&&age<=64)
      {
          if(time>=12&&time<5)
          {
              System.out.println("The time is "+time+" PM the price is 100rs for adults");
          }
          else
          {
              System.out.println("The time is "+time+" PM the price is 150rs for adults");
          }
      }

      if(age>64)
      {
          if(time>=12&&time<5)
          {
              System.out.println("The time is "+time+" PM the price is 80rs for senior citizen");
          }
          else
          {
              System.out.println("The time is "+time+" PM the price is 120rs for senior citizen");
          }
      }
  }

    public static void main(String[] args)
    {
        new Task21().movie(65,11);
    }
}
