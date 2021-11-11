
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
@Controller
@RequestMapping("*/controlador.htm")
public class controller {
    
    @RequestMapping (method=RequestMethod.POST)
    public String ejecutar (@RequestParam("contra")String contra, @RequestParam("usuario")String usuario,Model model){
    
        String table;
        table = model.login(contra,usuario);
        table=table + "<h1>Calcula tu IMC</h1><form action=\"imc.htm\" method=\"POST\">\n";
        
        model.addAttribute("table"+table);
        return "resultado";
    }
}
