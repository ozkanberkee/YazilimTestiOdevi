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
	public boolean paraYatir(double miktar) {
		if(miktar <= 0) return false; // miktar kontrolü
		bakiye += miktar;
		return true;
	}

	



}
