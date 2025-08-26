public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;
    EmployeeCopyConstructor(int id, String name) {
        this.Emp_id = id;
        this.Emp_name = name;
    }
    // Copy constructor
    EmployeeCopyConstructor(EmployeeCopyConstructor emp) {
        this.Emp_id = emp.Emp_id;
        this.Emp_name = emp.Emp_name;
    }
    void prinInfo(){
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Employee Name: " + Emp_name);

    }
    

public static void main(String args[])
{
    EmployeeCopyConstructor emp1 = new EmployeeCopyConstructor(101, "John Doe");
    emp1.prinInfo();
    EmployeeCopyConstructor emp2 = new EmployeeCopyConstructor(emp1);
    emp2.prinInfo();
}
}
