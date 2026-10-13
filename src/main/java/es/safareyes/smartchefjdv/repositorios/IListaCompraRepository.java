package es.safareyes.smartchefjdv.repositorios;

import es.safareyes.smartchefjdv.modelos.entidades.ListaCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListaCompraRepository extends JpaRepository<ListaCompra, Long> {
}
