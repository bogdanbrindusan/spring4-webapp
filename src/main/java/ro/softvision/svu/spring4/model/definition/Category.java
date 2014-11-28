package ro.softvision.svu.spring4.model.definition;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Category extends BaseEntity {

	private static final long serialVersionUID = -5584338950259783409L;

	@Getter
	@Setter
	private String code;

	@Getter
	@Setter
	private String name;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter
	@Setter
	private List<Product> products;

}
