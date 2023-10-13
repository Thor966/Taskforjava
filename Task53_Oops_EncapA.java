package Gawande;

public class Task53_Oops_EncapA
{
    
   private String StudentName;
   private int StudentMarks;
   private int StudentAttendance;


    public String getStudentName()

    {
        return StudentName;
    }
    public void setStudentName(String studentName)
    {
        this.StudentName = studentName;
    }


    public int getStudentMarks()
    {
        return StudentMarks;
    }
    public void setStudentMarks(int studentMarks) {
        this.StudentMarks = studentMarks;
    }


    public int getStudentAttendance()
    {
        return StudentAttendance;
    }
    public void setStudentAttendance(int studentAttendance)
    {

        if (studentAttendance>=75)
        {
            int percentage=(StudentMarks*100)/100;
        }
        this.StudentAttendance = studentAttendance;
    }


    public void attend()
    {
        if(StudentAttendance>=75)
        {
            // add 5%
            StudentMarks = StudentMarks + (100*5)/100;
        }
        else
        {
            // reduce 10%
            StudentMarks = StudentMarks - (100*10)/100;
        }
    }
}
