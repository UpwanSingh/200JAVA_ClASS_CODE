abstract class college{

    abstract void register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical facility are optional");
    }
}
class KIET extends college{
    @Override
    void register(){
        System.out.println("Registeration is mandatory");
    }
    @Override
    void Infrastructure(){
        System.out.println("Good Infrastructure");
    }
    @Override
    void Students(){
        System.out.println("Good Students");
    }
    @Override
    void Staff(){
        System.out.println("Good Staff");
    }
    
    
}
public class AbstractExample{
    public static void main(String args[]){
        KIET obj = new KIET();
        obj.register();
        obj.Infrastructure();
        obj.Students();
        obj.Staff();
        obj.medicalFacility(); 
    }
}
