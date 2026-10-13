package es.safareyes.smartchefjdv.modelos.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ListaCompraIngredienteId implements Serializable {

    @Column(name = "lista_id")
    private Long listaId;

    @Column(name = "ingrediente_id")
    private Long ingredienteId;
}
