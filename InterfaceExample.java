
interface Institute{
    abstract void register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    default void medicalFacility(){
        System.out.println("Medical facility are optional");
    }
}
class ABES implements Institute{
    @Override
    public void register(){
        System.out.println("Registeration is mandatory");
    }
    @Override
    public void Infrastructure(){           
        System.out.println("Good Infrastructure");
    }
    @Override
    public void Students(){
        System.out.println("Good Students");        
    }
    @Override
    public void Staff(){
        System.out.println("Good Staff");
    }
}


