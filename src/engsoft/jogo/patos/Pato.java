package engsoft.jogo.patos;

public abstract class Pato {
	protected Padrao_Voaveis comportamento_pato;
	protected Padrao_Pulaveis comportamento_pulo;
	protected Padrao_Grasnar comportamento_grasnar;

	abstract String mostrar();

	public String nadar()
	{
		return "Pato Nadando.";
	}

	public void setComportamento(Padrao_Grasnar padrao)
	{
		comportamento_grasnar = padrao;
	}

	public void setComportamento(Padrao_Voaveis padrao)
	{
		comportamento_pato = padrao;
	}

	public void setComportamentoPulo(Padrao_Pulaveis padrao)
	{
		comportamento_pulo = padrao;
	}

	public String comportamento_pato()
	{
		return comportamento_pato.voar();
	}

	public String comportamento_pulo()
	{
		return comportamento_pulo.Pular();
	}

	public String comportamento_grasnar()
	{
		return comportamento_grasnar.grasnar();
	}
}
