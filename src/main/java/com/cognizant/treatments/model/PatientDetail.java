package com.cognizant.treatments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * model class for PackageDetail
 * 
 * @Entity indicates Spring Data JPA that it is an entity class for the
 *         application
 * @Data is a convenient shortcut annotation that bundles the features
 *       of @ToString , @EqualsAndHashCode , @Getter / @Setter
 *       and @RequiredArgsConstructor together
 *
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetail {

	/**
	 * instance variables
	 * 
	 * @Id for primary key attribute
	 * @SequenceGenerator @Generatedvalue to automatically generate id's
	 */

	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "myDbSeq", initialValue = 1)
	@GeneratedValue(generator = "mySeqGen")
	private long id;

	private String name;

	private int age;

	private String ailment;

	private String treatmentPackageName;

	private String treatmentCommencementDate;

}
