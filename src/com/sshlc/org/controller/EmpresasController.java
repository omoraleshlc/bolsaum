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

@Controller
public class EmpresasController {

	@Autowired
	EmpresasService empresasService;
        
        
        
        
        

	@RequestMapping("/formaInsertarEmpresas")
	public ModelAndView registerEmpresas(@ModelAttribute Empresas empresas) {

		List<String> genderList = new ArrayList<String>();
		genderList.add("male");
		genderList.add("female");
                
                List<String> estadoList = new ArrayList<String>();
		estadoList.add("Nuevo Leon");
		estadoList.add("Tamaulipas");
		estadoList.add("Veracruz");
		estadoList.add("Chiapas");
                

		List<String> cityList = new ArrayList<String>();
		cityList.add("delhi");
		cityList.add("gurgaon");
		cityList.add("meerut");
		cityList.add("noida");

		Map<String, List> map = new HashMap<String, List>();
		map.put("genderList", genderList);
		map.put("cityList", cityList);
                map.put("estadoList", estadoList);
		return new ModelAndView("agregarEmpresas", "map", map);
	}

	@RequestMapping("/insertarEmpresas")
	public String inserData(@ModelAttribute Empresas empresas) {
		if (empresas != null)
			empresasService.insertData(empresas);
		return "redirect:/listaEmpresas";
	}

	@RequestMapping("/listaEmpresas")
	public ModelAndView getEmpresasList() {
		List<Empresas> empresasList = empresasService.getEmpresasList();
		return new ModelAndView("empresasList", "empresasList", empresasList);
	}

	@RequestMapping("/editarEmpresas")
	public ModelAndView editEmpresas(@RequestParam int folio,
			@ModelAttribute Empresas empresas) {

		//empresas = empresasService.getEmpresas(folio);

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

	@RequestMapping("/delete")
	public String deleteEmpresas(@RequestParam int folio) {
		System.out.println("folio = " + folio);
		empresasService.deleteData(folio);
		return "redirect:/listaEmpresas";
	}
}