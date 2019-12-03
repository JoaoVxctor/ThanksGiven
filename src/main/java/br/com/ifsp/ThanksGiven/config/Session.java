package br.com.ifsp.ThanksGiven.config;

import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public final class Session {
    private static Session session;
    private static Usuario usuario;
    private static Doacao doacao;


    public Session() {
    }

    public static Session getSession() {
        if (session == null)
            return new Session();
        return session;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario param) {
        usuario = param;
    }

    public static Doacao getDoacao() {
        return doacao;
    }

    public static void setDoacao(Doacao param) {
        doacao = param;
    }
}