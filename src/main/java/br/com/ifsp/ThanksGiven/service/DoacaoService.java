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

    public Doacao cadastraDoacao(Doacao doacao) throws NullPointerException {
        if (doacao == null)
            throw new NullPointerException();

        return doacaoRepository.save(doacao);
    }

    public Doacao buscaDoacao(Doacao doacao) throws NullPointerException {
        if (doacao == null)
            throw new NullPointerException();
    
        Doacao retorno = doacaoRepository.findDoacaoById(doacao.getId());

        return retorno;
    }
    
    public Doacao desativaDoacao(Doacao doacao) throws NullPointerException {
        if (doacao == null)
            throw new NullPointerException();
        Doacao desativar = this.buscaDoacao(doacao);
        desativar.setDisponivel(false);
        return doacaoRepository.save(desativar);
    }

    public Doacao ativaDoacao(Doacao doacao) throws NullPointerException {
        if (doacao == null)
            throw new NullPointerException();
        Doacao ativar = this.buscaDoacao(doacao);
        ativar.setDisponivel(true);
        return doacaoRepository.save(ativar);
    }

    /*
    public boolean requereDoacao(Doacao doacao) throws NullPointerException {
        if (doacao == null)
            throw new NullPointerException();
        this.desativaDoacao(doacao);

        return doacaoRepository.requerirDoacao(doacao);
    }
    */

}
