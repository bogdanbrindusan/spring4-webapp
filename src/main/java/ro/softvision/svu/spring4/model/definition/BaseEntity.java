package ro.softvision.svu.spring4.model.definition;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

/**
 * Base entity for domain models. Contains:
 * <ul>
 * <li>id</id>
 * <li>createdDate</li>
 * <li>updatedDate</li>
 * </ul>
 * The members <strong>createdDate</strong> and <strong>updatedDate</strong> are
 * initialized and updated automatically.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 2524188337098548253L;

	@Id
	@GeneratedValue
	@Getter
	@Setter
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Getter
	@Setter
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Getter
	@Setter
	private Date updatedDate;

	@Version
	private long version;

	@PrePersist
	public void prePersist() {
		createdDate = updatedDate = new Date();

	}

	@PreUpdate
	public void preUpdate() {
		updatedDate = new Date();
	}

}
