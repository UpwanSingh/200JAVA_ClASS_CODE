
class Student 
{
    String name;
    int id;

    void write()
    {
        System.out.println("Writing Something");
        System.out.println(this.name);
        System.out.println(this.id);
    }
    
     
}
    public class OOPS
    {
        public static void main(String args[])
        {
            Student s1 = new Student();
            s1.name= "Sneh singh";
            s1.id=10012;
            s1.write();

            Student s2 = new Student();
            s2.name= "Srish Jana";
            s2.id=12543;
            s2.write();
            
        }
    }
