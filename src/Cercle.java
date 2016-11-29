
public  class Cercle implements Forme{
    private double r;
    public Cercle(double r){
        this.r=r;
    }
    public double perimetre(){
        return Math.PI*r*2;
    }
    public double surface(){
        return Math.PI*r*r;
    }
    public String toString() {
        return "le rayon est " + r + " le perimetre est "+perimetre()+" la surface est " + surface();
    }
    public Object clone() {
        return null;
    }
}
