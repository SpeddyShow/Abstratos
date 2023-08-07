package Animais;

public abstract class Animals implements AnimalBase {
	
	protected String nome;
	protected String som;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public void MoverAnimal() {
		System.out.println("Os animais se movem de alguma forma seja aquática, terrestre ou área");
	}
}