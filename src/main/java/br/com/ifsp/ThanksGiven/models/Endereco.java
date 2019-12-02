package br.com.ifsp.ThanksGiven.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String municipio;
    private String estado;
    private String cep;
    private String numero;
    private String completmento;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompletmento() {
        return completmento;
    }

    public void setCompletmento(String completmento) {
        this.completmento = completmento;
    }

    public Endereco(String rua, String municipio, String estado, String cep, String numero, String completmento) {
        this.rua = rua;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
        this.completmento = completmento;
    }

    public Endereco() {
    }
}
