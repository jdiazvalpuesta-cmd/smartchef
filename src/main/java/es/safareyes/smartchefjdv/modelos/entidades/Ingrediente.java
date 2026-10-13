package es.safareyes.smartchefjdv.modelos.entidades;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ingredientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(name = "vegetariano", nullable = false)
    private Boolean vegetariano = false;

    @Column(name = "sin_gluten", nullable = false)
    private Boolean sinGluten = false;

    @Column(name = "tipo_cantidad", nullable = false, length = 20)
    private String tipoCantidad;

    @Column(name = "calorias", nullable = false)
    private Integer calorias;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;
}
