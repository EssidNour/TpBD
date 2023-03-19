package com.example.tpspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class MyApi {

    public static ArrayList<Etudiant> liste=  new ArrayList<>();

    static {
        liste.add(new Etudiant(0,"A",19));
        liste.add(new Etudiant(1,"A",19));
        liste.add(new Etudiant(2,"A",19));
        liste.add(new Etudiant(3,"A",19));
    }

    @GetMapping(value ="/liste")
    public Collection<Etudiant> getAllEtudiant() {
        return liste;
    }

    @GetMapping(value ="/getEtudiant")
    public Etudiant getEtudiant(int id) {
        return liste.get(id);
    }

    @PostMapping(value ="/addEtudiant")
    public Etudiant addEtudiant(Etudiant ed) {
        liste.add(ed);
        return ed;
    }

    @DeleteMapping(value ="/delete")
    public void supprimerEtudiant(int identifiant){
        liste.remove(identifiant);
    }

    @PutMapping(value ="/put")
    public void modifierEtudiant(int identifiant,String nom){
        liste.get(identifiant).setNom(nom);
    }

    @GetMapping(value ="/b")
    public String bonjour (){
        return "Bonjour ! ";
    }

    @GetMapping(value ="/bn")
    public String bonoir (){
        return "Bonsoir ! ";
    }
    @GetMapping(value ="/etudiant")
    public  Etudiant getEtudiant() {
        return new Etudiant(1,"A",19);
    }

    @GetMapping(value ="/somme")
    public double somme (double a , double b){
        return a+b;
    }

}
