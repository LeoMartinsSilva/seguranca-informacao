package seguranca.informacao.sistema.service.usuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import seguranca.informacao.sistema.model.usuario.Usuario;
import seguranca.informacao.sistema.model.usuario.dto.UsuarioDto;
import seguranca.informacao.sistema.repository.usuario.UsuarioRepository;
import seguranca.informacao.sistema.service.usuario.mapper.UsuarioMapper;

@Service
@AllArgsConstructor
public class UsuarioSeguroService {

	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioDto buscarPorId(Long id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		if(optional.isPresent()) {
			return usuarioMapper.toDto(optional.get());
		}
		return null;
	}
	
	public UsuarioDto inserir(UsuarioDto usuarioDto) {
		
		if(usuarioDto.getId() != null) {
			throw new RuntimeException("Não é possível inserir um usuário com ID predefinido");
		}
		
		Usuario usuario = usuarioMapper.toEntity(usuarioDto);
		
		return usuarioMapper.toDto(usuarioRepository.save(usuario));
	}
	
}
