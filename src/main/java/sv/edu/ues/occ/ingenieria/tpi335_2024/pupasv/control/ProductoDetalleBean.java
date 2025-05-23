package sv.edu.ues.occ.ingenieria.tpi335_2024.pupasv.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
import sv.edu.ues.occ.ingenieria.tpi335_2024.pupasv.entity.ProductoDetalle;

@Stateless
@LocalBean
public class ProductoDetalleBean extends AbstractDataPersistence<ProductoDetalle> implements Serializable{

    @PersistenceContext(unitName = "PupaPU")
    EntityManager em;

    public ProductoDetalleBean(){
        super(ProductoDetalle.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

}
