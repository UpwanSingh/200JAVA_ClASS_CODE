import java.util.Scanner;
class EmployeeEncap {
    
    private int Account_balance;
    private int upi_id = 998989;
    public void setBalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI ID");
        int id = sc.nextInt();
        if(id == upi_id){
            Account_balance = balance;
            System.out.println("Congratulations Your Account is credited with " + balance);
    }
    else{
        System.out.println("Salary not credited due to wrong UPI ID");
    }
    }
}
    class Encapsulation{
        public static void main(String[] args) {
            EmployeeEncap emp = new EmployeeEncap();
            emp.setBalance(50000);      
        }

}
