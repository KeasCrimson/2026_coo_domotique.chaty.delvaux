import java.util.ArrayList;

public class Telecommande {
    public ArrayList<Peripherique> peripherie;
    public Telecommande() {
        peripherie = new ArrayList<Peripherique>();
    }
    public void activerPeripherique(Peripherique p) {
        peripherie.add(p);
    }

    public boolean allumerPeripherique(int n) {
        boolean activation = false;
        if (0 <= n && n < peripherie.size()) {
            peripherie.get(n).allumer();
            activation = true;
        }
        return activation;
    }
    public boolean eteindrePeripherique(int n) {
        boolean desactiver = false;
        if (0 <= n && n < peripherie.size()) {
            peripherie.get(n).eteindre();
                desactiver = true;
        }
        return desactiver;
    }
    public boolean desactiverPeripherique(int n) {
        boolean activation = false;
        if (0 <= n && n < peripherie.size()) {
            peripherie.get(n).remove();
            activation = true;
        }
        return activation;
    }
    public boolean activerTout() {
        int i = 0;
        boolean activer = false;
        while (i < peripherie.size() && i < peripherie.size()) {
            peripherie.get(i).allumer();
            i++;
        }
        return activer;
    }
    public String toString() {
        String resultat = "";
        for (int i = 0; i < peripherie.size(); i++) {
            resultat += peripherie.get(i).toString()+"\n";
        }
        return resultat;
    }
}
