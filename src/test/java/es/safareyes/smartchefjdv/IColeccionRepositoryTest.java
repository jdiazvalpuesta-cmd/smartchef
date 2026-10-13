package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Coleccion;
import es.safareyes.smartchefjdv.repositorios.IColeccionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IColeccionRepositoryTest {

    @Autowired
    private IColeccionRepository coleccionRepository;

    @Test
    void consultarColecciones() {
        List<Coleccion> todas = coleccionRepository.findAll();
    }
}
