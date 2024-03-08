package com.gestion.empleados.demo.service;

import com.gestion.empleados.demo.model.Pelicula;
import com.gestion.empleados.demo.repository.PeliculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    private final PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    public List<Pelicula> findAll() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula findById(Long id) {
        return peliculaRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        peliculaRepository.deleteById(id);

    }

    @Override
    public Pelicula update(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }
}
