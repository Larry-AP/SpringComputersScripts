package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Mar 28, 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Computers {
	
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private double storage;
	@Autowired
	private OperatingSystem operatingSystem;
	
}
