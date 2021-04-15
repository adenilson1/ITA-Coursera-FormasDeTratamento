/**
 * Parte III: Classe vai ter um construtor para receber o sexo da pessoa para
 * incluir "Sr" ou "Sra" com o sobrenome
 * 
 * @author adenilson
 *
 */
public class Respeitoso implements FormatadorNome {
	private char sexo;

	public Respeitoso(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String formatadorNome(String nome, String sobrenome) {
		if (sexo == 'M')
			return "Sr. " + sobrenome;
		return "Sra. " + sobrenome;
	}

}
