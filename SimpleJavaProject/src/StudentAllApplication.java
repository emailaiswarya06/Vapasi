public class StudentAllApplication {

    public static void main(String[] args) {
        /*
        Student s1 = new Student();
        s1.name ="Harry";
        s1.rollNo = 101;
        s1.mark = 75;
        s1.checkIfStudentPassed(s1.mark);
        Student s2 = new Student();
        s2.name ="Ron Weasley";
        s2.rollNo = 102;
        s2.mark = 34;
        s1.checkIfStudentPassed(s2.mark);
*/
        //Student s1 = new Student();
        Student s2 = new Student("Harry Potter",101,20);
        Student s3 = new Student("Hermoine Granger",102,90);
        Student s4 = new Student("Ronald Weasely",103,70);
        Student s5 = new Student("Vodermot",104,0);
        Student.printCountOfStudents();

        //s2.checkIfStudentPassed();


    }

}
