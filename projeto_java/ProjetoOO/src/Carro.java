
public abstract class Carro {
	protected String marca;
	protected String cor;
	protected String modelo;
	protected int ano;
	
	protected Carro(String marca, String cor, String modelo, int ano) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void adicionarCarro(Carro carro) {
		
	}
}
