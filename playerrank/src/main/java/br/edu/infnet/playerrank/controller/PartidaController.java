package br.edu.infnet.playerrank.controller;

import br.edu.infnet.playerrank.model.domain.Partida;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@SessionAttributes("user")
@Controller
public class PartidaController {
	@Autowired
	private PartidaService partidaService;

	@GetMapping(value = "/partida/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", partidaService.obterLista(usuario));

		return "partida/lista";
	}

	@GetMapping(value = "/partida")
	public String telaCadastro() {
		return "partida/cadastro";
	}

	@PostMapping(value = "/partida")
	public String incluir(@RequestParam Map<String,String> partidaData, @SessionAttribute("user") Usuario usuario) {
		Partida partida = new Partida();
		partida.setLocal(partidaData.get("local"));
		partida.setTime1(partidaData.get("time1"));
		partida.setTime2(partidaData.get("time2"));
		partida.setData(LocalDateTime.parse(partidaData.get("data") + " 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		partida.setUsuario(usuario);
		partidaService.incluir(partida);

		return "redirect:/partida/lista";
	}

	@GetMapping(value = "/partida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		partidaService.excluir(id);

		return "redirect:/partida/lista";
	}
}
