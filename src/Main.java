public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName("Fluffy");
        d1.setBreed("Pomeranian Husky");
        d2.setName("Bbongie");
        d2.setBreed("Chow Chow");

        System.out.println("Dog name: " + d1.getName());
        System.out.println("Dog breed: " + d1.getBreed() + "\n");
        System.out.println("Dog name: " + d2.getName());
        System.out.println("Dog breed: " + d2.getBreed() + "\n");

        }
    }