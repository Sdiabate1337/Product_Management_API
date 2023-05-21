package ma.ensa.tdSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ma.ensa.tdSpring.model.Produit;
@Service
public interface ProduitService {

	void inserer(Produit p);
	List<Produit> findAll();
	Optional<Produit> findById(Long id);
}
