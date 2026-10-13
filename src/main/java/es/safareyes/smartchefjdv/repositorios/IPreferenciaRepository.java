package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.Preferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreferenciaRepository extends JpaRepository<Preferencia, Long> {
}
