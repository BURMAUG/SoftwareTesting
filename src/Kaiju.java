
/**
 * @author  Burmau Garba
 * @version 1.1
 * <br/>
 * Created on 01/09/2021
 * <br/>
 *<b> Instructor<b/>: Brian Sauer
 * */

public class Kaiju extends Monster{
    private int x,y,health;

    public Kaiju(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

    /**
     * This just returns the area in which the destruction by the
     * Kaiju
     *
     * @return 0
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }
}
