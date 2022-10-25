package overriding;

public class BaseKrediManager {
public double hesapla(double tutar) {				//public final double şeklinde yazarsan bu override edilemez demek, sikseler bunun aksini farklısını vs yazamazsın, mesela kredi oranı kac belirtildiyse o, ogrenci kredisinde falan değiştremezsn!!
	return tutar * 1.18;
	
}
}
