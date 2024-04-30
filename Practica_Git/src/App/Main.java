package App;

import Model.Cliente;
import Model.Cuenta;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("Manolo", "Martinez", 54);
		Cliente cliente2 = new Cliente ("Paquillo", "Rubiales", 78);
		
		Cuenta cuenta1 = new Cuenta ("ES1122", cliente1, 2756.72 );
	}

}
