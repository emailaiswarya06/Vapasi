package Student;
//child1
public class ScienceStudents extends StudentAllApplication{

        int physicsMarks,chemistryMarks,mathsMarks;

    ScienceStudents(String name, int physicsMarks,int chemistryMarks,int mathsMarks){
        super(name);
        this.physicsMarks = physicsMarks;
            this.chemistryMarks = chemistryMarks;
            this.mathsMarks =  mathsMarks;

    }

    public static void main(String[] args) {

        ScienceStudents science1 = new ScienceStudents("Hermoine",50,60,70);
        System.out.println("Name " + science1.name+ "Physics = "+science1.physicsMarks+"Chemistry =  "+science1.chemistryMarks+"Maths ="+science1.mathsMarks);
    }
}
