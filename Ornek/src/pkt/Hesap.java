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
	
	public Hesap()
	{
		this.no = UUID.randomUUID().toString(); // Rastgele bir Id belirleniyor...
		// Hesap açılışı bakiye sıfır.
		bakiye = 0;
	}

}
