package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Paso;
import es.safareyes.smartchefjdv.repositorios.IPasoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IPasoRepositoryTest {

    @Autowired
    private IPasoRepository pasoRepository;

    @Test
    void consultarPasos() {
        List<Paso> todos = pasoRepository.findAll();
    }
}
