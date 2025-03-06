package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TKinder;
import com.example.kindergarten_projekt.repository.TKinderRepository;
import com.example.kindergarten_projekt.service.KinderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KinderServiceImplement implements KinderService {
    private final TKinderRepository kinderRepository;

    public KinderServiceImplement(TKinderRepository kinderRepository) {
        this.kinderRepository = kinderRepository;
    }

    @Override
    public TKinder addKinder(TKinder kinder) {
        return kinderRepository.save(kinder);
    }

    @Override
    public List<TKinder> getAllKinder() {
        return kinderRepository.findAll();
    }

    @Override
    public TKinder getKindById(Integer id) {
        return kinderRepository.findById(id).orElseThrow();
    }

    @Override
    public TKinder updateKindById(TKinder kinder, Integer id) {
        return kinderRepository.findById(id)
                .map(ki -> {
                    ki.setGruppe(kinder.getGruppe());
                    ki.setKindVorname(kinder.getKindVorname());
                    ki.setKindNachname(kinder.getKindNachname());
                    ki.setKindGeburtsdatum((kinder.getKindGeburtsdatum()));
                    ki.setBesonderheiten(kinder.getBesonderheiten());
                    return kinderRepository.save(ki);
                }).orElseThrow(() -> new RuntimeException("Kinder mit der ID " + id + " nicht gefunden."));
    }


    @Override
    public String deleteKindById(Integer id) {
        kinderRepository.deleteById(id);
        return "";
    }
}
