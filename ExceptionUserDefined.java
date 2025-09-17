
class invalidEmpId extends Exception{
    invalidEmpId(String msg){
        super(msg);
    }
}

class Emp_loyee{
    int empId;
    String name;

    Emp_loyee(int empId, String name)throws invalidEmpId{
        if(empId<=0){
            throw new invalidEmpId("+");
        }
        this.empId=empId;
        this.name=name;
        System.out.println("Employee created: " + empId +" - "+name);
    }
}
public class ExceptionUserDefined {
    public static void main(String[] args) {
        
    }
}