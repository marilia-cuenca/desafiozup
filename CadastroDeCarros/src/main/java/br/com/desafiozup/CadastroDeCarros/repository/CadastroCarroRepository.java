package br.com.desafiozup.CadastroDeCarros.repository;

import br.com.desafiozup.CadastroDeCarros.model.CadastroCarro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroCarroRepository extends JpaRepository<CadastroCarro, Long> {

    List<CadastroCarro> findAno (String ano);

}
