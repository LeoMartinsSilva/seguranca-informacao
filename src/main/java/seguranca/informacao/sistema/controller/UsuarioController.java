package seguranca.informacao.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import seguranca.informacao.sistema.model.usuario.dto.UsuarioDto;
import seguranca.informacao.sistema.service.usuario.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/inserir")
	public ResponseEntity<UsuarioDto> inserir(@RequestBody UsuarioDto usuarioDto){
		UsuarioDto usuarioInserido = usuarioService.inserir(usuarioDto);
		return ResponseEntity.ok(usuarioInserido);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<UsuarioDto> atualizar(@RequestBody UsuarioDto usuarioDto){
		UsuarioDto usuarioAtualizado = usuarioService.atualizar(usuarioDto);
		return ResponseEntity.ok(usuarioAtualizado);
	}
	
	@GetMapping
	public ResponseEntity<UsuarioDto> buscar(){
		UsuarioDto usuarioLogado = usuarioService.getUsuarioLogado();
		return ResponseEntity.ok(usuarioLogado);
	}
}
