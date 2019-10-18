package br.com.ifsp.ThanksGiven.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemEntity {
    @javax.persistence.Id
    private Long Id;
    private String titulo;
    private String descricao;
    private Endereco endereco;



}
