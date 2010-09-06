package no.steria.kraft;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegulerkraftOpsjonAuksjonTest {

    @Test
    public void skalPriseReservekraftOpsjonsbud() throws Exception {
        RegulerkraftOpsjonAuksjon auksjon = new RegulerkraftOpsjonAuksjon();

        RegulerkraftOpsjonBud bud = RegulerkraftOpsjonBud.medVolumOgPris(1000, 200);
        auksjon.addBud(bud);

        auksjon.kjørMarked();
        assertEquals(200 * 1000, bud.getPris());
    }

    @Test
    public void skalPriseBudEtterMarginalPris() throws Exception {
        RegulerkraftOpsjonAuksjon auksjon = new RegulerkraftOpsjonAuksjon();

        RegulerkraftOpsjonBud budMedLavPris = RegulerkraftOpsjonBud.medVolumOgPris(100, 200);
        auksjon.addBud(budMedLavPris);

        RegulerkraftOpsjonBud budMedHøyestPris = RegulerkraftOpsjonBud.medVolumOgPris(200, 2000);
        auksjon.addBud(budMedHøyestPris);

        auksjon.kjørMarked();
        assertEquals(budMedLavPris.getTilgjengeligEffektIMegaWatt() * budMedHøyestPris.getTilbudtPrisPerMw(),
                budMedLavPris.getPris());
    }
}
