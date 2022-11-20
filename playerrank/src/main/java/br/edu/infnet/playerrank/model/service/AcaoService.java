package br.edu.infnet.playerrank.model.service;

import br.edu.infnet.playerrank.model.domain.Acao;
import br.edu.infnet.playerrank.model.domain.Gol;
import br.edu.infnet.playerrank.model.domain.Usuario;
import br.edu.infnet.playerrank.model.repository.AcaoRepository;
import br.edu.infnet.playerrank.model.repository.GolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AcaoService {
	@Autowired
	private AcaoRepository acaoRepository;

    public Optional<Acao> buscar(Integer id) { return acaoRepository.findById(id); }
}