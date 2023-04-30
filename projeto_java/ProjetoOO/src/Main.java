
public class Main {

	public static void main(String[] args) {
		Concessionaria concessionaria = new Concessionaria("Tesla");
		CarroEletrico teslaModelS = new CarroEletrico("Tesla", "Branco", "Model S", 2020, 10000.0);
		CarroSuv teslaModelY = new CarroSuv("Tesla", "Azul", "Model Y", 2020, true);
		
		concessionaria.adicionarCarro(teslaModelY);
		concessionaria.adicionarCarro(teslaModelS);
		
		System.out.println(concessionaria.toString());
		System.out.println("*************************************************");
		System.out.println(teslaModelS.toString());
		System.out.println("*************************************************");
		System.out.println(teslaModelY.toString());
	}

}
