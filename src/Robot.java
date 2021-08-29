public class Robot extends Monster{
    private int x,y,z, power;
    /**
     * @param x
     * @param y
     * @param z
     * @param power
     */
    public Robot(int x, int y, int z, int power) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.power = power;
    }

    /**
     * @param x
     * @param y
     */
    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the area for which the destruction is allowed
     *
     */
    @Override
    double areaOfDestruction() {
        return Math.pow(power, power);
    }


}
