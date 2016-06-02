/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.jpa.sessions;

import com.ejemplo.jpa.entities.Kripa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi1
 */
@Stateless
public class KripaSession {
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create (Kripa kripa){
        entityManager.persist(kripa);
    }
    
    public void update (Kripa kripa){
        entityManager.merge(kripa);
    }
    
    public void remove (Kripa kripa){
        entityManager.remove(kripa);
    }
    
    public List<Kripa> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Kripa.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
