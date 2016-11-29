/**
 * Created by H on 28/11/2016.
 */
public class Affichage {
    public static void main(String[] args) {
        Forme[] tab = new Forme[4];
        tab[0] = new Cercle(2);
        tab[1] = new Triangle(4, 4, 3);
        tab[2] = new Rectangle(5, 3);
        tab[3] = new Caree(4);
        for (int i = 0; i < 4; i++) {
            System.out.println(tab[i]);
        }
        Forme x = (Caree) tab[3].clone();
        System.out.println(x);
    }
    }

