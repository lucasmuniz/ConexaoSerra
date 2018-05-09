package conexao.serra;

import org.testng.Assert;
import org.testng.annotations.Test;

import model.Alvarino;

public class SonarTest {
	
	
	@Test
	public void testar_alvarino() {
		Alvarino alva = new Alvarino();
		Assert.assertEquals(alva.teste(), 494928); 
	}

}
