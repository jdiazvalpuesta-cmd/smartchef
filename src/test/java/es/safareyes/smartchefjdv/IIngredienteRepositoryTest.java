package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Ingrediente;
import es.safareyes.smartchefjdv.repositorios.IIngredienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IIngredienteRepositoryTest {

    @Autowired
    private IIngredienteRepository ingredienteRepository;

    @Test
    void consultarIngredientes() {
        List<Ingrediente> todos = ingredienteRepository.findAll();
    }
}
