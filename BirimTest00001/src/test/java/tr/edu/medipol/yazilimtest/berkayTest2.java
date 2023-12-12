package tr.edu.medipol.yazilimtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class berkayTest2 {

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

	@Test
	public void testTopla() {
		int sonuc = berkay.topla(10, 20);
		assertEquals(30,sonuc);
	}

	@Test
	public void testCikar() {
		int sonuc = berkay.cikar(20, 10);
		assertEquals(10,sonuc);
	}

	@Test
	public void testCarp() {
		int sonuc = berkay.carp(20, 10);
		assertEquals(200,sonuc);
	}

}
