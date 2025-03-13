package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TKinder;
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
    public List<TAnwesenheit> getAllAnwesenheit() {
        return anwesenheitRepository.findAll();
    }


    @Override
    public List<TAnwesenheit> getAnwesenheitByKinder(TKinder awKind) {
        return anwesenheitRepository.getTAnwesenheitByAwKind(awKind);
    }


    @Override
    public List<TAnwesenheit> getAnwesenheitByDatum(LocalDate datum) {
        return anwesenheitRepository.findTAnwesenheitByAwDatum(datum);
    }


    @Override
    public String deleteAnwesenheitById(Long id) {
        if(anwesenheitRepository.existsById(id)) {
            anwesenheitRepository.deleteById(id);
            return "Anwesenheit mit der ID: " + id + " wurde gelöscht!";
        }
        return "Anwesenheit mit der ID: " + id + " wurde nicht gefunden!";
    }


    @Override
    public TAnwesenheit updateAnwesenheit(TAnwesenheit anwesenheit, Long id) {
        return anwesenheitRepository.findById(id)
                .map(aw -> {
                    aw.setAwDatum(anwesenheit.getAwDatum());
                    aw.setAwKind(anwesenheit.getAwKind());
                    aw.setAbgeholtUhr(anwesenheit.getAbgeholtUhr());
                    return anwesenheitRepository.save(aw);
                })
                .orElseThrow(() -> new RuntimeException("Anwesenheit mit der ID: " + id + " wurde nicht gefunden!"));

    }


}
