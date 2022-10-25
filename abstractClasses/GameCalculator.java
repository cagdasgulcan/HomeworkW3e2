package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();			//abstractlar sonradan yazıldı hesaplama her birim içinde ayrı yazılacak
	
	
	public final void gameOver() {				//final diyince herkes bunu seve seve gameOver şeklinde kullanacak kadın erkek cocuk farketmez
		System.out.println("Oyun bitti");
	}

}
