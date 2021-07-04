package de.ollie.carp.chalkous9.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * A DBO for volks.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Accessors(chain = true)
@Data
@Generated
@Entity(name = "Volk")
@Table(name = "VOLK")
public class VolkDBO {

	@Id
	@Column(name = "KEY")
	private String key;
	@Column(name = "BASISWERT_AU")
	private int basiswertAu;
	@Column(name = "BASISWERT_CH")
	private int basiswertCh;
	@Column(name = "BASISWERT_GE")
	private int basiswertGe;
	@Column(name = "BASISWERT_IN")
	private int basiswertIn;
	@Column(name = "BASISWERT_KM")
	private int basiswertKm;
	@Column(name = "BASISWERT_KO")
	private int basiswertKo;
	@Column(name = "BASISWERT_SD")
	private int basiswertSd;
	@Column(name = "BASISWERT_ST")
	private int basiswertSt;
	@Column(name = "NAME")
	private String name;

}