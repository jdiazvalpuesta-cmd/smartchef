package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Cocina;
import es.safareyes.smartchefjdv.repositorios.ICocinaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ICocinaRepositoryTest {

    @Autowired
    private ICocinaRepository cocinaRepository;

    @Test
    void consultarCocinas() {
        List<Cocina> todas = cocinaRepository.findAll();
    }
}
