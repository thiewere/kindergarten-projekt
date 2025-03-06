package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;

import java.util.List;

public interface ElternKinderService {

    TElternKinder addElternKinderBeziehung(TElternKinder elternKinder);

    List<TElternKinder> getAllElternKinder();

    List<TElternKinder> getElternKinderById(TElternKinderId elternKinderId);

    //TODO: Suche implentieren
    //Alle Kinder des Elternteils
//    List<TElternKinder> getKinderByElternId(TElternKinderId elternId);
//
//    //Alle Eltern des Kindes
//    List<TElternKinder> getElternByKinderId(Integer kinderId);

    TElternKinder updateElternKinder(TElternKinder elternKinder, TElternKinderId elternKinderId);

    void deleteElternKinder(TElternKinderId elternKinderId);

}
