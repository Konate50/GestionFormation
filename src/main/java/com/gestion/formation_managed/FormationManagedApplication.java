package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.FormationRepository;
import com.gestion.formation_managed.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class FormationManagedApplication /*implements CommandLineRunner*/ {

    /*@Autowired
    private FormationRepository formationRepository;//Pour exposer le id du produit a chaque affichage dans le formar Json
    @Autowired
    private RepositoryRestConfiguration restConfiguration;
*/
    public static void main(String[] args) { SpringApplication.run(FormationManagedApplication.class, args); }

   /* @Override
    public void run(String... args) throws Exception {

        restConfiguration.exposeIdsFor(Formation.class);
        formationRepository.save(new Formation(null, "Spring boot", "Maitrice", "","Fac Essaadi", 300, 20));
        formationRepository.save(new Formation(null, "PC Lenovo", 6500, 9));
        formationRepository.save(new Formation(null, "PC Asus", 4000, 2));

        formationRepository.findAll().forEach(f -> {
                    System.out.println(f.toString());
                }
        );
    }*/

}
