package tn.esprit.gestionetudiant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionetudiant.entities.Etudiant;
import tn.esprit.gestionetudiant.services.EtudiantService;

import java.util.List;

@RequestMapping(value = "/API2/GestionEtudiant")
@RestController
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService ;

    @GetMapping("/getAll")
    public List<Etudiant> getAll (){
        return etudiantService.getAll() ;
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }
}
