package com.tienda.domain;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Sirve para poder hacer los gets y sets
@Entity
@Table(name = "credito")
public class Credito implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")//Se usa para mapear con que campo de la BD y asi saber con que dato va
    private Long idCredito;
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }
    
    

}
