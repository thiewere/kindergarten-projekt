package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import com.example.kindergarten_projekt.repository.TElternKinderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElternKinderServiceImplement implements ElternKinderService{

    private TElternKinderRepository elternKinderRepository;

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
    //TODO: elternKinderRepository.findById(elternKinderId)
    //                .orElseThrow(() -> new RuntimeException("Eltern-Kind-Beziehung nicht gefunden"));
    @Override
    public List<TElternKinder> getElternKinderById(TElternKinderId elternKinderId) {
        return List.of();
    }

    //TODO: elternKinderRepository.findByElternId(elternId);
    @Override
    public List<TElternKinder> getKinderByElternId(Integer elternId) {
        return List.of();
    }

    //TODO: elternKinderRepository.findByKindId(kinderId);
    @Override
    public List<TElternKinder> getElternByKinderId(Integer kinderId) {
        return List.of();
    }

    @Override
    public TElternKinder updateElternKinder(TElternKinder elternKinder) {
        return null;
    }

    @Override
    public void deleteElternKinder(TElternKinderId elternKinderId) {
        elternKinderRepository.deleteById(elternKinderId);
    }
}
