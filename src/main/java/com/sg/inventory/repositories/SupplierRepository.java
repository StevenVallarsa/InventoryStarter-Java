
package com.sg.inventory.repositories;

import com.sg.inventory.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author StevePro
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
