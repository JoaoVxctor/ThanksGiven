package br.com.ifsp.ThanksGiven.models;

public class DoacaoDTO {
    private String doadorNome;
    private String receptorNome;
    private Boolean disponibilidade;
    private String tituloDoacao;
    private String descricaoDoacao;

    public DoacaoDTO(Doacao doacao) {
        this.doadorNome = doacao.getDoador().getNomeCompleto();
        if(doacao.getReceptor() != null)
            this.receptorNome = doacao.getReceptor().getNomeCompleto();
        this.disponibilidade = doacao.isDisponivel();
        this.tituloDoacao = doacao.getItem().getTitulo();
        this.descricaoDoacao = doacao.getItem().getDescricao();
    }

    public String getDoadorNome() {
        return doadorNome;
    }

    public void setDoadorNome(String doadorNome) {
        this.doadorNome = doadorNome;
    }

    public String getReceptorNome() {
        return receptorNome;
    }

    public void setReceptorNome(String receptorNome) {
        this.receptorNome = receptorNome;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTituloDoacao() {
        return tituloDoacao;
    }

    public void setTituloDoacao(String tituloDoacao) {
        this.tituloDoacao = tituloDoacao;
    }

    public String getDescricaoDoacao() {
        return descricaoDoacao;
    }

    public void setDescricaoDoacao(String descricaoDoacao) {
        this.descricaoDoacao = descricaoDoacao;
    }
}
