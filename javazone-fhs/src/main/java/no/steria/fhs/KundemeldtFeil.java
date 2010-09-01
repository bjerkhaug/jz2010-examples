package no.steria.fhs;

public class KundemeldtFeil {

	private final String beskrivelse;
	private final Koblingspunkt koblingspunkt;

	public KundemeldtFeil(String beskrivelse, Koblingspunkt koblingspunkt) {
		this.beskrivelse = beskrivelse;
		this.koblingspunkt = koblingspunkt;
	}

	public Koblingspunkt getKoblingspunkt() {
		return koblingspunkt;
	}
	
	public String getBeskrivelse() {
		return beskrivelse;
	}

}
