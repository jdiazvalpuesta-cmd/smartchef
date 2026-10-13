package es.safareyes.smartchefjdv.modelos.entidades;

import es.safareyes.smartchefjdv.modelos.catalogos.EstadoLista;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "listas_compra")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListaCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", length = 20)
    private EstadoLista estado = EstadoLista.ABIERTA;
}
