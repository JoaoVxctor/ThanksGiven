package br.com.ifsp.ThanksGiven.exception;

public class UsuarioException extends Exception {
    public String usuarioExistente(){
        return "Usuário já existente";
    }
}
