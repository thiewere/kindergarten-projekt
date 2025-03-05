package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.repository.TAnwesenheitRepository;
import com.example.kindergarten_projekt.service.AnwesenheitService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
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
    public List<TAnwesenheit> getAnwesenheitByDatum(LocalDate datum) {
        return anwesenheitRepository.findTAnwesenheitByAwDatum(datum);
    }

    @Override
    public TAnwesenheit updateAnwesenheit(TAnwesenheit anwesenheit, Integer id) {
        return anwesenheitRepository.findById(id)
                .map(aw -> {
                    aw.setAwDatum(anwesenheit.getAwDatum());
                    aw.setAwKind(anwesenheit.getAwKind());
                    aw.setAbgeholtUhr(anwesenheit.getAbgeholtUhr());
                    return anwesenheitRepository.save(aw);
                })
                .orElseThrow(() -> new RuntimeException("Anwesenheit mit der ID: " + id + " wurde nicht gefunden!"));

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
    public List<TAnwesenheit> deleteAnwesenheitByDatum(LocalDate datum) {
        return anwesenheitRepository.removeTAnwesenheitByAwDatum(datum);
    }
}
