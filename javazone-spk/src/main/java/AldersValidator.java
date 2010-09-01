import java.util.Calendar;


public class AldersValidator {
	
	public static boolean oppfyllerAldersgrense(Calendar foedt,
			Calendar vilGaaAv) {
		foedt.setTimeZone(vilGaaAv.getTimeZone());
		long alderIMillisekunder = Calendar.getInstance().getTimeInMillis()-foedt.getTimeInMillis();
		return alderIMillisekunder / 1000L / 60L / 60L / 24L / 365L >= 67L;
	}

}
