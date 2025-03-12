package com.example.kindergarten_projekt.repository;

import com.example.kindergarten_projekt.oldmodel.TElternKinder;
import com.example.kindergarten_projekt.oldmodel.TElternKinderId;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TElternKinderRepository extends JpaRepository <TElternKinder, Integer> {

//    List<TElternKinder> findByEkId(TElternKinderId elternKinderId);
//    List<TElternKinder> findByEkKindId(Integer kindId);
//    List<TElternKinder> findByEkElternId(Integer elternId);
}
