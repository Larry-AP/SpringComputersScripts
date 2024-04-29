package dmacc.beans;

import jakarta.persistence.Embeddable;
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
@Embeddable
public class OperatingSystem {
	
	private String os;
	private double version;
	private String architecture;
	
	

}
