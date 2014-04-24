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
import com.sshlc.org.domain.Ofertas;
import com.sshlc.org.services.OfertasService;



@Controller
public class OfertasController {

	@Autowired
	OfertasService ofertasService;
        
        
        
        
        

	@RequestMapping("/formaInsertarOfertas")
	public ModelAndView registerOfertas(@ModelAttribute Ofertas ofertas) {


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
                
		return new ModelAndView("agregarOfertas", "map", map);
	}
        
        
        

	@RequestMapping("/insertarOfertas")
	public String inserData(@ModelAttribute Ofertas ofertas) {
		if (ofertas != null)
			ofertasService.insertarOfertas(ofertas);
		return "redirect:/listaOfertas";
	}

        
        @RequestMapping("entradaOferta")
	public ModelAndView getEntradaOferta(@RequestParam String user,@RequestParam String password) {
		List<Ofertas> ofertasList = ofertasService.getOfertasList();
                //VERIFICAR USUARIO SI VIENE VACIO
                //System.out.println(ofertasList.get(0));
                //String usuario = usuarios.getUsuario();
                //System.out.println(usuario);
                if(user.isEmpty() || password.isEmpty()){
                return new ModelAndView("usuarioInvalido", "usuarioInvalido", ofertasList);
                }else{
                //VERIFICAR EL OBJETO DESDE LA DB
                
		return new ModelAndView("bienvenidaOfertas", "bienvenidaOfertas", ofertasList);
                }
	}
        
        @RequestMapping("/usuarioInvalido")
	public ModelAndView getUsuarioInvalido() {
            String user=null;
		//List<Ofertas> ofertasList = ofertasService.getOfertasList();
		return new ModelAndView("usuarioInvalido", "usuarioInvalido", user);
	}
        
        @RequestMapping("/listaOfertas")
	public ModelAndView getOfertasList() {
	List<Ofertas> ofertasList = ofertasService.getOfertasList();
	return new ModelAndView("ofertasList", "ofertasList", ofertasList);
	}
        
        
        /*
	@RequestMapping("/insertarOfertas")
	public String insertarPublicacion(@RequestParam String id_empresa, @RequestParam String fechaInicio,
                 @RequestParam String fechaFinal, @RequestParam String descripcionOferta,
                  @RequestParam String tipo, @RequestParam String descripcion,
                   @RequestParam String direccion, @RequestParam String paginaWeb,
                    @RequestParam String nombrePuesto, @RequestParam String sueldo,
                     @RequestParam String prestaciones, @RequestParam String horarioJornada,
                      @RequestParam String numeroVacantes,
                       @RequestParam String tipoContrato,
			@ModelAttribute Ofertas ofertas) {
		if (ofertas != null)
			ofertasService.insertarOfertas(ofertas);
		return "redirect:/listaOfertas";
	}*/

	@RequestMapping("/editarOfertas")
	public ModelAndView editOfertas(@RequestParam int keyEmp,
			@ModelAttribute Ofertas ofertas) {

		//ofertas = ofertasService.getOfertas(folio);
                String descripcion = ofertas.getDescripcion();
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

		return new ModelAndView("editarOfertas", "map", map);

	}

	@RequestMapping("/actualizarOfertas")
	public String updateOfertas(@ModelAttribute Ofertas ofertas) {
		ofertasService.updateData(ofertas);
		return "redirect:/listaOfertas";

	}

	@RequestMapping("/eliminaOfertas")
	public String eliminaOfertas(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		ofertasService.deleteData(folio);
		return "redirect:/listaOfertas";
	}
}