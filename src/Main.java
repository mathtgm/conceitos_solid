import br.com.alura.rh.service.ReajusteService;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Matheus", "cpf", Cargo.ASSISTENTE, new BigDecimal("2200.0"));
        ReajusteService reajusteService = new ReajusteService();

        reajusteService.reajustarSalarioDoFuncionario(funcionario, new BigDecimal("44.9"));

        System.out.println(funcionario.getSalario());


    }
}