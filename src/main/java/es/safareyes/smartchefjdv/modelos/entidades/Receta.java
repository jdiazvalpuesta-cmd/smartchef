package es.safareyes.smartchefjdv.modelos.entidades;

import es.safareyes.smartchefjdv.modelos.catalogos.Dificultad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "tiempo", nullable = false)
    private Integer tiempo;

    @Column(name = "raciones", nullable = false)
    private Integer raciones;

    @Enumerated(EnumType.STRING)
    @Column(name = "dificultad", nullable = false, length = 20)
    private Dificultad dificultad;

    @Column(name = "calorias", nullable = false)
    private Integer calorias;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @Column(name = "activa")
    private Boolean activa = true;
}