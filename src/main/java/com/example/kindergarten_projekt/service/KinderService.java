package com.example.kindergarten_projekt.service;
import com.example.kindergarten_projekt.model.TKinder;

import java.util.List;

public interface KinderService {
    TKinder addKinder(TKinder kinder);
    List<TKinder> getAllKinder();
    TKinder getKindById(Integer id);
    TKinder updateKindById(Integer id,TKinder kinder);
    String deleteKindById(Integer id);

}
