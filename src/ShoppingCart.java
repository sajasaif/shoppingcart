import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	int cost=0;  
 public static ArrayList<Product> Products;
ShoppingCart()
{
	Products=new ArrayList<Product>();
}
	public static int getSize(ShoppingCart shc)
	{
		
		return Products.size();
	}
	
	public void addProduct(Product p)
	{
	
	Products.add(p);
	}
	 public   int calculate()
	
	 {
		 
		 
		 for(Product pro :Products)
		 {
			 cost += pro.price;
		 }
		 return cost;
	 }

}
