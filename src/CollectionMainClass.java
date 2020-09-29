import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new B();
		A ab=new A();
		ab.myMeth(0);
		aa.myMeth(0);
		///////////////
		final Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Princi", 1);
		map.put("Prashant", 2);
		map.put("Ashwin", 3);
		map.put("Nikhil", 10 / 2);
		map.put("ssss", 5);
		map.put("ssss", 89);

		for (String s : map.keySet()) {
			System.out.println(s + "     :     " + map.get(s));
		}

	}

}
