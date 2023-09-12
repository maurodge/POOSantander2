package multifuncional;

import digitalizadora.Digitalizadora;
import impressora.Impressora;
import copiadora.Copiadora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

	public void copiar() {
		System.out.println("Copiando com a multi");
	}
	public void imprimir() {
		System.out.println("Imprimindo com a multi");
	}
	public void digitalizar() {
		System.out.println("Digitalizando com a multi");
	}
	
}
