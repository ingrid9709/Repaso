/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.jpa.sessions;

import com.ejemplo.jpa.entities.Cocaina;
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
public class CocainaSession {
    @PersistenceContext
    
    private EntityManager entityManager;
    
    public void create (Cocaina cocaina){
        entityManager.persist(cocaina);
    }
    
    public void update (Cocaina cocaina){
        entityManager.merge(cocaina);
    }
    
    public void remove (Cocaina cocaina){
        entityManager.remove(cocaina);
    }
    
    public List<Cocaina> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cocaina.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
