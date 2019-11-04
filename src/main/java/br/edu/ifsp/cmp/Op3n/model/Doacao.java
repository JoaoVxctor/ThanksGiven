package br.edu.ifsp.cmp.Op3n.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.edu.ifsp.cmp.Op3n.model.Endereco;
import br.edu.ifsp.cmp.Op3n.model.Usuario;

@Entity
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Usuario doador;
    @OneToOne
    private Usuario receptor;
    @OneToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getDoador() {
        return doador;
    }

    public void setDoador(Usuario doador) {
        this.doador = doador;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Doacao(Usuario doador, Usuario receptor, Endereco endereco) {
        this.doador = doador;
        this.receptor = receptor;
        this.endereco = endereco;
    }
}
