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
	public boolean paraCek(double miktar) {
		/*
		 * Ön miktar kontrol ediliyor.
		 */
		if(miktar <= 0 || miktar > bakiye) return false;
		bakiye -= miktar;
		return true;
	}

	



}
