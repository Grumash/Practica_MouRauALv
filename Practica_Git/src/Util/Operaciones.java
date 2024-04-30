package Util;

import Model.Cuenta;

public abstract class Operaciones 
{
    boolean cuentaCancelada;

    public Operaciones(boolean cuentaCancelada) 
    {
        this.cuentaCancelada = false;
    }
        	
    public abstract void transferencia (Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad);
	
    public abstract void prestamo (Cuenta cuentaDestino, double cantidad);
	
    public abstract void cancelarCuenta (Cuenta cuentaDestino);
}
