package test;

import XMLCOO.ChargeurCD;
import XMLCOO.ChargeurMagasin;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {
    @Test
    public void test_trierCd() throws FileNotFoundException, IOException {
        ChargeurMagasin cm = new ChargeurMagasin("../documents");
        donnees.Magasin m = cm.chargerMagasin();
        ChargeurCD chargCD1 = new ChargeurCD("../documents/Bieber_Believe.xml");
        donnees.CD cd1 = chargCD1.chargerCD();
        chargCD1 = new ChargeurCD("../documents/Houston_Houston.xml");
        donnees.CD cd2 = chargCD1.chargerCD();
        m.trierCd();


        assertEquals(m.getCd(0).toString(), cd1.toString());
        assertEquals(m.getCd(11).toString(), cd2.toString());

    }

    @Test
    public void test_trierCdArtistes() throws FileNotFoundException, IOException {
        ChargeurMagasin cm = new ChargeurMagasin("../documents");
        donnees.Magasin m = cm.chargerMagasin();
        ChargeurCD chargCD1 = new ChargeurCD("../documents/Benabar_Benabar.xml");
        donnees.CD cd1 = chargCD1.chargerCD();
        chargCD1 = new ChargeurCD("../documents/Zebda_EssenceOrdinaire.xml");
        donnees.CD cd2 = chargCD1.chargerCD();
        m.trierCdArtistes();


        assertEquals(m.getCd(0).toString(), cd1.toString());
        assertEquals(m.getCd(11).toString(), cd2.toString());

    }
}