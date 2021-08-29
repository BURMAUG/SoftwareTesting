public class WalkingEye extends Robot{
    private int power;

    public WalkingEye(int x, int y) {
        super(x, y);
        power = 10;
    }

    @Override
    double areaOfDestruction() {
        return 0;
    }

}
