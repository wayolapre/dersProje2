package tr.edu.medipol.yazilimtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class berkayTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = berkay.faktoriyelRec(5);
		assertEquals(120,sonuc);
		
	}

	@Test
	public void testFaktoriyelDongu() {
		int sonuc = berkay.faktoriyelDongu(5);
		assertEquals(120,sonuc);
	}
	
	
}
