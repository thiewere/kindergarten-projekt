package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TEltern;
import com.example.kindergarten_projekt.repository.TElternRepository;
import com.example.kindergarten_projekt.service.ElternService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElternServiceImplement implements ElternService {

    private final TElternRepository elternRepository;

    public ElternServiceImplement(TElternRepository elternRepository) {
        this.elternRepository = elternRepository;
    }


    @Override
    public TEltern addEltern(TEltern eltern) {
        return elternRepository.save(eltern);
    }

    @Override
    public List<TEltern> getAllElterns() {
        return elternRepository.findAll();
    }

    @Override
    public TEltern getElternById(Integer id) {
        return elternRepository.findById(id).orElseThrow(() -> new RuntimeException("Eltern not found"));
    }

    @Override
    public TEltern updateElternById(TEltern eltern, Integer id) {
        return elternRepository.findById(id)
                .map(elt -> {
                    elt.setElternVorname(eltern.getElternVorname());
                    elt.setElternNachname(eltern.getElternNachname());
                    elt.setElternEmail(eltern.getElternEmail());
                    elt.setElternPlz(eltern.getElternPlz());
                    elt.setElternStrasseHausnr(eltern.getElternStrasseHausnr());
                    elt.setElternTelefonnummer(eltern.getElternTelefonnummer());
                    return elternRepository.save(elt);
                }).orElseThrow(() -> new RuntimeException("Eltern not found"));
    }

    @Override
    public String deleteElternById(Integer id) {
        if (elternRepository.existsById(id)) {
            elternRepository.deleteById(id);
            return "Eltern with id " + id + " wurde geloescht";
        }
        return "Eltern with id " + id + " wurde nicht gefunden";
    }
}
