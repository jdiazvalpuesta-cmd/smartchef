package es.safareyes.smartchefjdv.modelos.entidades;

import es.safareyes.smartchefjdv.modelos.id.ColeccionRecetaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coleccion_recetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColeccionReceta {

    @EmbeddedId
    private ColeccionRecetaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("coleccionId")
    @JoinColumn(name = "coleccion_id")
    private Coleccion coleccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("recetaId")
    @JoinColumn(name = "receta_id")
    private Receta receta;
}
