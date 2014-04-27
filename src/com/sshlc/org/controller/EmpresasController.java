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
import com.sshlc.org.domain.Empresas;
import com.sshlc.org.services.EmpresasService;

import com.sshlc.org.domain.Usuarios;
import com.sshlc.org.services.UsuariosService;


@Controller
public class EmpresasController {

	@Autowired
	EmpresasService empresasService;
        
        
        
        
        

	@RequestMapping("/formaInsertarEmpresas")
	public ModelAndView registerEmpresas(@ModelAttribute Empresas empresas) {


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
                
		return new ModelAndView("agregarEmpresas", "map", map);
	}
        
        
        @RequestMapping("/entradaEmpresa")
        public String entrada(@ModelAttribute Empresas empresas,@RequestParam String user,
                @RequestParam String password
        ) {
            String rfc_curp=user;
            if(user.isEmpty() || password.isEmpty()){
             return "redirect:/usuarioInvalido";
        }else{
            //Validar Empresa
            empresasService.validarEmpresa(empresas,rfc_curp);
            
            return "redirect:/validarEmpresa?user="+user;
            
            }
        }

        
        
        /*
                @RequestParam String direccion,       @RequestParam String e-mail,
                @RequestParam String sitioWEB */
        
	@RequestMapping("/insertarEmpresas")
	public String insertData(@ModelAttribute Empresas empresas,
                @RequestParam String rfc_curp,        @RequestParam String razon_social,
                @RequestParam String nombre_comercial, 
                @RequestParam String descripcion,@RequestParam String direccion,
                @RequestParam String email,
                @RequestParam String passwd1,@RequestParam String passwd2){                
		if (passwd1.equals(passwd2)){
			empresasService.insertarEmpresas(empresas);
		return "redirect:/getEmpresaSI";
                }else{
                    return "redirect:/empresaNovalida";
                }
        }

        @RequestMapping("/getEmpresaSI")
	public ModelAndView bienvenidaEmpresas() {
		List<Empresas> empresasList = empresasService.getEmpresasList();
 //           String map=null;
		return new ModelAndView("empresaSI", "empresaSI", empresasList);
	}
        
        @RequestMapping("/empresaNovalida")
	public ModelAndView getEmpresaNO() {
		List<Empresas> empresasList = empresasService.getEmpresasList();
 //           String map=null;
		return new ModelAndView("empresaNO", "empresaNO", empresasList);
	}
        
        
        @RequestMapping("/validarEmpresa")
	public String validarEmpresa(@ModelAttribute Empresas empresas,@RequestParam String user){
 //           String map=null;
		empresasService.validarEmpresa(empresas,user);
        return "redirect:/bienvenidaEmpresas.jsp?user="+user;
	}
        
	@RequestMapping("/listaEmpresas")
	public ModelAndView getEmpresasList() {
		List<Empresas> empresasList = empresasService.getEmpresasList();
 //           String map=null;
		return new ModelAndView("empresasList", "empresasList", empresasList);
	}

	@RequestMapping("/editarEmpresas")
	public ModelAndView editEmpresas(@RequestParam int keyEmp,
			@ModelAttribute Empresas empresas) {

		//empresas = empresasService.getEmpresas(folio);
                String descripcion = empresas.getDescripcion();
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

		return new ModelAndView("editarEmpresas", "map", map);

	}

	@RequestMapping("/actualizarEmpresas")
	public String updateEmpresas(@ModelAttribute Empresas empresas) {
		empresasService.updateData(empresas);
		return "redirect:/listaEmpresas";

	}

	@RequestMapping("/eliminaEmpresas")
	public String eliminaEmpresas(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		empresasService.deleteData(folio);
		return "redirect:/listaEmpresas";
	}
}

