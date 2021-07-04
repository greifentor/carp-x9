package de.ollie.carp.chalkous9.core.service;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import de.ollie.carp.chalkous9.core.model.Volk;
import de.ollie.carp.chalkous9.core.service.port.persistence.VolkPersistencePort;
import lombok.Generated;

/**
 * A service interface implementation for Volk management.
 * 
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class VolkService {

	@Inject
	private VolkPersistencePort persistencePort;

	public Volk create(Volk model) {
		return persistencePort.create(model);
	}

	public Optional<Volk> findById(String key) {
		return persistencePort.findById(key);
	}

	public Volk update(Volk model) {
		return persistencePort.update(model);
	}

	public void delete(Volk model) {
		persistencePort.delete(model);
	}

}
