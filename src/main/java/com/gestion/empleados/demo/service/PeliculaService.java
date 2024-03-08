package com.gestion.empleados.demo.service;

import com.gestion.empleados.demo.model.Pelicula;

import java.util.List;

public interface PeliculaService {
    Pelicula save(Pelicula pelicula);
    List<Pelicula> findAll();
    Pelicula findById(Long id);

    void deleteById(Long id);

    Pelicula update(Pelicula pelicula);
}
