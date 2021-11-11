
package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import model.model;
/**
 *
 * @author Compu
 */
public class registro {
    @RequestMapping(method = RequestMethod.POST)
    public String ejecutar (@RequestParam("usuario") String usuario,@RequestParam("contra")String contra,@RequestParam("edad") int edad,@RequestParam("sexo") String sexo,@RequestParam("estatura")float estatura,@Request param("peso") int peso)
    
    model.saveData(usuario,contra,edad,sexo,estatura,peso);
    model.addAttribute("valor"+usuario +"<h1>iniciar sesion</h1>")
}
