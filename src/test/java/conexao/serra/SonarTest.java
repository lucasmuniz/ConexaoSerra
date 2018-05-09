package conexao.serra;

import org.testng.annotations.Test;

import model.Alvarino;

public class SonarTest {
	
	
	@Test
	public void testar_alvarino() {
		Alvarino alva = new Alvarino();
		alva.teste();
		alva.teste();
	}

}
