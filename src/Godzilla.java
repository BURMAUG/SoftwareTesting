public class Godzilla extends Kaiju {
    private int tailLength;

    /**
     * @param x horizontal axis
     * @param y vertical axis
     * @param health how health Godzilla is at a certain moment in time.
     * @param tailLength this describes the length of his tail.
     */
    public Godzilla(int x, int y, int health, int tailLength) {
        super(x, y, health);
        this.tailLength = tailLength;
    }

    /**
     * @return 0
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }
}