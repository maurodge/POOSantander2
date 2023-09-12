package equipamentos;

import impressora.Deskjet;
import copiadora.Xerox;
import multifuncional.Multifuncional;
import digitalizadora.Scanner;
import impressora.Impressora;
import copiadora.Copiadora;
import digitalizadora.Digitalizadora;

public class Fabrica {

	public static void main(String[] args) {
		
		// instanciando os objetos
		Impressora impressora = new Deskjet();
		Multifuncional multi = new Multifuncional();
		Copiadora copiadora = new Xerox();
		Digitalizadora digi = new Scanner();
		
		//utiliando os metodos
		impressora.imprimir();
		multi.imprimir();
		multi.digitalizar();
		multi.copiar();
		copiadora.copiar();
		digi.digitalizar();
	}

}
