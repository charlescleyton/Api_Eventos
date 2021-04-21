package com.eventosapp.repository;

import com.eventosapp.model.Convidado;
import com.eventosapp.model.Evento;

import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

    Iterable<Convidado> findByEvento(Evento evento);

    Convidado findByRg(String rg);
}
