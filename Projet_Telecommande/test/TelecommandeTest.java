import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TelecommandeTest {

   @Test
    public void test_AjouterAppareil(){
       Telecommande t = new Telecommande();

       //Création des appareils
       Lampe l = new Lampe("Bob");
       Television tel = new Television("Bobby");
       Hifi h = new Hifi();
       Cheminee c = new Cheminee();
       AdapterCheminee ac = new AdapterCheminee(c);

       //Ajout des appareils dans la télécommande
       t.ajouterAppareil(l);
       t.ajouterAppareil(tel);
       t.ajouterAppareil(h);
       t.ajouterAppareil(ac);

       assertEquals(t.appareils.get(0), l);
       assertEquals(t.appareils.get(1), tel);
       assertEquals(t.appareils.get(2), h);
       assertEquals(t.appareils.get(3), ac);

   }

   @Test
    public void test_ActiverAppareil(){
       Telecommande t = new Telecommande();

       //Création des appareils
       Lampe l = new Lampe("Bob");
       Television tel = new Television("Bobby");
       Hifi h = new Hifi();
       Cheminee c = new Cheminee();
       AdapterCheminee ac = new AdapterCheminee(c);

       //Ajout des appareils dans la télécommande
       t.ajouterAppareil(l);
       t.ajouterAppareil(tel);
       t.ajouterAppareil(h);
       t.ajouterAppareil(ac);

       boolean test0 = t.activerAppareil(0);
       boolean test1 = t.activerAppareil(1);
       boolean test2 = t.activerAppareil(2);
       boolean test3 =t.activerAppareil(3);
       boolean test4 =t.activerAppareil(4);

       //Tests
       assertEquals(test0, true);
       assertEquals(test1, true);
       assertEquals(test2, true);
       assertEquals(test3, true);
       assertEquals(test4, false);

   }


    @Test
    public void test_EteindreAppareil() {
        Telecommande t = new Telecommande();

        //Création des appareils
        Lampe l = new Lampe("Bob");
        Television tel = new Television("Bobby");
        Hifi h = new Hifi();
        Cheminee c = new Cheminee();
        AdapterCheminee ac = new AdapterCheminee(c);

        //Ajout des appareils dans la télécommande
        t.ajouterAppareil(l);
        t.ajouterAppareil(tel);
        t.ajouterAppareil(h);
        t.ajouterAppareil(ac);

        t.activerAppareil(0);
        t.activerAppareil(1);
        t.activerAppareil(2);
        t.activerAppareil(3);
        t.activerAppareil(4);

        boolean test0 = t.desactiverAppareil(0);
        boolean test1 = t.desactiverAppareil(1);
        boolean test2 = t.desactiverAppareil(2);
        boolean test3 = t.desactiverAppareil(3);
        boolean test4 = t.desactiverAppareil(4);


        //Tests
        assertEquals(test0, true);
        assertEquals(test1, true);
        assertEquals(test2, true);
        assertEquals(test3, true);
        assertEquals(test4, false);
    }



}
