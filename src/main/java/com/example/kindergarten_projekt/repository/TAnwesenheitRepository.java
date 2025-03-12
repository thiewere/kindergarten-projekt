package com.example.kindergarten_projekt.repository;


import com.example.kindergarten_projekt.model.TAnwesenheit;
import com.example.kindergarten_projekt.model.TKinder;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;

public interface TAnwesenheitRepository extends JpaRepository<TAnwesenheit, Long> {



    List<TAnwesenheit> findTAnwesenheitByAwKind(TKinder awKind);

    List<TAnwesenheit> findTAnwesenheitByAwDatum(LocalDate awDatum);

    List<TAnwesenheit> removeTAnwesenheitByAwDatum(LocalDate awDatum);

    List<TAnwesenheit> getTAnwesenheitByAwKind(TKinder awKind);

    TKinder id(Integer id);
}
