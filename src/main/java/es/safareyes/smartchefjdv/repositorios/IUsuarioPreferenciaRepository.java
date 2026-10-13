package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.UsuarioPreferencia;
import es.safareyes.smartchefjdv.modelos.id.UsuarioPreferenciaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioPreferenciaRepository extends JpaRepository<UsuarioPreferencia, UsuarioPreferenciaId> {
}
