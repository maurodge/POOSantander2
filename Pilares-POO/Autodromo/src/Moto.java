
public class Moto extends Veiculo{

	// foi usado abstração no metodo ligar, que existe de 2 formas diferentes (uma em cada classe), 
	// por isso está sobreescrito
	
	@Override
	public void ligar() {
		System.out.println("Moto ligada");
	}
}
