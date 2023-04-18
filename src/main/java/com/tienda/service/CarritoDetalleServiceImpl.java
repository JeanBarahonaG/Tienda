package com.tienda.service;

import com.tienda.dao.CarritoDetalleDao;
import com.tienda.domain.Articulo;
import com.tienda.domain.CarritoDetalle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarritoDetalleServiceImpl implements CarritoDetalleService {

    @Autowired
    CarritoDetalleDao carritoDetalleDao;
            
    @Override
    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle) {
        return carritoDetalleDao.findById(carritoDetalle.getIdCarrito()).orElse(null);
    }
    
    @Override
    public CarritoDetalle getCarritoDetalleArticulo(Long idCarrito, Articulo articulo){
        return carritoDetalleDao.findByIdCarritoAndArticulo(idCarrito, articulo);
    }
    
    @Override
    public List<CarritoDetalle> getCarritoDetalle(Long idCarrito) {
        return carritoDetalleDao.findeByIdCarrito(idCarrito);
    }

    @Override
    public void save(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.save(carritoDetalle);
    }

    @Override
    public void delete(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.deleteById(carritoDetalle.getIdDatelle());
    }

    @Override
    public void deleteAll(Long idCarrito) {
        carritoDetalleDao.deleteByIdCarrito(idCarrito);
    }
    
}
