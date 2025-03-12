package com.example.kindergarten_projekt.service;


import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;


import java.util.List;

public interface StandortService {
    TStandort addStandort(TStandort standort);
    TPostleitzahl addPostleitzahl(TPostleitzahl postleitzahl);

    List<TStandort> getAllStandort();
    List<TPostleitzahl> getAllPostleitzahl();

    TStandort updateStandort(TStandort standort, Long id);
    TPostleitzahl updatePostleitzahl(TPostleitzahl postleitzahl, String plz);

    void deleteStandortById(Long id);
    String deletePostleitzahlById(String plz);
}
