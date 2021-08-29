public class Robot extends Monster{
    private int x,y,z, power;

    public Robot(int x, int y, int z, int power) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.power = power;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double areaOfDestruction() {
        return 0;
    }


}
