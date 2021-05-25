package br.com.desafiozup.CadastroDeCarros.dto;

import java.time.LocalDate;

public class CadastroUsuarioDto {

    private String nome;

    private String email;

    private String cpf;

    private LocalDate data_nascimento;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }
}
