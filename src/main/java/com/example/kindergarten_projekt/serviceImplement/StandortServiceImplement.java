package com.example.kindergarten_projekt.serviceImplement;


import com.example.kindergarten_projekt.model.TPostleitzahl;
import com.example.kindergarten_projekt.model.TStandort;
import com.example.kindergarten_projekt.repository.TPostleitzahlRepository;
import com.example.kindergarten_projekt.repository.TStandortRepository;
import com.example.kindergarten_projekt.service.StandortService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandortServiceImplement implements StandortService {

    private final TStandortRepository standortRepository;
    private final TPostleitzahlRepository postleitzahlRepository;

    public StandortServiceImplement(TStandortRepository standortRepository, TPostleitzahlRepository postleitzahlRepository) {
        this.standortRepository = standortRepository;
        this.postleitzahlRepository = postleitzahlRepository;
    }

    @Override
    public TStandort addStandort(TStandort standort) {
        return standortRepository.save(standort);
    }


    @Override
    public TPostleitzahl addPostleitzahl(TPostleitzahl postleitzahl) {
        return postleitzahlRepository.save(postleitzahl);
    }

    @Override
    public List<TStandort> getAllStandort() {
        return standortRepository.findAll();
    }


    @Override
    public List<TPostleitzahl> getAllPostleitzahl() {
        return postleitzahlRepository.findAll();
    }

    @Override
    public TStandort updateStandort(TStandort standort, Long id) {
        return standortRepository.findById(id)
                .map(st -> {
                    st.setStandortName(standort.getStandortName());
                    st.setStandortTyp(standort.getStandortTyp());
                    st.setStandortStrasseHausnr(standort.getStandortStrasseHausnr());
                    st.setStandortPlz(standort.getStandortPlz());
                    return standortRepository.save(st);
                }).orElseThrow(() -> new RuntimeException("Standort nicht gefunden"));
    }

    @Override
    public TPostleitzahl updatePostleitzahl(TPostleitzahl postleitzahl, String plzahl) {
        return postleitzahlRepository.findById(plzahl)
                .map(postzahl -> {
                    postzahl.setPlz(postleitzahl.getPlz());
                    postzahl.setOrt(postleitzahl.getOrt());
                    return postleitzahlRepository.save(postzahl);
                }).orElseThrow(() -> new RuntimeException("Postleitzahl nicht gefunden"));
    }

    @Override
    public void deleteStandortById(Integer id){
        standortRepository.deleteById(id);
    }

    @Override
    public String deletePostleitzahlById(String plz) {
        if (!postleitzahlRepository.existsById(plz)) {
            postleitzahlRepository.deleteById(plz);
            return "Postleitzahl: " + plz + " wurde nicht gefunden!";
        }
        return "Postleitzahl: " + plz + " wurde gelöscht!";
    }


}
