package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computers;
/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Mar 28, 2024
 */
@Repository
public interface ComputersRepository extends JpaRepository<Computers, Long> { 
	
}