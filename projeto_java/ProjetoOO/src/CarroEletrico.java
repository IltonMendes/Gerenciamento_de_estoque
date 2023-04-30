
public class CarroEletrico extends Carro{

	private double capacidadeBateria;
	
	public CarroEletrico(String marca, String cor, String modelo, int ano, double capacidadeBateria) {
		super(marca, cor, modelo, ano);
		this.capacidadeBateria = capacidadeBateria;
	}
	
	public double getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(double capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	@Override
	public String toString() {
		return "CarroEletrico [CapacidadeBateria=" + capacidadeBateria + ", Marca=" + getMarca() + ", Cor="
				+ getCor() + ", Modelo=" + getModelo() + ", Ano=" + getAno() + "]";
	}
}
