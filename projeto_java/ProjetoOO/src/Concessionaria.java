import java.util.ArrayList;

public class Concessionaria {
	
	private String nome;
	private ArrayList<Carro> listaCarros;
	
	public Concessionaria(String nome) {
		this.nome = nome;
		listaCarros = new ArrayList<Carro>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCarro(Carro carro) {
		listaCarros.add(carro);
	}
	public void removerCarro(Carro carro) {
		listaCarros.remove(carro);
	}
	
	@Override
	public String toString() {
		return "Concessionaria [nome=" + nome + ", listaCarros=" + listaCarros + "]";
	}
}
