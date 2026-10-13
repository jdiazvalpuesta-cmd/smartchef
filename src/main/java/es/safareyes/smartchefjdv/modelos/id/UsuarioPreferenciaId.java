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
public class UsuarioPreferenciaId implements Serializable {

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "preferencia_id")
    private Long preferenciaId;
}
