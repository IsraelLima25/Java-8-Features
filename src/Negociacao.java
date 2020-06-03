
public class Negociacao {

	private String moeda;
	private String numeroNotaFiscal;
	private double valorAdquirido;
	private double impostos;
	
	public Negociacao(String moeda, String numeroNotaFiscal, double valorAdquirido, double impostos) {
		super();
		this.moeda = moeda;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.valorAdquirido = valorAdquirido;
		this.impostos = impostos;
	}
	
	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}
	
	public double getValorAdquirido() {
		return valorAdquirido;
	}
	
	public double getImpostos() {
		return impostos;
	}
	
	public String getMoeda() {
		return moeda;
	}
}
