/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiante.TbEstudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LisbethTatiana
 */
@Stateless
public class TbEstudianteFacade extends AbstractFacade<TbEstudiante> implements TbEstudianteFacadeLocal {

    @PersistenceContext(unitName = "form_EstudiantePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbEstudianteFacade() {
        super(TbEstudiante.class);
    }
    
}
