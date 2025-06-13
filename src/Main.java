class Person {
    public String name;

    public String getName() {
        return name;

    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getName());
    }
}