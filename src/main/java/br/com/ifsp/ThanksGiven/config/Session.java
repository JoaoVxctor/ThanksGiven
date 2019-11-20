package br.com.ifsp.ThanksGiven.config;

import br.com.ifsp.ThanksGiven.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public final class Session {
    private static Session session;
    private Usuario usuario;

    public Session() {}

    public static Session getSession(){
        if (session == null)
            return new Session();
        return session;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
