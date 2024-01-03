package com.algaworks.cursojsfeprimefacesessencial.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public class RamoAtividades implements Serializable {

    public static final long SerialVersionUID = 1L;

    private EntityManager manager;

    public RamoAtividades(){}

    public RamoAtividades(EntityManager manager){
        this.manager = manager;
    }

    public List<RamoAtividades> pesquisar(String descricao) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<RamoAtividades> criteriaQuery = criteriaBuilder.createQuery(RamoAtividades.class);

        Root<RamoAtividades> root = criteriaQuery.from(RamoAtividades.class);



        return null;
    }

}
