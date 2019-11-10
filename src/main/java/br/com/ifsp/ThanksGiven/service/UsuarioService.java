package br.com.ifsp.ThanksGiven.service;

import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    public Usuario criaUsuario(Usuario usuario){
        if(usuario == null)
            throw new NullPointerException();
        if(usuarioRepository.findUsuarioByEmail(usuario.getEmail()) != null){
            throw new Exception("");
        }
    }
}
