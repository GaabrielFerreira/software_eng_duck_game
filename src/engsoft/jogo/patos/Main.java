package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();

		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());
		System.out.println(pt.comportamento_pato());

		pt.setComportamento(new Voar_Foguete());

		System.out.println(pt.comportamento_pato());

		pt.setComportamento(new Voar_Raso());

		System.out.println(pt.comportamento_pato());

		// Parte B - Passo 5
		System.out.println("\n--- Parte B - Passo 5 ---");

		// 5.1 Pato atleta pulando alto
		Pato atleta = new Pato_Atleta();
		System.out.println(atleta.mostrar());
		System.out.println(atleta.comportamento_pulo());

		// 5.2 Pato louco pulando desordenado
		Pato louco = new Pato_Louco();
		System.out.println(louco.mostrar());
		System.out.println(louco.comportamento_pulo());

		// 5.3 Pato atleta trocando comportamento em tempo de execucao
		atleta.setComportamentoPulo(new PuloDesordenado());
		System.out.println(atleta.mostrar() + " agora louco: " + atleta.comportamento_pulo());
	}

}
