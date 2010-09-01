package no.steria.fhs;

import java.util.ArrayList;
import java.util.List;

public class Feilhaandteringssystem {

	List<KundemeldtFeil> innmeldteFeil = new ArrayList<KundemeldtFeil>();
	
	public void meldInnFeil(KundemeldtFeil kundemeldtFeil) {
		innmeldteFeil.add(kundemeldtFeil);
	}

	public boolean harMuligVolumfeil(Koblingspunkt koblingspunkt) {
		for (KundemeldtFeil kundemeldtFeil : innmeldteFeil) {
			if (kundemeldtFeil.getKoblingspunkt() == koblingspunkt) {
				return true;
			}
		}
		return false;
	}

}
