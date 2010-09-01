import java.util.Calendar;


public class AldersValidator {

	public static boolean oppfyllerAldersgrense(Calendar foedt,
			Calendar vilGaaAv) {
		long alderIms = Calendar.getInstance().getTimeInMillis()-foedt.getTimeInMillis();
		
		return alderIms / 1000L / 60L / 60L / 24L / 365L >= 67L;
	}

}
