package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.PlanFormation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface PlanRepository extends JpaRepository<PlanFormation, Long> {
    //recherche pas id
    @RestResource(path = "/byPlanLibele")
    public List<PlanFormation> findByPriceContains(@Param("mc") String des);

    //recherce pas pagegignation
    @RestResource(path = "/byPlanLibelPage")
    public Page<PlanFormation> findByPriceContains(@Param("mc") String des, Pageable pageable);

}
