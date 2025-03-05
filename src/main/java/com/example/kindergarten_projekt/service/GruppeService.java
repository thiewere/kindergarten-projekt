package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TGruppe;

import java.util.List;

public interface GruppeService {
    TGruppe addGruppe(TGruppe gruppe);
    List<TGruppe> getAllGruppe();
    TGruppe getGruppeById(Integer id);
    TGruppe updeteGruppeById(Integer id);
    String deleteGruppeById(Integer id);

}
