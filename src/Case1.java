import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Case1 {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<>();

		alunos.add("Zilene");
		alunos.add("Luzimar");
		alunos.add("Antonio");
		alunos.add("Ernaldo");
		
		/*Muito utilizado na versão 7 do Java*/
		Collections.sort(alunos);

		Comparator<String> comparador = new Comparador();
		alunos.sort(comparador);

		Consumer<String> consumidor = new ImprimeLinha();
		alunos.forEach(consumidor);
	}
}

class ImprimeLinha implements Consumer<String> {

	@Override
	public void accept(String aluno) {
		System.out.println(aluno);
	}

}

class Comparador implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

}