package br.com.ifsp.ThanksGiven.Entity;

public class Endereco {
    private String rua;
    private String logradouro;
    private String cep;
    private String numero;
    private String completmento;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    public Endereco(String rua, String logradouro, String cep, String numero, String completmento) {
        this.rua = rua;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.completmento = completmento;
    }
}
