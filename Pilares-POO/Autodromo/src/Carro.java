
public class Carro  extends Veiculo{
	
	public void ligar() {
		
	confereCambio();
	confereCombustivel();
	System.out.println("Carro ligado");
		
		// metodos abaixo estão encapsulados
	}
	private void confereCambio() {
		System.out.println("conferindo cambio");
	}
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
}
