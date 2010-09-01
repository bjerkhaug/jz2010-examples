import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;


public class SpkTest {
	
	@Test
	public void skalVaereUnderAldersGrenseHvisYngreEnn67VedPensjoneringstidspunkt() throws Exception {
		Calendar foedt = Calendar.getInstance();
		foedt.set(Calendar.YEAR, 1943);
		foedt.set(Calendar.MONTH, Calendar.DECEMBER);
		foedt.set(Calendar.DAY_OF_MONTH, 26);
		
		
		Calendar vilGaaAv = Calendar.getInstance();
		vilGaaAv.set(Calendar.YEAR, 2010);
		vilGaaAv.set(Calendar.MONTH, Calendar.NOVEMBER);
		vilGaaAv.set(Calendar.DAY_OF_MONTH, 1);
		
		assertFalse(AldersValidator.oppfyllerAldersgrense(foedt, vilGaaAv));
		
	}

	@Test
	public void skalVaereOverAldersGrenseHvisEldreEnn67VedPensjoneringstidspunk() throws Exception {
		Calendar foedt = Calendar.getInstance();
		foedt.set(Calendar.YEAR, 1943);
		foedt.set(Calendar.MONTH, Calendar.OCTOBER);
		foedt.set(Calendar.DAY_OF_MONTH, 26);
		
		Calendar vilGaaAv = Calendar.getInstance();
		vilGaaAv.set(Calendar.YEAR, 2010);
		vilGaaAv.set(Calendar.MONTH, Calendar.NOVEMBER);
		vilGaaAv.set(Calendar.DAY_OF_MONTH, 1);
		
		assertTrue(AldersValidator.oppfyllerAldersgrense(foedt, vilGaaAv));
		
	}
}
