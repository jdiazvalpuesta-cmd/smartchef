package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Usuario;
import es.safareyes.smartchefjdv.repositorios.IUsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IUsuarioRepositoryTest {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Test
    void consultarUsuarios() {
        List<Usuario> todos = usuarioRepository.findAll();
    }
}
