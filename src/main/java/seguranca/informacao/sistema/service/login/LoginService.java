package seguranca.informacao.sistema.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import seguranca.informacao.sistema.infra.security.TokenService;
import seguranca.informacao.sistema.model.dto.LoginValidadoDto;
import seguranca.informacao.sistema.model.usuario.Usuario;
import seguranca.informacao.sistema.model.usuario.UsuarioLogadoDto;
import seguranca.informacao.sistema.model.usuario.dto.UsuarioDto;
import seguranca.informacao.sistema.service.usuario.UsuarioSeguroService;
import seguranca.informacao.sistema.service.usuario.UsuarioService;

@Service
public class LoginService {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioSeguroService usuarioSeguroService;
	
	@Autowired
	private TokenService tokenService;
	
	public LoginValidadoDto login(String nomeDeUsuario, String senha) {

		try {
			
			Usuario usuario = usuarioService.buscarPorNomeDeUsuario(nomeDeUsuario);
			
			if(usuario.getSenha().equals(senha)) {
				
				UsuarioLogadoDto usuarioLogado = UsuarioLogadoDto.builder()
					.id(usuario.getId())
					.nome(usuario.getNome())
					.nomeDeUsuario(usuario.getNomeDeUsuario()).build();
				
				return LoginValidadoDto.builder()
						.idUsuario(usuario.getId())
						.token(tokenService.gerarToken(usuario))
						.build();
			}						
					
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return null;
	}
	
	
}
