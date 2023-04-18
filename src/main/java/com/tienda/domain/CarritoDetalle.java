package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name="carrito_detalle")
public class CarritoDetalle implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDatelle;
    private Long idCarrito;
    
    @JoinColumn(name="id_articulo", referencedColumnName= "id_articulo")
    @ManyToOne
    private Articulo articulo;
    private Long precio;
    private Long cantidad;

    public CarritoDetalle() {
    }

    public CarritoDetalle(Long idCarrito, Articulo articulo, Long precio, Long cantidad) {
        this.idCarrito = idCarrito;
        this.articulo = articulo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
}

