package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Receta;
import es.safareyes.smartchefjdv.repositorios.IRecetaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IRecetaRepositoryTest {

    @Autowired
    private IRecetaRepository recetaRepository;

    @Test
    void consultarRecetas() {
        List<Receta> todas = recetaRepository.findAll();
    }
}