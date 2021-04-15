/**
 * Parte V: Classe que vai receber o nome, sobrenome e uma instacia de
 * FormatadorNome
 * 
 * @author adenilson
 *
 */
public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = formatadorNome;
	}

	public String getTratamento() {
		return formatadorNome.formatadorNome(nome, sobrenome);
	}

}
