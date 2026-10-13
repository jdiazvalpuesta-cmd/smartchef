package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.ColeccionReceta;
import es.safareyes.smartchefjdv.repositorios.IColeccionRecetaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IColeccionRecetaRepositoryTest {

    @Autowired
    private IColeccionRecetaRepository coleccionRecetaRepository;

    @Test
    void consultarColeccionRecetas() {
        List<ColeccionReceta> todas = coleccionRecetaRepository.findAll();
    }
}
