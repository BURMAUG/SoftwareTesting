public class Kaiju extends Monster{
    private int x,y,health;

    public Kaiju(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

    /**
     * @return 0
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }
}
