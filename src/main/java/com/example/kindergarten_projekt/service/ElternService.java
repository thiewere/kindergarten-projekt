package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TEltern;

import java.util.List;

public interface ElternService {

    TEltern addEltern(TEltern eltern);

    List<TEltern> getAllElterns();

    TEltern getElternById(Long id);

    TEltern updateElternById(TEltern eltern, Long id);

    String deleteElternById(Long id);
}
