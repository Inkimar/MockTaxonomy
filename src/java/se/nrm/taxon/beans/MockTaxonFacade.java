/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nrm.taxon.beans;

import se.nrm.taxon.restful.service.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.nrm.taxon.entities.MockTaxon;

/**
 *
 * @author ingimar
 */
@Stateless
public class MockTaxonFacade extends AbstractFacade<MockTaxon> {

    @PersistenceContext(unitName = "TaxonMock-2014-BPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MockTaxonFacade() {
        super(MockTaxon.class);
    }
    
}
