package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı Blok Çalıştı");
	}
	
	public ProductValidator() {				//constructor class ismiyle aynı, void falan yok. 
		System.out.println("Yapıcı Blok Çalıştı");
	}
	public static boolean isValid(Product product) {			//bir methodu static yaptıgında class ismiyle direkt cagrılır, 
		if(product.price>0 && !product.name.isEmpty()) {		//ünlem işareti değilse demek, yani burda boş degilse olarak
			return true;
			
		} else {
			return false;
		}
		
	}
	public void bisey() {				//bunu cagırabilmen için static olmadığından new lemen gerekir. yoksa product managerda ProductValidator.nokta dedğinde bişey opr gelmez 
		
	}
	
	//public static class BaskaBirClass{					//bu bir inner class bunlar static olabilir, ama actıgımız class sonradan static class olamaz javada
	//	public static void Sil() {						//genelde gruplandırma için kullanılır. 
			
	//	}
	//}

}
