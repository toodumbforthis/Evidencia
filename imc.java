/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@RequestMapping("*/imc.htm")
public class imc {
    @RequestMapping(method = RequesMethod.POST)
    public String ejecutar (@RequestParam("usuario")String usuario,@RequestParam("estatura")Float estatura,@RequestParam("peso")int peso)
           
            Float imc= (peso/(estatura*estatura));
    model.imc(usuario,estatura,peso,imc);
    
    model.addAttribute(usuario+"su IMC es:"+imc+"<br> <a href=\"./index.htm\">");
    return "resultado";
    
    
            }

