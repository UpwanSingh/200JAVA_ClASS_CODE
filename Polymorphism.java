class Employee
{
    void show()
    {
        System.out.println("I am an Employee");
    }
  void show(String name)
    {
        System.out.println("I am an Employee: "+name);
    }
    void show(int id)
    {
        System.out.println("I am an Employee: "+id);
    }
}
public class Polymorphism
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.show();
        e1.show("John");
        e1.show(101);
    }
}