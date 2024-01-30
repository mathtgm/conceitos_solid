package br.com.alura.rh.model;

import br.com.alura.rh.exception.ValidacaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {


    private DadosPessoais dadosPessoais;
    private BigDecimal salario;
    private LocalDate dataUltimoAjuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
        this.salario = salario;
    }

    public void atualizarSalario(BigDecimal novoSalario) {
        this.salario = novoSalario;
        this.dataUltimoAjuste = LocalDate.now();
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public LocalDate getDataUltimoAjuste() {
        return dataUltimoAjuste;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }
}
