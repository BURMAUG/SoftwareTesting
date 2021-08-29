public class WalkingEye extends Robot{
    private int power = 10;

    public WalkingEye(int x, int y) {
        super(x, y);
    }

    /**
     * @return 0
     */
    @Override
    double areaOfDestruction() {
        return super.areaOfDestruction()*power;
    }

}
