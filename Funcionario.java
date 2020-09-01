import java.util.Date;
public class Funcionario {

	private String nome;
	private Date dataAdmissao;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
		Date atual = new Date();
		if(dataAdmissao.after(atual)) {
			System.out.println("data inválida");
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
		if(salario < 700) {
			System.out.println("Salário não permitido");
		}
	}

	private static int indice = 0;
	private int identificador = ++indice;
	
	public int getIdentificador() {
		return identificador;
	}
		
}