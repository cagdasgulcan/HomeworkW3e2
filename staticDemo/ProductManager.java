package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
			
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		
		//ProductValidator productValidator = new ProductValidator(); //bişeyin cagrılabilmesi için bu yapılmalı ya da static yapıcı blok şeklinde yapılır
		//productValidator.bisey();
		
	}

}
