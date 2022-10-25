package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager (BaseLogger logger) {   //ana log olarak baselogger la calısmıs olduk, diğerlerini kapsadığı için, new lemek sıkıntı olmasın diye
		this.logger = logger;
		
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("log mesajı");
		
	}

}
