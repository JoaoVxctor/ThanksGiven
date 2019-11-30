package br.com.ifsp.ThanksGiven.models;


import javax.persistence.*;

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
    private boolean disponivel;
    private String produto;
    private String descricao;
    

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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Doacao() {
    }

    public Doacao(Usuario doador, Usuario receptor, Endereco endereco, boolean disponivel) {
        this.doador = doador;
        this.receptor = receptor;
        this.endereco = endereco;
        this.disponivel = disponivel;
    }

    public Doacao(Usuario doador, String produto, String descricao, Endereco endereco, boolean disponivel) {
        this.doador = doador;
        this.produto = produto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.disponivel = disponivel;
    }
}
