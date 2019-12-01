package br.com.ifsp.ThanksGiven.models;


import javax.persistence.*;
import java.util.Optional;

@Entity
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Usuario doador;
    @OneToOne
    private Usuario receptor;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Endereco endereco;
    private boolean disponivel;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Item item;

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Doacao(Usuario doador, Usuario receptor, Endereco endereco, boolean disponivel, Item item) {
        this.doador = doador;
        this.receptor = receptor;
        this.endereco = endereco;
        this.disponivel = disponivel;
        this.item = item;
    }

    public Doacao() {
    }

    public Doacao(Usuario doador, Endereco endereco, Item item) {
        this.doador = doador;
        this.endereco = endereco;
        this.disponivel = true;
        this.item = item;
    }
}
