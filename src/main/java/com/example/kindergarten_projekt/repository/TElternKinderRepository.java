package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TElternKinderRepository extends JpaRepository <TElternKinder, TElternKinderId> {

    List<TElternKinder> findByEkId(TElternKinderId elternKinderId);
    List<TElternKinder> findByEkKindId(Integer kindId);
    List<TElternKinder> findByEkElternId(Integer elternId);
}
