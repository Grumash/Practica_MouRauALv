package Model;

import java.util.ArrayList;

public class Cuenta {

	private String IBAN;
	private ArrayList<Cliente> cliente;
	private double cantidad;
	private boolean estado;
	
	public Cuenta() {
		this.IBAN = IBAN;
		this.cliente = new ArratList<>();
		this.cantidad = cantidad;
		this.estado = true;
	}
}
