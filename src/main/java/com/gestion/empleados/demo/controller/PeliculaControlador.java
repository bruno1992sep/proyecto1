package com.gestion.empleados.demo.controller;

import com.gestion.empleados.demo.model.Pelicula;
import com.gestion.empleados.demo.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gestion.empleados.demo.repository.PeliculaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PeliculaControlador {

    private final PeliculaService peliculaService;

    public PeliculaControlador(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @Autowired
    private PeliculaRepository repository;

    @PostMapping("/guardar")
    public Pelicula save(@RequestBody Pelicula pelicula) {
        return peliculaService.save(pelicula);
    }

    @GetMapping("/peliculas")
    public List<Pelicula> findAll() {
        return peliculaService.findAll();
    }


    @GetMapping("/buscarporid/{id}")
    public Pelicula findById(@PathVariable Long id) {
        return peliculaService.findById(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteByhId(@PathVariable Long id) {
        peliculaService.deleteById(id);
    }

    @PutMapping("actualizar")
    public Pelicula update(@RequestBody Pelicula pelicula){
        Pelicula peliculadb = peliculaService.findById(pelicula.getId());
        peliculadb.setNombre(pelicula.getNombre());
        peliculadb.setDuracion(pelicula.getDuracion());
        return peliculaService.update(peliculadb);
    }
}