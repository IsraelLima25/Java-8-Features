import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Case2 {

	public static void main(String[] args) {

		// Expressões lambdas conseguem ser convertidas para um interface funcional,
		// precisa usar uma
		// Interface funcional

		/*
		 * Interfaces funcionais /* Comparator, Consumer
		 */

		List<String> alunos = new ArrayList<>();

		alunos.add("Zilene");
		alunos.add("Luzimar");
		alunos.add("Antonio");
		alunos.add("Ernaldo");

		alunos.sort(new Comparator<String>() {
			@Override
			public int compare(String aluno1, String aluno2) {
				return aluno1.compareTo(aluno2);
			}			
		});

		alunos.forEach(new Consumer<String>() {
			@Override
			public void accept(String aluno) {
				System.out.println(aluno);				
			}			
		});

		/* Usando Lambdas */

		Consumer<String> s = a -> System.out.println(a);
		
		System.out.println("Lista Desordenada");
		alunos.forEach(s);
		
		alunos.sort((String aluno1, String aluno2) -> aluno1.compareTo(aluno2));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Lista Ordenda");		
		alunos.forEach((String aluno) -> System.out.println(aluno));		

	}
}
