
package es.safareyes.smartchefjdv;

import es.safareyes.smartchefjdv.modelos.entidades.Notificacion;
import es.safareyes.smartchefjdv.repositorios.INotificacionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class INotificacionRepositoryTest {

    @Autowired
    private INotificacionRepository notificacionRepository;

    @Test
    void consultarNotificaciones() {
        List<Notificacion> todas = notificacionRepository.findAll();
    }
}