import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaColecoes {

	public static void main(String[] args) {
		//ArrayList<Strin> contas = new ArrayList<String>();
		//List<String> nomes = new LinkedList<String>();
		Set<String> nomes = new HashSet<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Guilherme");
		
		//System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));

		// for(int i = 0; i < nomes.size(); i++) {
		// System.out.println(nomes.get(i));
		// }

		for (String nome : nomes) {
			System.out.println(nome);
		}

		// ordenação alfabetica
		//Collections.sort(nomes);

		System.out.println("Ordenado!");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		// criar Arraylist de contas bancarias
		// ArrayList<Conta> contas = new ArrayList<Conta>();

		// Conta c1 = new Conta(1500.0);
		// Conta c2 = new Conta(700.0);
		// contas.add(c1);
		// contas.add(c2);

		// System.out.println(contas.get(1));

		// Collections.sort(contas);

		// for(Conta c: contas) {
		// System.out.println(c);
		// }

		System.out.println("\nO List permite que um mesmo nome de elemento se repita\n");

		Collection<Conta> contas = new HashSet<Conta>();
		//Set<Conta> contas = new HashSet<Conta>();
		Conta c1 = new Conta(200.0);
		Conta c2 = new Conta(500.0);
		contas.add(c1);
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
		
				
		
	}

}
