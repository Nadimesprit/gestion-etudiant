package tn.esprit.gestionetudiant.services;


import tn.esprit.gestionetudiant.entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    public List<Etudiant> getAll();
    public Etudiant addEtudiant(Etudiant etudiant);
}
