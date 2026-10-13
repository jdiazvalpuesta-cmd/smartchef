package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.UsuarioPreferencia;
import es.safareyes.smartchefjdv.repositorios.IUsuarioPreferenciaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IUsuarioPreferenciaRepositoryTest {

    @Autowired
    private IUsuarioPreferenciaRepository usuarioPreferenciaRepository;

    @Test
    void consultarUsuarioPreferencias() {
        List<UsuarioPreferencia> todas = usuarioPreferenciaRepository.findAll();
    }
}
