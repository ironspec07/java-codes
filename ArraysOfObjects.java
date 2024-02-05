class Student
{
    int rollNo;
    String name;
    int marks;
}


public class ArraysOfObjects {
    public static void main(String[] args) 
    {

        Student s1 = new Student();

        s1.rollNo = 7;
        s1.name = "Adii";
        s1.marks = 96;


        Student s2 = new Student();

        s2.rollNo = 18;
        s2.name = "Aditya";
        s2.marks = 95;


        Student s3 = new Student();

        s3.rollNo = 19;
        s3.name = "harsh";
        s3.marks = 92;


        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i].name);
            System.out.println(students[i].rollNo);
            System.out.println(students[i].marks);
        }
    }

}
