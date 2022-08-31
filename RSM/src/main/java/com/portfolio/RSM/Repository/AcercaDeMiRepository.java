
package com.portfolio.RSM.Repository;

import com.portfolio.RSM.Entity.AcercaDeMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeMiRepository extends JpaRepository<AcercaDeMi, Long> {
    
}
