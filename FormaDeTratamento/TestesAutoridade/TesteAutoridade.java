import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	@Test
	public void testAutoridadeInformal() {
		// Apenas o nome
		Autoridade autoridade = new Autoridade("Maria", "Estrela", new Informal());

		assertEquals("Maria", autoridade.getTratamento());
	}

	@Test
	public void testAutoridadeRespeitoso() {
		// Sra. ou Sr. sobrenome
		Autoridade autoridade = new Autoridade("Maria", "Estrela", new Respeitoso('F'));

		assertEquals("Sra. Estrela", autoridade.getTratamento());
	}

	@Test
	public void testAutoridadeComTitulo() {
		// titulo nome sobrenome
		Autoridade autoridade = new Autoridade("Maria", "Estrela", new ComTitulo("Doutora"));

		assertEquals("Doutora Maria Estrela", autoridade.getTratamento());
	}

}
