/**
 * Created by H on 28/11/2016.
 */
public class Caree extends Rectangle {
    public Caree(double l) {
        super(l);
    }
    public double perimetre() {
        return getL() * 4;
    }
    public double surface() {
        return getL()*getL();
    }
    public String toString() {
        return " la largeur est "+getL() +" le perimetre est "+perimetre()+" la surface est " + surface();
    }
}
