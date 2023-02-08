package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jeanca Barahona
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MCV");
//        String mensaje = "Estamos en semana 4, saludos!";
//        model.addAttribute("MensajeSaludo", mensaje);
//        
//        Cliente cliente = new Cliente("Jean Carlo","Barahona Gomez","jeanca9cr@gmail.com","70189450");
//        Cliente cliente2 = new Cliente("Brandon Alberto","Barahona Gomez","b.barahona07@gmail.com","80907612");
//        Cliente cliente3 = new Cliente("Alexander Alberto","Barahona Mata","abm17@gmail.com","80909986");
//        model.addAttribute("cliente", cliente);     
//        
//        List<Cliente> clientes = Arrays.asList(cliente, cliente2);
//        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }

}
