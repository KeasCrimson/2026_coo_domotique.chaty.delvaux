public class Peripherique {
    /**
     * permet de changer l'etat interne d'un périphérique en l'allumant
     */
    public void allumer() {
        this.allume = true;
    }

    /**
     * permet de changer l'etat interne d'une lampe en l'eteignant
     */
    public void eteindre() {
        this.allume = false;
    }

    /**
     * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
     */
    public String toString() {
        String r = "";
        if (this.allume) {
            r = "On";
        } else {
            r = "Off";
        }
        return (nom + ": " + r);
    }
}