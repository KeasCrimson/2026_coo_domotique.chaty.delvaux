import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChargeurMagasin {

    @Test
    public void test_chargerMagasin_RepValide(){
        ChargeurMagasin charge1 = new ChargeurMagasin("documents");
        boolean test = true;
        try {
            charge1.chargerMagasin();
        } catch (FileNotFoundException e) {
            test = false;
        }

        assertEquals(true, test);
    }

    @Test
    public void test_chargerMagasin_RepInvalide(){
        ChargeurMagasin charge1 = new ChargeurMagasin("../docs");
        boolean test = true;
        try {
            charge1.chargerMagasin();
        } catch (FileNotFoundException e) {
            test = false;
        }

        assertEquals(false, test);
    }
}
