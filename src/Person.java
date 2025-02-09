public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
