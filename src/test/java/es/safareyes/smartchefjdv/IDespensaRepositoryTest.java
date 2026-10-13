
package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Despensa;
import es.safareyes.smartchefjdv.repositorios.IDespensaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IDespensaRepositoryTest {

    @Autowired
    private IDespensaRepository despensaRepository;

    @Test
    void consultarDespensas() {
        List<Despensa> todas = despensaRepository.findAll();
    }
}