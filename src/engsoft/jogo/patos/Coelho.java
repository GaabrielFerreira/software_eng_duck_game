package engsoft.jogo.patos;

// Parte C - Coelho usa composicao com Padrao_Pulaveis, sem herdar de Pato
public class Coelho {

	private Padrao_Pulaveis comportamento_pulo;

	public Coelho() {
		comportamento_pulo = new PuloCertinho();
	}

	public String mostrar() {
		return "Eu sou o Coelho.";
	}

	public void setComportamentoPulo(Padrao_Pulaveis comportamento) {
		this.comportamento_pulo = comportamento;
	}

	public String pular() {
		return comportamento_pulo.Pular();
	}

}
