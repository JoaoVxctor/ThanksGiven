package br.com.ifsp.ThanksGiven.repository;

import br.com.ifsp.ThanksGiven.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
