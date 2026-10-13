package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.ListaCompraIngrediente;
import es.safareyes.smartchefjdv.modelos.id.ListaCompraIngredienteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListaCompraIngredienteRepository extends JpaRepository<ListaCompraIngrediente, ListaCompraIngredienteId> {
}
