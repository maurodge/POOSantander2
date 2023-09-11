
public class Autodromo {

	public static void main(String[] args) {
		// instanciando os objetos
		Carro jeep = new Carro();
		Moto r1 = new Moto();
		
		// chamando um métodos que estão em herança
		jeep.setChassi("4535423");
		r1.setChassi("789798");
		
		// imprimindo os chassis
		System.out.println("chassi do jeep: " + jeep.getChassi());
		System.out.println("chassi da moto: " + r1.getChassi());
		
		// chamando metodos abstratos
		jeep.ligar();
		r1.ligar();
		
		//chamando o metodo ligar pela classe genérica (os objetos devem ter sido instanciados anteriormente)
		
		// Veiculo qualquerVeiculo = r1;
		// qualquerVeiculo.ligar();
		
		// Veiculo outroVeiculo = jeep;
		// outroVeiculo.ligar = jeep
		

	}

}
