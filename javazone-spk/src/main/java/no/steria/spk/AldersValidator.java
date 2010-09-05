package no.steria.spk;
import java.util.Calendar;


public class AldersValidator {
	
	public static boolean oppfyllerAldersgrense(Calendar foedt,
			Calendar vilGaaAv) throws Exception {
		validerIkkeNull(foedt, vilGaaAv);
		long alderIMillisekunder = Calendar.getInstance().getTimeInMillis()-foedt.getTimeInMillis();
		return alderIMillisekunder / 1000L / 60L / 60L / 24L / 365L >= 67L;
	}

	private static void validerIkkeNull(Object... o) throws Exception {
		for (Object object : o) {
			if (object == null) {
				throw new Exception("Input kan ikke være null");
			}
		}
	}

}
