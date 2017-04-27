package Exercici;

import org.junit.Assert;
import org.junit.Test;

public class NegativosTest {
	@Test
	public void tesst(){
		Primordial a1 = new Primordial();

		
		Assert.assertEquals(1.0, a1.get_primordial(-6.0), 0.03);

	}
	
}
