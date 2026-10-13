package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.RecetaIngrediente;
import es.safareyes.smartchefjdv.modelos.id.RecetaIngredienteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecetaIngredienteRepository extends JpaRepository<RecetaIngrediente, RecetaIngredienteId> {
}