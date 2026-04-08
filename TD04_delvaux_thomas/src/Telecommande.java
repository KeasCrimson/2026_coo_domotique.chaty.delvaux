import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Lampe> lampes;
    public Telecommande() {
    }
    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

    public boolean activerLampe(int n) {
        boolean activation = false;
        if (0 <= n) {
            lampes.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean desactiverLampe(int n) {
        boolean desactiver = false;
        if (0 <= n) {
                lampes.get(n).eteindre();
                desactiver = true;
        }
        return desactiver;
    }
    public boolean activerTout() {
        int i = 0;
        boolean activer = false;
        while (i < lampes.size()) {
            lampes.get(i).allumer();
            i++;
        }
        return activer;
    }
    public String toString() {
        String resultat = "";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += lampes.get(i).toString();
        }
        return resultat;
    }
}
