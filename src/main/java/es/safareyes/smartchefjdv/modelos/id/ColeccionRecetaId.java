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
public class ColeccionRecetaId implements Serializable {

    @Column(name = "coleccion_id")
    private Long coleccionId;

    @Column(name = "receta_id")
    private Long recetaId;
}
