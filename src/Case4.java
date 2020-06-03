import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Case4 {
			
	public static void main(String[] args) {
		
		/* Streams: Trabalhando melhor com Collections */
		
		List<Negociacao> negociacoes = new ArrayList<>();
		negociacoes.add(new Negociacao("Real", "11051", 400, 25));
		negociacoes.add(new Negociacao("Dolar", "11052", 100000, 35));
		negociacoes.add(new Negociacao("Euro", "11053", 150000, 125));
		negociacoes.add(new Negociacao("Real", "11054", 250, 225));	
		
		negociacoes.forEach(n -> System.out.println(n.getValorAdquirido()));
		negociacoes.sort(Comparator.comparing(n -> n.getMoeda()));
		negociacoes.sort(Comparator.comparing(Negociacao::getMoeda));
		
		negociacoes.forEach(n -> System.out.println(n.getMoeda()));
		
		/*Uso de Filter, Map and Foreach*/
		
		Stream<Negociacao> i = negociacoes.stream().filter(n -> n.getMoeda().equals("Real"));
		i.forEach(negociacao -> System.out.println(negociacao.getNumeroNotaFiscal()));
		
		negociacoes.stream()
		.filter(n -> n.getMoeda().equals("Real") && n.getImpostos() > 100)
		.map(n -> n.getNumeroNotaFiscal())
		.forEach(n -> System.out.println(n));
		
		negociacoes.stream()
		.filter(n -> n.getMoeda().equals("Real"))
		.collect(Collectors.toList()).forEach( n -> System.out.println(n));
		
		double soma = negociacoes.stream()
		.filter(n -> n.getMoeda().equals("Real"))
		.mapToDouble(n-> n.getValorAdquirido())
		.sum();
		
		System.out.println(soma);
		
	}
}
