package br.com.desafiozup.CadastroDeCarros.controller;

import br.com.desafiozup.CadastroDeCarros.dto.CadastroCarroDto;
import br.com.desafiozup.CadastroDeCarros.model.CadastroCarro;
import br.com.desafiozup.CadastroDeCarros.repository.CadastroCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cadastrocarro")
public class CadastroCarroController {

    CadastroCarroRepository cadastroCarroRepository;

    @Autowired
    public CadastroCarroController(CadastroCarroRepository cadastroCarroRepository) {
        this.cadastroCarroRepository = cadastroCarroRepository;

    }

    @PostMapping
    public ResponseEntity<?> criarCarro(@Valid @RequestBody CadastroCarroDto cadastroCarroDto) {

        CadastroCarro cadastroCarro = new CadastroCarro(cadastroCarroDto);

        cadastroCarroRepository.save(cadastroCarro);

        return ResponseEntity.status(HttpStatus.OK).build();

    }

    @GetMapping("/rodizio")
    public ResponseEntity<?> pesquisaRodizio(@Valid @RequestBody CadastroCarroDto cadastroCarroDto) {

        List<CadastroCarro> rodizio = cadastroCarroRepository.findAno(cadastroCarroDto.getAno());

        for (int i = 0; i < rodizio.size(); i++) {

            var dia = rodizio.get(i).getAno();
            if (dia.substring(3).equals("0")) {
                var mensagem = "segunda-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("1")) {
                var mensagem = "segunda-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("2")) {
                var mensagem = "terça-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("3")) {
                var mensagem = "terça-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("4")) {
                var mensagem = "quarta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("5")) {
                var mensagem = "quarta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("6")) {
                var mensagem = "quinta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("7")) {
                var mensagem = "quinta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("8")) {
                var mensagem = "sexta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);

            }
            if (dia.substring(3).equals("9")) {
                var mensagem = "sexta-feira";
                return ResponseEntity.status(HttpStatus.OK).body(dia + mensagem);
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

