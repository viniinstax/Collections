package colecao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guaran�");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("A�ai");
		list.add("Banana");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.addAll(list, "Cupua�u", "Laranja", "Laranja");
		System.out.println(list);
		
	
		System.out.println(Collections.frequency(list, "Laranja"));
		
		
	}

}
