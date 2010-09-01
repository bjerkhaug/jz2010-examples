package no.steria.fhs;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeilhaandteringssystemTest {
	
	@Test
	public void skalGiMuligVolumfeilVedToKundemeldteFeilPaaSammeKoblingspunkt() {
		Feilhaandteringssystem fhs = new Feilhaandteringssystem();
		
		assertFalse(fhs.harMuligVolumfeil(Koblingspunkt.OSLO_S));
		
		fhs.meldInnFeil(new KundemeldtFeil("Ingen ringetone", Koblingspunkt.OSLO_S));
		fhs.meldInnFeil(new KundemeldtFeil("Ingen internettforbindelse", Koblingspunkt.OSLO_S));
		
		assertTrue(fhs.harMuligVolumfeil(Koblingspunkt.OSLO_S));
	}
	
	@Test
	public void skalIkkeGiMuligVolumfeilVedEnKundemeldtFeilPaaEtKoblingspunkt() {
		Feilhaandteringssystem fhs = new Feilhaandteringssystem();
		
		assertFalse(fhs.harMuligVolumfeil(Koblingspunkt.MAJORSTUEN));
		
		fhs.meldInnFeil(new KundemeldtFeil("Ingen internettforbindelse", Koblingspunkt.MAJORSTUEN));
		
		assertFalse(fhs.harMuligVolumfeil(Koblingspunkt.MAJORSTUEN));
	}
}
