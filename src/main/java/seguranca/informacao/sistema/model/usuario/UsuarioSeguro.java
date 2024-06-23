package seguranca.informacao.sistema.model.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuario_seguro")
@Entity(name = "usuario_seguro")
@EqualsAndHashCode(of = "id")
public class UsuarioSeguro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="nome_usuario")
	private String nomeDeUsuario;
	
	@Column(name="senha")
	private String senha;
}