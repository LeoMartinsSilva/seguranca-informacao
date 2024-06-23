package seguranca.informacao.sistema.model.usuario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioSeguroDto {
	private Long id;
	private String nome;
	private String nomeDeUsuario;
	private String senha;
}
