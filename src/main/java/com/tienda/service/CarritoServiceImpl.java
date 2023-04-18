package com.tienda.service;

import com.tienda.dao.CarritoDao;
import com.tienda.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    CarritoDao carritoDao;
    
    @Override
    public Carrito getCarrito(Carrito carrito) {
        //return carritoDao.findbyId(carrito.getIdCarrito()).orElse(null);
        return null;
    }

    @Override
    public Carrito getCarritoCliente(Long idCliente) {
        Carrito carritoCliente = carritoDao.findByIdCliente(idCliente).orElse(null);
        
        if (carritoCliente == null){
            
            Carrito carritoNuevo = new Carrito(idCliente);
            carritoCliente = carritoDao.save(carritoNuevo);
            
        }
        
        return carritoCliente;
    }
    
    }

