package pkt;

import java.util.UUID;

/**
 * Banka hesabını temsil eden sınıf
 * @author MFA
 *
 */
public class Hesap implements IHesap {
	private String no;
	private double bakiye;
	
	
	@Override
	public String toString() {
		return "Hesap No: " + no + "\nBakiye: " + bakiye;
	}

}
