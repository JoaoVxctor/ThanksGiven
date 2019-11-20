package br.com.ifsp.ThanksGiven.service;

import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {
    private DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public List<Doacao> getDoacoesAtivas(){
        return doacaoRepository.findAllByReceptorIsNullAndDisponivelIsTrue();
    }
}
