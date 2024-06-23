package seguranca.informacao.sistema.repository.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import seguranca.informacao.sistema.model.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("select u from Usuario u where lower(u.nomeDeUsuario) = lower(:nomeDeUsuario)")
	Usuario findByNomeDeUsuario(String nomeDeUsuario);
	
}
