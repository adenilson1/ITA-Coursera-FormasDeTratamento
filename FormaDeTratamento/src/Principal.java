
public class Principal {

	public static void main(String[] args) {
		Informal f = new Informal();
		System.out.println("Informal: " + f.formatadorNome("Maria", "Estrela"));

		Respeitoso r = new Respeitoso('F');
		System.out.println("Respeitoso: " + r.formatadorNome("Maria", "Estrela"));

		ComTitulo t = new ComTitulo("Sua Excelência Ilustríssima ");
		System.out.println("Com titulo: " + t.formatadorNome("Maria", "Estrela"));

	}

}
