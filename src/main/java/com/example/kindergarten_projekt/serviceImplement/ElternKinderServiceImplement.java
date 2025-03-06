package com.example.kindergarten_projekt.serviceImplement;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import com.example.kindergarten_projekt.repository.TElternKinderRepository;
import com.example.kindergarten_projekt.service.ElternKinderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElternKinderServiceImplement implements ElternKinderService {

    private final TElternKinderRepository elternKinderRepository;

    public ElternKinderServiceImplement(TElternKinderRepository elternKinderRepository) {
        this.elternKinderRepository = elternKinderRepository;
    }

    @Override
    public TElternKinder addElternKinderBeziehung(TElternKinder elternKinder) {
        return elternKinderRepository.save(elternKinder);
    }

    @Override
    public List<TElternKinder> getAllElternKinder() {
        return elternKinderRepository.findAll();
    }

    @Override
    public List<TElternKinder> getElternKinderById(TElternKinderId elternKinderId) {
        return elternKinderRepository.findByEkId(elternKinderId);
    }

    // TODO: Suche implementieren
//    @Override
//    public List<TElternKinder> getKinderByElternId(Integer elternId) {
//
//        elterKindId.
//        return elternKinderRepository.findByEkElternId(elternId);
//    }
//
//    @Override
//    public List<TElternKinder> getElternByKinderId(Integer kinderId) {
//
//        return elternKinderRepository.findByEkKindId(kinderId);
//    }

    @Override
    public TElternKinder updateElternKinder(TElternKinder elternKinder, TElternKinderId elternKinderId) {
        elternKinderRepository.findById(elternKinderId).map(ek -> {
            ek.setEkEltern(elternKinder.getEkEltern());
            ek.setEkKind(elternKinder.getEkKind());
            ek.setRolle(elternKinder.getRolle());
            return elternKinderRepository.save(ek);
        }).orElseThrow(() -> new RuntimeException("Eltern-Kinder Beziehung nicht gefunden"));
        return elternKinder;
    }

    @Override
    public void deleteElternKinder(TElternKinderId elternKinderId) {
        elternKinderRepository.deleteById(elternKinderId);
    }
}
