package it.andreanovello.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.andreanovello.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Andrea", "Novello", "andrea"));
		lista.add(new Contatto("Alessandra", "Baroli", "catland"));
		lista.add(new Contatto("Roberta", "Toscano", "spyrobi"));
		return lista;
	}
}
