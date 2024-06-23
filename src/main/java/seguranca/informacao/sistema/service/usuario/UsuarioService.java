package seguranca.informacao.sistema.service.usuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import seguranca.informacao.sistema.model.usuario.Usuario;
import seguranca.informacao.sistema.model.usuario.dto.UsuarioDto;
import seguranca.informacao.sistema.repository.usuario.UsuarioRepository;
import seguranca.informacao.sistema.service.usuario.mapper.UsuarioMapper;

@Service
@AllArgsConstructor
public class UsuarioService {

	@Autowired
	private UsuarioMapper usuarioMapper;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioDto buscarPorId(Long id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		if (optional.isPresent()) {
			return usuarioMapper.toDto(optional.get());
		}
		return null;
	}

	public Usuario buscarPorNomeDeUsuario(String nomeDeUsuario) {
		Usuario usuario = usuarioRepository.findByNomeDeUsuario(nomeDeUsuario);
		return usuario;
	}

	public UsuarioDto inserir(UsuarioDto usuarioDto) {

		if (usuarioDto.getId() != null) {
			throw new RuntimeException("Não é possível inserir um usuário com ID predefinido");
		}
		if(buscarPorNomeDeUsuario(usuarioDto.getNomeDeUsuario())!=null) {
			throw new RuntimeException("Nome de usuário em uso");
		}

		Usuario usuario = usuarioMapper.toEntity(usuarioDto);

		return usuarioMapper.toDto(usuarioRepository.save(usuario));
	}

	public UsuarioDto atualizar(UsuarioDto usuarioDto) {
		UsuarioDto usuariobanco = buscarPorId(usuarioDto.getId());
		if(!usuariobanco.getNomeDeUsuario().toLowerCase().equals(usuarioDto.getNomeDeUsuario().toLowerCase())) {
			throw new RuntimeException("Não é possível alterar o nome de usuário");
		}
		
		Usuario usuario = usuarioMapper.toEntity(usuarioDto);
		return usuarioMapper.toDto(usuarioRepository.save(usuario));
	}

	public UsuarioDto getUsuarioLogado() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            return usuarioMapper.toDto(buscarPorNomeDeUsuario(userDetails.getUsername()));
        } 
        return null;
	}

}
