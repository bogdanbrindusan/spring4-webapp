package ro.softvision.svu.spring4.model.definition;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Order extends BaseEntity {

	private static final long serialVersionUID = -3300469293451458934L;

	@Getter
	@Setter
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems;

	@Getter
	@Setter
	private Double total;
}
