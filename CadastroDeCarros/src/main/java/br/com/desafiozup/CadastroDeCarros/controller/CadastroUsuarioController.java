package br.com.desafiozup.CadastroDeCarros.controller;

import br.com.desafiozup.CadastroDeCarros.dto.CadastroUsuarioDto;
import br.com.desafiozup.CadastroDeCarros.model.CadastroUsuario;
import br.com.desafiozup.CadastroDeCarros.repository.CadastroUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cadastrousuario")
public class CadastroUsuarioController {

    CadastroUsuarioRepository cadastroUsuarioRepository;

    @Autowired
    public CadastroUsuarioController(CadastroUsuarioRepository cadastroUsuarioRepository){
        this.cadastroUsuarioRepository = cadastroUsuarioRepository;

    }

    @PostMapping
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody CadastroUsuarioDto cadastroUsuarioDto){

        CadastroUsuario cadastroUsuario = new CadastroUsuario(cadastroUsuarioDto);

        cadastroUsuarioRepository.save(cadastroUsuario);

        return ResponseEntity.status(HttpStatus.OK).build();

    }


}
