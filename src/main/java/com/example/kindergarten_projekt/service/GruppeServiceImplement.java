package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TGruppe;
import com.example.kindergarten_projekt.repository.TGruppeRepository;

import java.util.List;

public class GruppeServiceImplement implements GruppeService{
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
    public TGruppe getGruppeById(Integer id) {
        return gruppeRepository.findById(id).orElseThrow();
    }

    @Override
    public TGruppe updeteGruppeById(Integer id) {
        return null;
    }

    @Override
    public String deleteGruppeById(Integer id) {
        gruppeRepository.deleteById(id);
        return "";
    }
}