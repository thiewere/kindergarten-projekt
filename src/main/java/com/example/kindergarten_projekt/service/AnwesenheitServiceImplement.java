package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TZahlungsart;
import com.example.kindergarten_projekt.repository.TAnwesenheitRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AnwesenheitServiceImplement implements AnwesenheitService {

    public final TAnwesenheitRepository anwesenheitRepository;

    public AnwesenheitServiceImplement(TAnwesenheitRepository anwesenheitRepository) {
        this.anwesenheitRepository = anwesenheitRepository;
    }

    @Override
    public TAnwesenheit addAnwesenheit(TAnwesenheit anwesenheit) {
        return anwesenheitRepository.save(anwesenheit);
    }

    @Override
    public TAnwesenheit updateAnwesenheit(TAnwesenheit anwesenheit) {
        return anwesenheitRepository.save(anwesenheit);
    }

    @Override
    public List<TAnwesenheit> getAllAnwesenheit() {
        return anwesenheitRepository.findAll();
    }

    @Override
    public List<TAnwesenheit> getAnwesenheitByKinderId(int kinderId) {
        if (!anwesenheitRepository.existsById(kinderId)) {
            System.out.println("Anwesenheit mit der ID " + kinderId + " wurde nicht gefunden");
        }
        return anwesenheitRepository.findAllById(List.of(kinderId));
    }

    @Override
    public List<TAnwesenheit> getAnwesenheitByDatum(Date datum) {
        return anwesenheitRepository.getTAnwesenheitByAwDatum((datum).toLocalDate());
    }

    @Override
    public List<TAnwesenheit> updateAnwesenheitByKinderId(int kinderId) {
        return anwesenheitRepository.findAllById(List.of(kinderId));
    }

    @Override
    public List<TAnwesenheit> deleteAnwesenheitByKinderId(int kinderId) {
        if (anwesenheitRepository.existsById(kinderId)) {
            anwesenheitRepository.deleteById(kinderId);
            anwesenheitRepository.flush();
            System.out.println("Anwesenheit mit der KinderID:  " + kinderId + " wurde gelöscht");
        } else {
            System.out.println("Anwesenheit mit der KinderID: " + kinderId + " existiert nicht!");
        }
        return anwesenheitRepository.findAll();
    }


    @Override
    public List<TAnwesenheit> deleteAnwesenheitByDatum(Date datum) {
        return anwesenheitRepository.removeTAnwesenheitByAwDatum((datum).toLocalDate());
    }
}
