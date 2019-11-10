package br.com.ifsp.ThanksGiven.service;

import br.com.ifsp.ThanksGiven.exception.UsuarioException;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    BCryptPasswordEncoder bCryptPasswordEncoder;

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastraUsuario(Usuario usuario) throws UsuarioException, NullPointerException {
        if (usuario == null)
            throw new NullPointerException();

        if (usuarioRepository.findUsuarioByEmail(usuario.getEmail()) != null)
            throw new UsuarioException("Usuário já existente");

        bCryptPasswordEncoder = new BCryptPasswordEncoder();

        usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }

    public Usuario buscaUsuario(Usuario usuario) throws UsuarioException {
        if (usuario == null)
            throw new NullPointerException();

        bCryptPasswordEncoder = new BCryptPasswordEncoder();

        Usuario retorno = usuarioRepository.findUsuarioByEmail(usuario.getEmail());
        if (retorno == null || !bCryptPasswordEncoder.matches(usuario.getSenha(), retorno.getSenha()))
            throw new UsuarioException("Email e/ou Senha inválido(s)");

        return retorno;
    }

}
