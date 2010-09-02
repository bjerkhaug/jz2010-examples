package no.steria.kraft;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReservekraftOpsjonAuksjonTest {

    @Test
    public void skalPriseReservekraftOpsjonsbud() throws Exception {
        ReservekraftOpsjonAuksjon auksjon = new ReservekraftOpsjonAuksjon();

        ReservekraftOpsjonBud bud = ReservekraftOpsjonBud.medVolumOgPris(1000, 200);
        auksjon.addBud(bud);

        auksjon.kjørMarked();
        assertEquals(200 * 1000, bud.getPris());
    }

    @Test
    public void skalPriseBudEtterMarginalPris() throws Exception {
        ReservekraftOpsjonAuksjon auksjon = new ReservekraftOpsjonAuksjon();

        ReservekraftOpsjonBud budMedLavPris = ReservekraftOpsjonBud.medVolumOgPris(100, 200);
        auksjon.addBud(budMedLavPris);

        ReservekraftOpsjonBud budMedHøyestPris = ReservekraftOpsjonBud.medVolumOgPris(200, 2000);
        auksjon.addBud(budMedHøyestPris);

        auksjon.kjørMarked();
        assertEquals(budMedLavPris.getTilgjengeligEffektIMegaWatt() * budMedHøyestPris.getTilbudtPrisPerMw(),
                budMedLavPris.getPris());
    }
}
