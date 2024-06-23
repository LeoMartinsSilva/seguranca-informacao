package seguranca.informacao.sistema.repository.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import seguranca.informacao.sistema.model.usuario.UsuarioSeguro;

public interface UsuarioSeguroRepository extends JpaRepository<UsuarioSeguro, Long>{

}
