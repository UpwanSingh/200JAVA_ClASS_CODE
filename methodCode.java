public class methodCode {
    String name;
    int id;
    methodCode() {
        id = 111;
        name = "display";
}
public void display() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
}
public static void main(String[] args) {
    methodCode obj = new methodCode();
    obj.display();
}
}
