package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFotoRepository extends JpaRepository<Foto, Long> {
}
