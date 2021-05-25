package br.com.desafiozup.CadastroDeCarros.repository;

import br.com.desafiozup.CadastroDeCarros.model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long> {

}
