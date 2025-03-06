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
    public TKinder updateKindById(Integer id, TKinder kinder) {
        return null;
    }

    @Override
    public String deleteKindById(Integer id) {
        kinderRepository.deleteById(id);
        return "";
    }
}
