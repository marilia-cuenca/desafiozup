package br.com.desafiozup.CadastroDeCarros.model;

import br.com.desafiozup.CadastroDeCarros.dto.CadastroUsuarioDto;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
public class CadastroUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @NotEmpty
    @CPF
    @Column(unique = true, nullable = false)
    private String cpf;

    @NotEmpty
    private LocalDate data_nascimento;

    @Deprecated
    public CadastroUsuario(){

    }

    public CadastroUsuario(CadastroUsuarioDto cadastroUsuarioDto) {
        this.nome = cadastroUsuarioDto.getNome();
        this.email = cadastroUsuarioDto.getEmail();
        this.cpf = cadastroUsuarioDto.getCpf();
        this.data_nascimento = cadastroUsuarioDto.getData_nascimento();
    }

    public Long getId() {

        return id;
    }

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
