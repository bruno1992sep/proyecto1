package com.gestion.empleados.demo.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "duracion", length = 60, nullable = false)
    private int duracion;

    /*@ManyToMany
    @JoinTable(name = "pelicula_salacine",
            joinColumns = @JoinColumn(name = "id_pelicula"),
            inverseJoinColumns = @JoinColumn(name = "id_sala"))
    private Set<SalaCine> salacines = new HashSet<>();*/

    @OneToMany(mappedBy = "pelicula")
    private Set<pelicula_salacine> peliculaSalacines= new HashSet<>();


    public Pelicula() {

    }

    public Pelicula(Long id, String nombre, int duracion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setDuracion(int duracion) { this.duracion = duracion; }

    public int getDuracion() {
        return duracion;
    }

}