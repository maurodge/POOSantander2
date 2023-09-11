
public abstract class Veiculo {

	// herança, tanto carro quando moto apresntam chassi
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	// metodo comum às classes especificas porém diferentes na execução==>abstração e polimorfismo
	
	public abstract void ligar();
	
}
