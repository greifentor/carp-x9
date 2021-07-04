package de.ollie.carp.chalkous9.persistence.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Named;

import lombok.Generated;

import de.ollie.carp.chalkous9.persistence.entity.VolkDBO;
import de.ollie.carp.chalkous9.core.model.Volk;

/**
 * A DBO converter for volks.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class VolkDBOConverter {

	public VolkDBO toDBO(Volk model) {
		if (model == null) {
			return null;
		}
		return new VolkDBO()
				.setKey(model.getKey())
				.setBasiswertAu(model.getBasiswertAu())
				.setBasiswertCh(model.getBasiswertCh())
				.setBasiswertGe(model.getBasiswertGe())
				.setBasiswertIn(model.getBasiswertIn())
				.setBasiswertKm(model.getBasiswertKm())
				.setBasiswertKo(model.getBasiswertKo())
				.setBasiswertSd(model.getBasiswertSd())
				.setBasiswertSt(model.getBasiswertSt())
				.setName(model.getName());
	}

	public Volk toModel(VolkDBO dbo) {
		if (dbo == null) {
			return null;
		}
		return new Volk()
				.setKey(dbo.getKey())
				.setBasiswertAu(dbo.getBasiswertAu())
				.setBasiswertCh(dbo.getBasiswertCh())
				.setBasiswertGe(dbo.getBasiswertGe())
				.setBasiswertIn(dbo.getBasiswertIn())
				.setBasiswertKm(dbo.getBasiswertKm())
				.setBasiswertKo(dbo.getBasiswertKo())
				.setBasiswertSd(dbo.getBasiswertSd())
				.setBasiswertSt(dbo.getBasiswertSt())
				.setName(dbo.getName());
	}

}