package br.com.alura.rh.service.promocao;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {

        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();

        if(cargoAtual.equals(Cargo.GERENTE)) {
            throw new ValidacaoException("Gerente não podem ser promovidos");
        }

        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta");
        }
    }
}
