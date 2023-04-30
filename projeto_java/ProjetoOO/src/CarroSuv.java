
public class CarroSuv extends Carro{

	private boolean tracaoIntegral;
	
	public CarroSuv(String marca, String cor, String modelo, int ano, boolean tracaoIntegral) {
		super(marca, cor, modelo, ano);
		this.tracaoIntegral = tracaoIntegral;
	}
	
	public boolean isTracaoIntegral() {
		return tracaoIntegral;
	}

	public void setTracaoIntegral(boolean tracaoIntegral) {
		this.tracaoIntegral = tracaoIntegral;
	}
	
	@Override
	public String toString() {
		return "CarroSuv [TracaoIntegral=" + tracaoIntegral + ", Marca=" + getMarca() + ", Cor=" + getCor()
				+ ", Modelo=" + getModelo() + ", Ano=" + getAno() + "]";
	}

}
