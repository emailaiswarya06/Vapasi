package Student;
//child2
public class CommerceStudents extends StudentAllApplication {

    int accountsMarks,economicsMarks,businessMarks;

    CommerceStudents(String name,int accountsMarks,int economicsMarks,int businessMarks){
        super(name);
        this.accountsMarks = accountsMarks;
        this.economicsMarks = economicsMarks;
        this.businessMarks =  businessMarks;

    }

    public static void main(String[] args) {

        CommerceStudents commerce1 = new CommerceStudents("Ron",10,20,30);
        System.out.println("Name " + commerce1.name+ " Physics = "+commerce1.accountsMarks+" Chemistry =  "+commerce1.economicsMarks+" Maths ="+commerce1.businessMarks);
    }

}
