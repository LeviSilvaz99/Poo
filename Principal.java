import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {


	public static void main(String[] args) throws ParseException {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		funcionario1.setNome("Bruno");
		funcionario1.setDataAdmissao(formatador.parse("20/07/2006"));
		funcionario1.setSalario(1200.00);
		
		funcionario2.setNome("Thiago");
		funcionario2.setDataAdmissao(formatador.parse("20/07/2008"));
		funcionario2.setSalario(1100.00);
		
		funcionario3.setNome("Paulim");
		funcionario3.setDataAdmissao(formatador.parse("22/05/2019"));
		funcionario3.setSalario(200.00);
	
		System.out.println(funcionario1.getIdentificador());
		System.out.println(funcionario2.getIdentificador());
		System.out.println(funcionario3.getIdentificador());
		
	}
	
}
