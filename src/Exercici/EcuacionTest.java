package Exercici;

import org.junit.Assert;
import org.junit.Test;

public class EcuacionTest {
	@Test
	public void tesst(){
		Primordial a1 = new Primordial();
		Primordial a2 = new Primordial();
		Primordial a3 = new Primordial();

		Assert.assertTrue(a1.get_primordial(8.0)>200.0);
		Assert.assertFalse(a2.get_primordial(6.0)>30.0);
		Assert.assertTrue(a3.get_primordial(2.0)<=2.0);
	}
	
}
