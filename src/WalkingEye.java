
/**
 * @author  Burmau Garba
 * @version 1.1
 * <br/>
 * Created on 01/09/2021
 * <br/>
 *<b> Instructor<b/>: Brian Sauer
 * */
public class WalkingEye extends Robot{
    private int power = 10;

    public WalkingEye(int x, int y) {
        super(x, y);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return 0
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }


}
