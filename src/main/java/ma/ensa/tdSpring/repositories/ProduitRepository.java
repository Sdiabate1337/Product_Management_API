package ma.ensa.tdSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ensa.tdSpring.model.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
}
