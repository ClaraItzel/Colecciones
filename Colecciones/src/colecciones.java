import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class colecciones {

	public static void main(String[] args) {
		/**
		 * Las colecciones Ser no pueden contener elementos duplicados
		 * Solo tiene los métodos heredados de Collection
		 * Existen diferentes tipos de implementacion
		 * 
		 * HashSet: Esta implementacion almacena los elementos en 
		 * una tabla hash. Es la que mejor redimiento tiene
		 * Los elementos no tienen orden
		 */
		Set<String> frutas= new LinkedHashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Platano");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
	

		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		Map diccionario = new HashMap();
		diccionario.put(1, "Clara Itzel");
		
	}

}
