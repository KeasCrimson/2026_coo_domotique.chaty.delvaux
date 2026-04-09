import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {

    @Test
    public void test_ajoutTelecommandeVide(){
        Lampe l = new Lampe("Bob");
        Telecommande t = new Telecommande();
        t.activerPeripherique(l);

        assertEquals(t.peripherie.get(0), l);
    }

    @Test
    public void test_ajouterTelecommande1Element(){

        //Initialisation des valeurs
        Lampe l1 = new Lampe("Bob");
        Lampe l2 = new Lampe("Bobby");

        Telecommande t = new Telecommande();

        t.activerPeripherique(l1);

        t.activerPeripherique(l2);

        //Test
        assertEquals(t.peripherie.get(0), l1);
        assertEquals(t.peripherie.get(1), l2);

    }

    @Test
    public void test_activationLampeZero(){
        Lampe l1 = new Lampe("Bob");
        Lampe l2 = new Lampe("Bobby");
        Telecommande t = new Telecommande();
        t.activerPeripherique(l1);
        t.activerPeripherique(l2);

        t.allumerPeripherique(0);

        assertEquals(true, l1.isAllume());
    }

    @Test
    public void test_activationLampeUn(){
        Lampe l1 = new Lampe("Bob");
        Lampe l2 = new Lampe("Bobby");
        Telecommande t = new Telecommande();
        t.activerPeripherique(l1);
        t.activerPeripherique(l2);

        t.allumerPeripherique(1);

        assertEquals(false, l1.isAllume());
        assertEquals(true, l2.isAllume());
    }

    @Test
    public void test_activationLampeInexistante(){
        Lampe l1 = new Lampe("Bob");
        Lampe l2 = new Lampe("Bobby");
        Telecommande t = new Telecommande();
        t.activerPeripherique(l1);
        t.activerPeripherique(l2);

        t.allumerPeripherique(2);

        assertEquals(false, l1.isAllume());
        assertEquals(false, l2.isAllume());
    }


}
