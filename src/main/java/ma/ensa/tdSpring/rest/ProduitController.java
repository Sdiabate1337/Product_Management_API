package ma.ensa.tdSpring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.tdSpring.model.Produit;
import ma.ensa.tdSpring.service.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	ProduitService produitService;
	
	public ProduitController(ProduitService produitService) {
		this.produitService = produitService;
	}
	
	@PostMapping("/ajouter")
	public int ajouter(@RequestBody Produit produit) {
		
		try {
		produitService.inserer(produit);	
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return 1;
	}
	
	@GetMapping("/getAll")
	public Iterable<Produit> getAll(){
		return produitService.findAll();
	}

}
