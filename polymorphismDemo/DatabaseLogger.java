package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
public void log(String message) {
		System.out.println("Logged to database: " + message); //hepsindeki olayda basedeki kullanılır ama databasede işler değişecekse burdaki kullanılır
	}

}
