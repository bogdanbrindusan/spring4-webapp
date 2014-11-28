package ro.softvision.svu.spring4.model.definition;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class OrderItem extends BaseEntity {

	private static final long serialVersionUID = 4375479433016185596L;

	@Getter
	@Setter
	@ManyToOne
	private Product product;

	@Getter
	@Setter
	@ManyToOne
	private Order order;

}
