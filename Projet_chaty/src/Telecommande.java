import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Appareil> appareils;
    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }
    public void ajouterAppareil(Appareil a) {
        appareils.add(a);
    }

    public boolean activerAppareil(int n) {
        boolean activation = false;
        if (0 <= n && n < appareils.size()) {
            appareils.get(n).allumer();
            activation = true;
        }
        return activation;
    }

    public boolean desactiverAppareil(int n) {
        boolean desactiver = false;
        if (0 <= n && n < appareils.size()) {
            appareils.get(n).eteindre();
                desactiver = true;
        }
        return desactiver;
    }

    public boolean activerTout() {
        int i = 0;
        boolean activer = false;
        while (i < appareils.size()) {
            appareils.get(i).allumer();
            activer = true;
            i++;
        }
        return activer;
    }
    public String toString() {
        String resultat = "";
        for (Appareil a: this.appareils){
            resultat+= a.toString() + "\n";
        }
        return resultat;
    }
}
