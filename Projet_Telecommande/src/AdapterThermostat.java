import thermos.Thermostat;

public class AdapterThermostat implements Appareil{

    private Thermostat thermos;

    public AdapterThermostat(Thermostat t){
        this.thermos = t;
    }

    public void allumer(){
        this.thermos.monterTemperature();
    }

    public void eteindre(){
        this.thermos.baisserTemperature();
    }

    public String toString(){
        return("Thermostat");
    }
}
