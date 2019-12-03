package br.com.ifsp.ThanksGiven.repository;

import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepository extends JpaRepository <Doacao,Long> {
    public List<Doacao> findAllByReceptorIsNullAndDisponivelIsTrue();
    public Doacao findDoacaoById(Long id);
    public Doacao findDoacaoByItem(Item item);
}
