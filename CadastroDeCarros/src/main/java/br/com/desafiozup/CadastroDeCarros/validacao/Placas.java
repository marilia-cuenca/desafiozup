package br.com.desafiozup.CadastroDeCarros.validacao;

import br.com.desafiozup.CadastroDeCarros.model.CadastroCarro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "placaFipe", url = "https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3")
public interface Placas {

    @GetMapping
    ConsultaPlaca consulta(@RequestParam("anos") String ano);

    class ConsultaPlacaRequest {

        private String marca;

        private String modelo;

        private String ano;

        public ConsultaPlacaRequest(CadastroCarro cadastroCarro) {

            this.marca = cadastroCarro.getMarca();
            this.modelo = cadastroCarro.getModelo();
            this.ano = cadastroCarro.getAno();

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

    class ConsultaPlaca{

        private String nome;

        private String codigo;

        public ConsultaPlaca(String nome, String codigo) {
            this.nome = nome;
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public String getCodigo() {
            return codigo;
        }
    }

}