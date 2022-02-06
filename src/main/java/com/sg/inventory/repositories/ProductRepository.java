
package com.sg.inventory.repositories;

import com.sg.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StevePro
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
