package br.com.ifsp.ThanksGiven.service;

import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.models.Item;
import br.com.ifsp.ThanksGiven.models.DoacaoDTO;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoacaoService {

    private DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public List<Item> getDoacoesAtivas(Usuario usuario) {
        List<Item> itens = new ArrayList<>();
        doacaoRepository.findAllByReceptorIsNullAndDisponivelIsTrueAndDoadorIsNot(usuario).forEach(doacao -> itens.add(doacao.getItem()));
        return itens;
    }

    @Transactional
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

    public Doacao buscaDoacaoPorItem(Item item) {
        return doacaoRepository.findDoacaoByItem(item);
    }

    public List<DoacaoDTO> buscaMinhasDoacoes(Usuario usuario) {
        List<Doacao> allByDoador = doacaoRepository.findAllByDoador(usuario);
        List<DoacaoDTO> doacaoDTOS = new ArrayList<>();

        allByDoador.forEach(x-> doacaoDTOS.add(new DoacaoDTO(x)));
        return doacaoDTOS;
    }

    public List<DoacaoDTO> buscaMinhasAquisicoes(Usuario usuario){
        List<Doacao> allByDoador = doacaoRepository.findAllByReceptor(usuario);
        List<DoacaoDTO> doacaoDTOS = new ArrayList<>();

        allByDoador.forEach(x-> doacaoDTOS.add(new DoacaoDTO(x)));
        return doacaoDTOS;
    }

    public Doacao solicitarDoacao(Doacao doacao, Usuario usuario){
        doacao.setReceptor(usuario);
        return doacaoRepository.save(doacao);
    }

}
