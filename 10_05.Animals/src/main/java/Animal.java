public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps");
    }

    public void eat() {
        System.out.println(this.name + " eats");
    }
}
