package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TGruppe;
import com.example.kindergarten_projekt.repository.TGruppeRepository;
import com.example.kindergarten_projekt.service.GruppeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GruppeServiceImplement implements GruppeService {


    private final TGruppeRepository gruppeRepository;

    public GruppeServiceImplement(TGruppeRepository gruppeRepository) {
        this.gruppeRepository = gruppeRepository;
    }

    @Override
    public TGruppe addGruppe(TGruppe gruppe) {
        return gruppeRepository.save(gruppe);
    }

    @Override
    public List<TGruppe> getAllGruppe() {
        return gruppeRepository.findAll();
    }

    @Override
    public TGruppe getGruppeById(Long id) {
        return gruppeRepository.findById(id).orElseThrow();
    }

    @Override
    public TGruppe updateGruppeById(TGruppe gruppe, Long id) {

        return gruppeRepository.findById(id).map(gr -> {
            gr.setGruppeName(gruppe.getGruppeName());
            gr.setGruppeGroesse(gruppe.getGruppeGroesse());
            return gruppeRepository.save(gr);
        }).orElseThrow(() -> new RuntimeException("Gruppe nicht gefunden"));
    }

    @Override
    public String deleteGruppeById(Long id) {
        gruppeRepository.deleteById(id);
        return "";
    }
}