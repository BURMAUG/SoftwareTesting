
/**
 * @author  Burmau Garba
 * @version 1.1
 * <br/>
 * Created on 01/09/2021
 * <br/>
 *<b> Instructor<b/>: Brian Sauer
 * */
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
     * @return 0 for the area of destruction of Godzilla
     */
    @Override
    double areaOfDestruction() {
        return 0;
    }
}