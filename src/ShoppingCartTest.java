import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	 ShoppingCart shc=new ShoppingCart();;
	@Test
	public void test1() {
	 
	assertEquals(0,ShoppingCart.getSize(shc));
	}
	
	@Test
	public void test2() {
		Product javaBook=new Product("Java Book",127);
		shc.addProduct(javaBook);
    assertEquals(127,shc.calculate());
    assertEquals(1,ShoppingCart.getSize(shc));
    
	}
	
	@Test
	public void test3() {
		Product javaBook=new Product("Java Book",127);
		Product webBook=new Product("Web Book",100);
		shc.addProduct(javaBook);
		shc.addProduct(webBook);
    assertEquals(227,shc.calculate());
    assertEquals(2,ShoppingCart.getSize(shc));
    
	}
 

}
