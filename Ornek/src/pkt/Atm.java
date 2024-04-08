package pkt;


public class Atm {
	

	
	public boolean paraYatir(IKart kart,String sifre, double miktar) {
		// Şifre kontrolü
		if(!kart.girisKontrol(sifre)) return false;
		return kart.getHesap().paraYatir(miktar);
	}
}
