package ma.ensa.tdSpring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.tdSpring.model.Produit;
import ma.ensa.tdSpring.repositories.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public void inserer(Produit p) {
		produitRepository.save(p);
		
	}

	@Override
	public List<Produit> findAll() {
		List<Produit> produits = produitRepository.findAll();
		
		return produits;
	}

	@Override
	public Optional<Produit> findById(Long id) {
	
		return produitRepository.findById(id);
	}

}
