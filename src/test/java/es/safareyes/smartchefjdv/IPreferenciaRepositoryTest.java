package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Preferencia;
import es.safareyes.smartchefjdv.repositorios.IPreferenciaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IPreferenciaRepositoryTest {

    @Autowired
    private IPreferenciaRepository preferenciaRepository;

    @Test
    void consultarPreferencias() {
        List<Preferencia> todas = preferenciaRepository.findAll();
    }
}
