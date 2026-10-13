package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.ListaCompra;
import es.safareyes.smartchefjdv.repositorios.IListaCompraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IListaCompraRepositoryTest {

    @Autowired
    private IListaCompraRepository listaCompraRepository;

    @Test
    void consultarListasCompra() {
        List<ListaCompra> todas = listaCompraRepository.findAll();
    }
}
