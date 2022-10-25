package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger Logger = new EmailLogger();
		//Logger.Log("Log Mesajı"); 				//customerManagerdan sonrasındaki baselogger için bunlar pasif hale getirildi

//		BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger:loggers) {
//			logger.Log("Log Mesajı");
		
	//	}
	CustomerManager customerManager = new CustomerManager(new FileLogger());  //cokululugun oldugu yer burası istedigini yaz ister database ister email logger
	customerManager.add();
	
	}

}

