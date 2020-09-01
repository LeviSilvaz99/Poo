import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.setNome("Levi");
        f1.setSalario(700.0);
        f1.setDataAdmissao(formatador.parse("01/05/2015"));
        f1.tirarFerias();
        f1.estadoAtual();
        f1.inicializar(20,10,5);
        f1.horario();

        f2.setNome("Nity");
        f2.setSalario(600.0);
        f2.setDataAdmissao(formatador.parse("01/05/2020"));
        f2.tirarFerias();
        f2.estadoAtual();
    }
}
