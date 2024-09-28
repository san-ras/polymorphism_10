import java.util.ArrayList;

public class Box implements Packable {

    private final double capacityKg;
    private final ArrayList<Packable> items;

    public Box(double capacityKg) {
        this.capacityKg = capacityKg;
        items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() <= capacityKg) {
            items.add(packable);
        }
    }

    public double weight() {
        return items.stream().mapToDouble(Packable::weight).sum();
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
