public class Student {
            String name,status;
            int rollNo,mark;
            static int numberOfStudents;

    Student(){

        System.out.println("Welcome : default");
    }

    Student(String nameLocal,int rollNoLocal,int markLocal){
        this.name = nameLocal;
        this.rollNo = rollNoLocal;
        this.mark = markLocal;
        numberOfStudents++;

    }

    static void printCountOfStudents(){

        System.out.println("Number os students count "+numberOfStudents);
    }
    public void  checkIfStudentPassed(){

            if(mark>35) {
                System.out.println("Student passed with marks = " + mark);
            }
            else{
                System.out.println("Student failed with marks = " + mark);
            }
      }
}
