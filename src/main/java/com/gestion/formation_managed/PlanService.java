package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.PlanRepository;
import com.gestion.formation_managed.entities.PlanFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    //Affichage de la liste de tous les plans
    @GetMapping(value = "/listPlans")
    public List<PlanFormation> listPlans(){
        return planRepository.findAll();
    }
    //Consulter un plan
    @GetMapping(value = "/listPlans/{id}")
    public PlanFormation listPlans(@PathVariable(name = "id") Long id){
        return planRepository.findById(id).get();
    }
    //pour mettre a jour un produit
    @PutMapping(value = "/listPlans/{id}")
    public PlanFormation update(@PathVariable(name = "id") Long id, @RequestBody PlanFormation p){
        p.setId(id);
        return planRepository.save(p);
    }
    //Pour ajouter des produits
    @PostMapping(value = "/listPlans")
    public PlanFormation save(@RequestBody PlanFormation p){
        return planRepository.save(p);
    }
    @DeleteMapping(value = "/listPlans/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        planRepository.deleteById(id);
    }
}
