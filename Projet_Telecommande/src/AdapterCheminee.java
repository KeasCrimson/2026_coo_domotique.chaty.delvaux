public class AdapterCheminee implements Appareil{
    private Cheminee cheminee;

    public AdapterCheminee(Cheminee c){
        this.cheminee = c;
    }

    public void allumer(){
        this.cheminee.changerIntensite(100);
    }

    public void eteindre(){
        this.cheminee.changerIntensite(0);
    }

    public String toString(){
        String s = "Cheminee d'intensité " + this.cheminee.getLumiere();
        return s;
    }

}
