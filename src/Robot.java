
/**
 * @author  Burmau Garba
 * @version 1.1
 * <br/>
 * Created on 01/09/2021
 * <br/>
 *<b> Instructor<b/>: Brian Sauer
 * */
public class Robot extends Monster{
    public int x,y, power;
    /**
     * @param x is the x-axis
     * @param y is the y-axis
     * @param power
     */
    public Robot(int x, int y,  int power) {
        this(x,y);
        this.x = x;
        this.y = y;
        this.power = power;
    }

    public Robot(int x, int y) {
        super();
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getPower() {
//        return power;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }

    /**
     * @return the area for which the destruction is allowed
     *
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }

}
