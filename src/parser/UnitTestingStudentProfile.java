package parser;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student();

        Assert.assertEquals(student.getFirstName(), "Mohibur");
    }
}