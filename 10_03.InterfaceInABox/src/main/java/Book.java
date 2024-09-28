public class Book implements Packable {

    private final String name;
    private final String author;
    private final double weight;

    public Book(String author, String name, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }


    @Override
    public String toString() {
        return author + ": " + name;
    }
}
