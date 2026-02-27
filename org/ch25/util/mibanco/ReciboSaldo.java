package org.ch25.util.mibanco;

import java.util.Date;

public class ReciboSaldo {
	
	public static void Imprimir (Cuentacliente c){
		System.out.println("+=================================================");
		System.out.println("| Cuenta No. " + c.getNumeroCuenta());
		System.out.println("| " + new Date());
		System.out.println("| Saldo : " + c.getSaldo());
		System.out.println("|                    Gracias :D ...");
		System.out.println("+=================================================");
	}//imprimir
}//class
