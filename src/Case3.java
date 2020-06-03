import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Case3 {
	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<>();

		alunos.add("Zilene");
		alunos.add("Luzimar");
		alunos.add("Antonio");
		alunos.add("Ernaldo");
		
		/* Method Reference */
		
		Function funcao2 = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao2);
		alunos.sort(comparador);
		
		alunos.forEach(System.out::println);
		
		

	}
}
