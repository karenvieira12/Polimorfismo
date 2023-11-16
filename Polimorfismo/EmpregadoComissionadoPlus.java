package Polimorfismo;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado{
	
	private double salarioBase;
	public EmpregadoComissionadoPlus(double salarioBase, double vendasBrutas, 
			double pctComissao, String primeiroNome, String ultimoNome, String cpf) {
		super(vendasBrutas, pctComissao, primeiroNome, ultimoNome, cpf); 
		this.setSalarioBase(salarioBase);
		
	}//fim construtor
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = (salarioBase <= 0.0) ? 1530.0 : salarioBase;
	}
	
	public double vencimentos() {
		//getVendasBrutas() * getHoras() + getSalarioBase()
		return super.vencimentos() + this.getSalarioBase();
	}
	
    public String toString() {
		
		return String.format("**********Empregado Comissionado********\n"
				+ "%s"
				+ "Salario Base: %.2f\n", super.toString(), this.getSalarioBase());
	}
	

}
