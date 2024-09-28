import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herdMember : herd) {
            herdMember.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : herd) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }
}
