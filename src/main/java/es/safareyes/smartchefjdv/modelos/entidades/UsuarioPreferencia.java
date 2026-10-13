package es.safareyes.smartchefjdv.modelos.entidades;

import es.safareyes.smartchefjdv.modelos.id.UsuarioPreferenciaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario_preferencias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioPreferencia {

    @EmbeddedId
    private UsuarioPreferenciaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("preferenciaId")
    @JoinColumn(name = "preferencia_id")
    private Preferencia preferencia;
}