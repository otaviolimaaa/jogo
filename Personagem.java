package ArenadosHerois;

public  abstract class  Personagem {
	private String nome;
	private int vida;
	private int danobase;
	private int posicao;
	
	public Personagem(String nome, int vida, int danobase) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.danobase = danobase;
		this.posicao = 0; //Posição Inicial
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanobase() {
		return danobase;
	}

	public void setDanobase(int danobase) {
		this.danobase = danobase;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
public void mover  (int novaPosicao) {
	this.posicao = novaPosicao;
	System.out.println(nome + "se moveu para a posição" + novaPosicao);
}

public abstract void atacar (Personagem oponente);

//Metodo para reduzir a vida do personagem a ser atacado 
public void receberDano (int dano) {
	vida -= dano;
	if (vida < 0) { 
		vida = 0;
	}
	System.out.println(nome + "recebeu" + dano + "dano de vida restante :" + vida);
}
//metodo para calcular a distancia entre um personagem e outro 
public int calcularDistancia (Personagem oponente ) {
	return Math.abs(this.posicao - oponente.getPosicao ());
}


	}
	


