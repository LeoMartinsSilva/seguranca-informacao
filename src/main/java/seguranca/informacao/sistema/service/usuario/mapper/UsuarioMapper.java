package seguranca.informacao.sistema.service.usuario.mapper;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import seguranca.informacao.sistema.model.usuario.Usuario;
import seguranca.informacao.sistema.model.usuario.dto.UsuarioDto;
import seguranca.informacao.sistema.service.mapper.AbstractMapper;

@Component
@ComponentScan
public class UsuarioMapper extends AbstractMapper<UsuarioDto, Usuario> {

	@Override
	public UsuarioDto toDto(Usuario entity) {
		return UsuarioDto.builder()
				.id(entity.getId())
				.nome(entity.getNome())
				.nomeDeUsuario(entity.getNomeDeUsuario())
				.senha(entity.getSenha()).build();
	}

	@Override
	public Usuario toEntity(UsuarioDto dto) {
		return Usuario.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.nomeDeUsuario(dto.getNomeDeUsuario())
				.senha(dto.getSenha()).build();
	}

	
	
}
