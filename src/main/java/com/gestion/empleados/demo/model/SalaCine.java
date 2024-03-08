package com.gestion.empleados.demo.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="sala_cine")
public class SalaCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private Long idSala;
    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "estado", length = 60, nullable = false)
    private int estado;

    /*@ManyToMany(mappedBy = "salacines")
    private Set<Pelicula> peliculas = new HashSet<>();*/

    @OneToMany(mappedBy = "salaCine")
    private Set<pelicula_salacine> peliculaSalacines= new HashSet<>();


    public SalaCine(Long idSala, String nombre, int estado) {
        super();
        this.idSala = idSala;
        this.nombre = nombre;
        this.estado = estado;
    }

    public SalaCine() {
    }

    public Long getIdSala() {
        return idSala;
    }

    public void setIdSala(Long idSala) {
        this.idSala = idSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
