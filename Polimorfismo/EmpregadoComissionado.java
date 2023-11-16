package Polimorfismo;

public class EmpregadoComissionado extends Empregado {
	private double vendasBrutas;
	private double pctComissao;
	public EmpregadoComissionado(double vendasBrutas, double pctComissao, 
			String primeiroNome, String ultimoNome, String cpf) {
		super(primeiroNome, ultimoNome, cpf);
		this.setVendasBrutas(vendasBrutas);
		this.setPctComissao(pctComissao);
	}//fim construtor
	public double getVendasBrutas() {
		return vendasBrutas;
	}
	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = (vendasBrutas < 0.0) ? 0.0 : vendasBrutas;
	}
	public double getPctComissao() {
		return pctComissao;
	}
	public void setPctComissao(double pctComissao) {
		this.pctComissao = (pctComissao <=0.0) ? 0.01 : pctComissao;
	}
	
	public double vencimentos() {
		return this.getPctComissao() * this.getVendasBrutas();
	}
	
    public String toString() {
		
		return String.format("**********Empregado Comissionado********\n"
				+ "%s"
				+ "Comissao: %.2f\n"
				+ "Vendas: %.2f\n", super.toString(), this.getPctComissao(), this.getVendasBrutas());
	}

}//fim classe
