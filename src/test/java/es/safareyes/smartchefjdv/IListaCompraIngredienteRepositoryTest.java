package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.ListaCompraIngrediente;
import es.safareyes.smartchefjdv.repositorios.IListaCompraIngredienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IListaCompraIngredienteRepositoryTest {

    @Autowired
    private IListaCompraIngredienteRepository listaCompraIngredienteRepository;

    @Test
    void consultarListaCompraIngredientes() {
        List<ListaCompraIngrediente> todos = listaCompraIngredienteRepository.findAll();
    }
}
