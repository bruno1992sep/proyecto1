package com.gestion.empleados.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class pelicula_salacine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pelicula pelicula;

    @ManyToOne
    private SalaCine salaCine;
    @Temporal(TemporalType.DATE)
    private Date fecha_publicacion;

    @Temporal(TemporalType.DATE)
    private Date fecha_fin;

    public pelicula_salacine() {
    }

    public pelicula_salacine(Long id, Pelicula pelicula, SalaCine salaCine, Date fecha_publicacion, Date fecha_fin) {
        this.id = id;
        this.pelicula = pelicula;
        this.salaCine = salaCine;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_fin = fecha_fin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public SalaCine getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(SalaCine salaCine) {
        this.salaCine = salaCine;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
