package com.sshlc.org.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.sshlc.org.domain.Egresados;
import com.sshlc.org.services.EgresadosService;



@Controller
public class EgresadosController {

	@Autowired
	EgresadosService egresadosService;
        
        
        
        
        

	@RequestMapping("/formaInsertarEgresados")
	public ModelAndView registerEgresados(@ModelAttribute Egresados egresados) {


                List<String> sectorList = new ArrayList<String>();
		sectorList.add("Administrativos");
                sectorList.add("Biología");
                sectorList.add("Comunicaciones");
                sectorList.add("Construcción");
                sectorList.add("Contabilidad");
                sectorList.add("Creatividad, Producción y Diseño Comercial");
                sectorList.add("Derecho y Leyes");
                sectorList.add("Educación");
                sectorList.add("Logística, Transportación y Distribución");
                sectorList.add("Manufactura, Producción y Operación");
                sectorList.add("Mercadotecnia, Publicidad y Relaciones Públicas");
                sectorList.add("Recursos Humanos");
                sectorList.add("Salud y Belleza");
                sectorList.add("Sector Salud");
                sectorList.add("Seguro y Reaseguro");
                sectorList.add("Tecnologías de la Información / Sistemas");
                sectorList.add("Turismo, Hospitalidad y Gastronomía");
                sectorList.add("Ventas");
                sectorList.add("Veterinaria / Zoología");
                
		Map<String, List> map = new HashMap<String, List>();
		map.put("sectorList", sectorList);
                
		return new ModelAndView("agregarEgresados", "map", map);
	}
        
        
        @RequestMapping("/entradaEgresado")
        public String entrada(@ModelAttribute Egresados egresados,@RequestParam String user,
                @RequestParam String password
        ) {
            String nombre=user;
            if(user.isEmpty() || password.isEmpty()){
             return "redirect:/usuarioInvalido";
        }else{
            //Validar egresados
            //egresadosService.validarEgresado(egresados,nombre);
            
            return "redirect:/validaregresados?user="+user;
            
            }
        }

        
        
        /*
                @RequestParam String direccion,       @RequestParam String e-mail,
                @RequestParam String sitioWEB */
        
	@RequestMapping("/insertarEgresados")
	public String insertData(@ModelAttribute Egresados egresados,
                @RequestParam String nombre,
                @RequestParam String email1,@RequestParam String email2,
                @RequestParam String passwd1,@RequestParam String passwd2){                
		if (passwd1.equals(passwd2)){
			egresadosService.insertarEgresados(egresados);
		return "redirect:/getegresadosSI";
                }else{
                    return "redirect:/EgresadosNovalida";
                }
        }

        @RequestMapping("/getegresadosSI")
	public ModelAndView bienvenidaEgresados() {
		List<Egresados> egresadosList = egresadosService.getEgresadosList();
 //           String map=null;
		return new ModelAndView("EgresadosSI", "EgresadosSI", egresadosList);
	}
        
        @RequestMapping("/EgresadosNovalida")
	public ModelAndView getegresadosNO() {
		List<Egresados> egresadosList = egresadosService.getEgresadosList();
 //           String map=null;
		return new ModelAndView("EgresadosNO", "EgresadosNO", egresadosList);
	}
        
        
        @RequestMapping("/validarEgresado")
	public String validarEgresado(@ModelAttribute Egresados egresados,@RequestParam String user){
 //           String map=null;
		//egresadosService.validarEgresado(egresados,user);
        return "redirect:/bienvenidaEgresados.jsp?user"+user;
	}
        
	@RequestMapping("/listaEgresados")
	public ModelAndView getEgresadosList() {
		List<Egresados> egresadosList = egresadosService.getEgresadosList();
 //           String map=null;
		return new ModelAndView("egresadosList", "egresadosList", egresadosList);
	}

	@RequestMapping("/editarEgresados")
	public ModelAndView editEgresados(@RequestParam int keyEmp,
			@ModelAttribute Egresados egresados) {

		//egresados = egresadosService.getEgresados(folio);
                String descripcion = egresados.getNombre();
		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");

		List<String> cityList = new ArrayList<String>();
		cityList.add("delhi");
		cityList.add("gurgaon");
		cityList.add("meerut");
		cityList.add("noida");
                cityList.add("monterrey");
                
                List<String> estadoList = new ArrayList<String>();
		estadoList.add("Nuevo Leon");
		estadoList.add("Tamaulipas");
		estadoList.add("Veracruz");
		estadoList.add("Chiapas");
                
                
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("genderList", genderList);
		map.put("cityList", cityList);
		//map.put("usuarios", usuarios);
                map.put("estado", estadoList);

		return new ModelAndView("editarEgresados", "map", map);

	}

	@RequestMapping("/actualizarEgresados")
	public String updateEgresados(@ModelAttribute Egresados egresados) {
		egresadosService.updateData(egresados);
		return "redirect:/listaEgresados";

	}

	@RequestMapping("/eliminaEgresados")
	public String eliminaEgresados(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		egresadosService.deleteData(folio);
		return "redirect:/listaEgresados";
	}
}

