package seguranca.informacao.sistema.service.usuario.mapper;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import seguranca.informacao.sistema.model.usuario.UsuarioSeguro;
import seguranca.informacao.sistema.model.usuario.dto.UsuarioSeguroDto;
import seguranca.informacao.sistema.service.mapper.AbstractMapper;

@Component
@ComponentScan
public class UsuarioSeguroMapper extends AbstractMapper<UsuarioSeguroDto, UsuarioSeguro> {

	@Override
	public UsuarioSeguroDto toDto(UsuarioSeguro entity) {
		return UsuarioSeguroDto.builder()
				.id(entity.getId())
				.nome(entity.getNome())
				.nomeDeUsuario(entity.getNomeDeUsuario())
				.senha(entity.getSenha()).build();
	}

	@Override
	public UsuarioSeguro toEntity(UsuarioSeguroDto dto) {
		return UsuarioSeguro.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.nomeDeUsuario(dto.getNomeDeUsuario())
				.senha(dto.getSenha()).build();
	}

	
	
}
