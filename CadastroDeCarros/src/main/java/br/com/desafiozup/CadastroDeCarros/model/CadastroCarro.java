package br.com.desafiozup.CadastroDeCarros.model;

import br.com.desafiozup.CadastroDeCarros.dto.CadastroCarroDto;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class CadastroCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String marca;

    @NotEmpty
    private String modelo;

    @NotEmpty
    private String ano;

    @Deprecated
    public CadastroCarro(){

    }

    public CadastroCarro(CadastroCarroDto cadastroCarroDto) {
        this.marca = cadastroCarroDto.getMarca();
        this.modelo = cadastroCarroDto.getModelo();
        this.ano = cadastroCarroDto.getAno();
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

}
