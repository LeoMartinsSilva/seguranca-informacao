package seguranca.informacao.sistema.model.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioLogadoDto {
	private Long id;
	private String nome;
	private String nomeDeUsuario;
}
