package tn.esprit.gestionetudiant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionetudiant.entities.Etudiant;
import tn.esprit.gestionetudiant.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImp implements EtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository ;

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
