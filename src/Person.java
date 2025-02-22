public class Person {

    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Meyern",31,"Barcelona, Spain");
        Person p2 = new Person("Noah", 28, "Berlin, Germany");
        Person p3 = new Person("Kamo", 20, "Warsaw, Poland");
        Person p4 = new Person("Kylian", 25, "Paris, France");
        Person p5 = new Person("Shin", 18, "Beijing, China");

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age + "\n");
        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age + "\n");
        System.out.println("Name: " + p3.name);
        System.out.println("Age: " + p3.age + "\n");
        System.out.println("Name: " + p4.name);
        System.out.println("Age: " + p4.age + "\n");
        System.out.println("Name: " + p5.name);
        System.out.println("Age: " + p5.age + "\n");

    }
}

