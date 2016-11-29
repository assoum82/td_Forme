import java.util.Objects;

/**
 * Created by H on 27/11/2016.
 */
public  class  Triangle implements Forme {
    private double b;
    private double h;
    private double x;
    public Triangle(double b,double h,double x){
        this.b=b;
        this.h=h;
        this.x=x;
    }
    public double perimetre() {
        return b+h+x;
    }
    public double surface() {
        return b*h/2;
    }
    public Object clone() {
        return null;
    }

    @Override
    public String toString() {
        return "la base est "+b+" l'hauteur est "+h+" le perimetre est "+perimetre()+" la surface est "+surface();
    }
}
