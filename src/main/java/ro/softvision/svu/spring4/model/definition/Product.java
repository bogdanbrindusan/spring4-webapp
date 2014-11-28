package ro.softvision.svu.spring4.model.definition;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Product extends BaseEntity {

	private static final long serialVersionUID = -7751580326358896129L;

	@Getter
	@Setter
	private String code;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	@ManyToOne
	private Category category;

	@Getter
	@Setter
	private Double price;

	@Getter
	@Setter
	@OneToMany(mappedBy = "product")
	private List<OrderItem> orders;

}
