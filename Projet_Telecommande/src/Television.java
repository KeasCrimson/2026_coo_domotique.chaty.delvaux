public class Television implements Appareil{
    private String nom;
    private boolean allumee;

    public Television(String s){
        this.nom = s;
        this.allumee = false;
    }

    public void allumer(){
        this.allumee = true;
    }

    public void eteindre(){
        this.allumee = false;
    }

    public String toString(){
        String s = "off";
        if (this.allumee == true){
            s = "on";
        }
        return ("Television: "+ this.nom + " " + s);
    }
}
