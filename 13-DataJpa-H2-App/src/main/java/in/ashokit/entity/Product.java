package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private Integer productId;

	private String productName;

	private Double productPrice;

}
