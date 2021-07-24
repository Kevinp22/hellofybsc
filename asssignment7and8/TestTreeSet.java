package asssignment7and8;
import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> Product = new TreeSet();
		Product.add("Colgate");
		Product.add("Pepsodent");
		Product.add("Dabur");
		Product.add("Closeup");
		//adding duplicate
		Product.add("Dabur");
		
		
		Iterator<String> i = Product.iterator();
		while(i.hasNext()) 
		System.out.println(i.next());
		
		System.out.println(Product.first());
		System.out.println(Product.last());
		System.out.println(Product.size());
		Product.remove("Colgate");
		System.out.println(Product.size());
	}

}
