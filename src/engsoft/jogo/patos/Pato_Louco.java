package engsoft.jogo.patos;

public class Pato_Louco extends Pato {
	public Pato_Louco() {
		setComportamentoPulo(new PuloDesordenado());
	}

	public String mostrar() {
		return "Eu sou o Pato Louco.";
	}
}
