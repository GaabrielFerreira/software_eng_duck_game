package engsoft.jogo.patos;

public class Pato_Atleta extends Pato {
	public Pato_Atleta() {
		setComportamentoPulo(new PuloAlto());
	}

	public String mostrar() {
		return "Eu sou o Pato Atleta.";
	}
}
