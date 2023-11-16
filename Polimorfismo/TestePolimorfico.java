package Polimorfismo;

public class TestePolimorfico {
	
	public static void main(String args[]) {
		
		EmpregadoAssalariado obj1= new EmpregadoAssalariado(2000, "Maria", "Fernanda", "012455654-21");
		EmpregadoHorista obj2= new EmpregadoHorista(20, 160, "Pedro", "Silva", "1111111-11");
		EmpregadoComissionado obj3= new EmpregadoComissionado(1000, 0.05, "Joana", "Spliter", "11111111-23");
		EmpregadoComissionadoPlus obj4= new EmpregadoComissionadoPlus(1000, 20000, 0.03, "Luana", "Silva", "22222222-21");
		
		System.out.printf("%s Vencimento: %.2f\n", obj1, obj1.vencimentos());
		System.out.printf("%s Vencimento: %.2f\n", obj2, obj2.vencimentos());
		System.out.printf("%s Vencimento: %.2f\n", obj3, obj3.vencimentos());
		System.out.printf("%s Vencimento: %.2f\n", obj4, obj4.vencimentos());
		
		Empregado [] empregados= new Empregado[4];
		empregados[0]= obj1;
		empregados[1]= obj2;
		empregados[2]= obj3;
		empregados[3]= obj4;
		
		for(Empregado empregadoCorrente : empregados) {
			
			if (empregadoCorrente instanceof EmpregadoComissionadoPlus) {
				EmpregadoComissionadoPlus empregado= (EmpregadoComissionadoPlus) empregadoCorrente;
				empregado.setSalarioBase(1.10 * empregado.getSalarioBase());
			    System.out.printf("Novo Vencimento:%.2f\n", empregado.vencimentos());
			}//fim if
		}// fim for
		
	}

}
