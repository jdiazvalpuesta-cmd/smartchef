package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.RecetaIngrediente;
import es.safareyes.smartchefjdv.repositorios.IRecetaIngredienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IRecetaIngredienteRepositoryTest {

    @Autowired
    private IRecetaIngredienteRepository recetaIngredienteRepository;

    @Test
    void consultarRecetaIngredientes() {
        List<RecetaIngrediente> todos = recetaIngredienteRepository.findAll();
    }
}
