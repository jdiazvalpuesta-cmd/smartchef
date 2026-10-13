package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.ColeccionReceta;
import es.safareyes.smartchefjdv.modelos.id.ColeccionRecetaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColeccionRecetaRepository extends JpaRepository<ColeccionReceta, ColeccionRecetaId> {
}
