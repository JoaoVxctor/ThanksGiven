package br.com.ifsp.ThanksGiven.repository;

import br.com.ifsp.ThanksGiven.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    public Usuario findUsuarioByEmail (String email);
    public Usuario findUsuarioByEmailAndSenha (String email, String senha);
}
