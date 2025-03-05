package com.example.kindergarten_projekt.serviceImplement;


import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;
import com.example.kindergarten_projekt.repository.TPostleitzahlRepository;
import com.example.kindergarten_projekt.repository.TStandortRepository;
import com.example.kindergarten_projekt.service.StandortService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandortServiceImplement implements StandortService {

    private final TStandortRepository standortRepository;
    private final TPostleitzahlRepository postleitzahlRepository;

    public StandortServiceImplement(TStandortRepository standortRepository, TPostleitzahlRepository postleitzahlRepository) {
        this.standortRepository = standortRepository;
        this.postleitzahlRepository = postleitzahlRepository;
    }

    @Override
    public TStandort addStandort(TStandort standort) {
        return standortRepository.save(standort);
    }


    @Override
    public TPostleitzahl addPostleitzahl(TPostleitzahl postleitzahl) {
        return postleitzahlRepository.save(postleitzahl);
    }

    @Override
    public List<TStandort> getAllStandort() {
        return standortRepository.findAll();
    }


    @Override
    public List<TPostleitzahl> getAllPostleitzahl() {
        return postleitzahlRepository.findAll();
    }
}
