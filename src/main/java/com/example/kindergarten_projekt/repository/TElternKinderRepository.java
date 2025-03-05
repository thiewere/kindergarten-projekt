package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.model.TElternKinder;
import com.example.kindergarten_projekt.model.TElternKinderId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TElternKinderRepository extends JpaRepository <TElternKinder, TElternKinderId> {

    TElternKinder findByKindId(Integer kindId);
    TElternKinder findByElternId(Integer elternId);
}
