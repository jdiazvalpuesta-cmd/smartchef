package es.safareyes.smartchefjdv.modelos.entidades;

import es.safareyes.smartchefjdv.modelos.id.ListaCompraIngredienteId;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lista_compra_ingredientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListaCompraIngrediente {

    @EmbeddedId
    private ListaCompraIngredienteId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("listaId")
    @JoinColumn(name = "lista_id")
    private ListaCompra listaCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("ingredienteId")
    @JoinColumn(name = "ingrediente_id")
    private Ingrediente ingrediente;

    @Column(name = "cantidad", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidad;

    @Column(name = "comprado")
    private Boolean comprado = false;
}