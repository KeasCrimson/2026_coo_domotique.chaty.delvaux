import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;
    public Telecommande() {
        lampes = new ArrayList<Lampe>();
        hifis = new ArrayList<Hifi>();
    }
    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }
    public void ajouterHifi(Hifi f) {
        hifis.add(f);
    }

    public boolean activerLampe(int n) {
        boolean activation = false;
        if (0 <= n && n < lampes.size()) {
            lampes.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean activerHifi(int n) {
        boolean activation = false;
        if (0 <= n && n < hifis.size()) {
            hifis.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean desactiverLampe(int n) {
        boolean desactiver = false;
        if (0 <= n && n < lampes.size()) {
            lampes.get(n).eteindre();
                desactiver = true;
        }
        return desactiver;
    }
    public boolean desactiverHifi(int n) {
        boolean activation = false;
        if (0 <= n && n < hifis.size()) {
            hifis.get(n).eteindre();
            activation = true;
        }
        return activation;
    }
    public boolean activerTout() {
        int i = 0;
        boolean activer = false;
        while (i < lampes.size() && i < hifis.size()) {
            lampes.get(i).allumer();
            hifis.get(i).allumer();
            i++;
        }
        return activer;
    }
    public String toString() {
        String resultat = "";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += lampes.get(i).toString()+"\n";
        }
        for (int i = 0; i < hifis.size(); i++) {
            resultat += hifis.toString()+"\n";
        }
        return resultat;
    }
}
