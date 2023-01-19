import java.util.Map;

public class Playground {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Birendra");
		map.put(2,  "Amit");
		map.put(3, "Sarit");
		
		//Map.Entry<>
		
		map = map.entrySet().stream().sorted(comparingByValue())
		.collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		
		System.out.println("Map: " + map);
	}
}
