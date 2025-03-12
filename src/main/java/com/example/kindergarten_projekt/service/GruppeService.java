package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TGruppe;

import java.util.List;

public interface GruppeService {
    TGruppe addGruppe(TGruppe gruppe);
    List<TGruppe> getAllGruppe();
    TGruppe getGruppeById(Long id);
    TGruppe updateGruppeById(TGruppe gruppe, Long id);
    String deleteGruppeById(Long id);

}
