/**
 * Created by H on 28/11/2016.
 */
public  class Rectangle implements Forme,Cloneable {
    private double l;
    private double L;
    public Rectangle(double l,double L){
        this.l=l;
        this.L=L;
    }
    public Rectangle(double l){
        this.l=l;
    }
    public double perimetre(){
        return (l+L)*2;
    }
    public double surface(){
        return l*L;
    }

    public double getL() {
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            throw new InternalError();
        }
    }

    public String toString() {
        return "la longueur est "+  L + " la largeur est "+l +" le perimetre est "+perimetre()+" la surface est " + surface();
    }
}
