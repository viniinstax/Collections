package colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList();
		list.add("Futebol");
		list.add("Basquete");
		list.add("T�nis");
		list.add("Volei");
		list.add("Nata��o");
		list.add("Hoquei");
		list.add("Boxe");
		list.add("Futebol");
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println(list);

	}

}
