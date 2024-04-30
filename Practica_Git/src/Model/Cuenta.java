package Model;

public class Cuenta {

	private String IBAN;
	private Cliente cliente;
	private double cantidad;
	private boolean estado;
	
	public Cuenta(String IBAN, Cliente cliente, double cantidad) {
		this.IBAN = IBAN;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.estado = true;
	}
}
