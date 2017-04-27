package Exercici;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametriTest {
	private Double espeado,delta,actual;
	private Primordial result;
	@Parameters
	public static Collection<Double[]> data() {
		return Arrays.asList(new Double[][] {     
				{ 2.0, 2.0 ,0.03 },
				{ 3.0, 6.0 ,0.03 },
				{ 4.0, 6.0 ,0.03 },
				{ 5.0, 30.0 ,0.03 },
				{ 7.0,  210.0 ,0.03 },
				{ 11.0, 2310.0 ,0.03}, 
				{ 13.0, 30030.0 ,0.03 },
				{ 17.0, 510510.0 ,0.03 },
				{ 19.0, 9699690.0 ,0.03},   
				{ 23.0, 223092870.0 ,1.03},
		});
	}
	public ParametriTest(Double actual,Double espeado,  Double delta) {
		this.espeado = espeado;
		this.delta = delta;
		this.actual = actual;
	}
	@Before
	public void crearOBj(){
		result = new Primordial();
	}
	@Test
	public void test(){
		double calculado = result.get_primordial(actual);
		Assert.assertEquals(espeado, calculado,delta);
	}
	
	

}
