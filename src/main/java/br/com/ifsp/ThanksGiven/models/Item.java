package br.com.ifsp.ThanksGiven.models;


import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String pathImagem;
    @OneToOne
    private Usuario doador;
    @OneToOne
    private Doacao doacao;


    public Item(String titulo, String descricao, String pathImagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pathImagem = pathImagem;
    }

    public Item() {
    }

    public String getPathImagem() {
        return pathImagem;
    }

    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    public Item(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Item(String titulo, String descricao, String pathImagem, Usuario doador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pathImagem = pathImagem;
        this.doador = doador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getDoador() {
        return doador;
    }

    public void setDoador(Usuario doador) {
        this.doador = doador;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", pathImagem='" + pathImagem + '\'' +
                ", doador=" + doador +
                ", doacao=" + doacao +
                '}';
    }

    public Item(String titulo, String descricao, String pathImagem, Usuario doador, Doacao doacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pathImagem = pathImagem;
        this.doador = doador;
        this.doacao = doacao;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
}
