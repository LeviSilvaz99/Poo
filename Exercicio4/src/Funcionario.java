import java.util.Date;

public class Funcionario {

    private String nome;
    private Date dataAdmissao;
    private Double salario;
    private static int indice = 0;
    private int identificador = ++indice;



    public void estadoAtual(){
        System.out.println("-------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Data de Admissão: "+this.getDataAdmissao());
        System.out.println("Id: "+this.getIdentificador());
        System.out.println("-------------------");
    }



    public int getIdentificador(){
        return identificador;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        Date atual = new Date();
        if(dataAdmissao.after(atual)){
            System.out.println("DATA INVALIDA DE: "+this.getNome());
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
        if(salario<700){
            System.out.println("VALOR INVALIDO: "+this.getNome());
            this.salario = 0.0;
        }
    }
    public void tirarFerias(){
        this.tirarFerias(30);
    }
    public void tirarFerias(int dias){
        System.out.println("Voce vai tirar "+dias+" dias de ferias "+this.getNome());
    }
    private int hora, minuto, segundo;

    public void inicializar(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public void horario(){
        System.out.println("São: "+this.hora+" : "+this.minuto+ " : "+this.segundo);
    }

}
