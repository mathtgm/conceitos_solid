package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

    private DadosPessoais  dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
