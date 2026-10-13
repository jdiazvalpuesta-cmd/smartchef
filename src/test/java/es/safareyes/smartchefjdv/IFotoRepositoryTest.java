package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Foto;
import es.safareyes.smartchefjdv.repositorios.IFotoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IFotoRepositoryTest {

    @Autowired
    private IFotoRepository fotoRepository;

    @Test
    void consultarFotos() {
        List<Foto> todas = fotoRepository.findAll();
    }
}
