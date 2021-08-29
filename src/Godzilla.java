public class Godzilla extends Kaiju {
    private int tailLength;

    public Godzilla(int x, int y, int health, int tailLength) {
        super(x, y, health);
        this.tailLength = tailLength;
    }

    @Override
    double areaOfDestruction() {
        return 0;
    }
}