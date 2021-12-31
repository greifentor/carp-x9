package de.ollie.carp.chalkous9.core.service.impl;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import de.ollie.carp.chalkous9.core.model.VolkSO;
import de.ollie.carp.chalkous9.core.service.VolkService;
import de.ollie.carp.chalkous9.core.service.port.persistence.VolkPersistencePort;
import lombok.Generated;

/**
 * A service interface implementation for Volk management.
 * 
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
@Named
public class VolkServiceImpl implements VolkService {

	@Inject
	private VolkPersistencePort persistencePort;

	@Override
	public VolkSO create(VolkSO model) {
		return persistencePort.create(model);
	}

	@Override
	public Optional<VolkSO> findById(String key) {
		return persistencePort.findById(key);
	}

	@Override
	public VolkSO update(VolkSO model) {
		return persistencePort.update(model);
	}

	@Override
	public void delete(VolkSO model) {
		persistencePort.delete(model);
	}

}
