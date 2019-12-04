package br.com.ifsp.ThanksGiven.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public Requisicao(Usuario doador, Usuario receptor, Doacao doacao, boolean resposta) {
        this.doador = doador;
        this.receptor = receptor;
        this.doacao = doacao;
        this.resposta = resposta;
    }
}
