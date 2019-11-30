package br.com.ifsp.ThanksGiven.models;


import javax.persistence.*;

@Entity
public class Requisicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Usuario doador;
    @OneToOne
    private Usuario receptor;
    @OneToOne
    private Doacao doacao;
    private boolean resposta;

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

    public Usuario getDoacao() {
        return doacao;
    }

    public void setDoacao(Usuario doacao) {
        this.doacao = doacao;
    }

    public Boolean getResposta() {
        return resposta;
    }

    public void setResposta(Boolean resposta) {
        this.resposta = resposta;
    }

    public Doacao(Usuario doador, Usuario receptor, Doacao doacao) {
        this.doador = doador;
        this.receptor = receptor;
        this.endereco = endereco;
        this.disponivel = disponivel;
        this.resposta = Null;
    }

}
