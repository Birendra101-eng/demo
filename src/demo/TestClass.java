package demo;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Birendra");
		map.put(2,  "Nabin");
		map.put(3, "Sanju");
		
		//Map.Entry<>
		
		
		
		/*
		 * map = map.entrySet().stream().sorted(comparingByValue()) .collect(toMap(e ->
		 * e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		 */
		
		System.out.println("Map: " + map);
	}
}
