import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Lampe> telecommande;
    private ArrayList<Hifi> telecommandehifi;
    public Telecommande() {
        telecommande = new ArrayList<Lampe>();
        telecommandehifi = new ArrayList<Hifi>();
    }
    public void ajouterLampe(Lampe l) {
        telecommande.add(l);
    }
    public void ajouterHifi(Hifi f) {
        telecommandehifi.add(f);
    }

    public boolean activerLampe(int n) {
        boolean activation = false;
        if (0 <= n && n < telecommande.size()) {
            telecommande.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean activerHifi(int n) {
        boolean activation = false;
        if (0 <= n && n < telecommandehifi.size()) {
            telecommandehifi.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean desactiverLampe(int n) {
        boolean desactiver = false;
        if (0 <= n && n < telecommande.size()) {
            telecommande.get(n).eteindre();
                desactiver = true;
        }
        return desactiver;
    }
    public boolean desactiverHifi(int n) {
        boolean activation = false;
        if (0 <= n && n < telecommandehifi.size()) {
            telecommandehifi.get(n).eteindre();
            activation = true;
        }
        return activation;
    }
    public boolean activerTout() {
        int i = 0;
        boolean activer = false;
        while (i < telecommande.size() && i < telecommandehifi.size()) {
            telecommande.get(i).allumer();
            telecommandehifi.get(i).allumer();
            i++;
        }
        return activer;
    }
    public String toString() {
        String resultat = "";
        for (int i = 0; i < telecommande.size(); i++) {
            resultat += telecommande.get(i).toString()+"\n";
        }
        for (int i = 0; i < telecommandehifi.size(); i++) {
            resultat += telecommandehifi.toString()+"\n";
        }
        return resultat;
    }
}
