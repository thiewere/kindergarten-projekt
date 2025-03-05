package com.example.kindergarten_projekt.service;

import com.example.kindergarten_projekt.model.TEltern;

import java.util.List;

public interface ElternService {

    TEltern addEltern(TEltern eltern);

    List<TEltern> getAllElterns();

    TEltern getElternById(Integer id);

    TEltern updateElternById(TEltern eltern, Integer id);

    String deleteElternById(Integer id);
}
