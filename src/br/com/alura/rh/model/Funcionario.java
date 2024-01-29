package br.com.alura.rh.model;

import br.com.alura.rh.exception.ValidacaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private LocalDate dataUltimoAjuste;

    public Funcionario() {}

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
