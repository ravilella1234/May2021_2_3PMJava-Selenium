package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a  = new ArrayList<String>();
		a.add("oracle");
		a.add("carrier");
		a.add("oaktech");
		a.add("Global");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.equals("Global"))
				var.set("GTS");
			else
				var.remove();
		}
		System.out.println(a);

	}

}
