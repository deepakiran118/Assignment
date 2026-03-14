package Module3;

class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
}
public class Question7 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Deepa");
        System.out.println("Encapsulated Name: " + p.getName());
    }
}
