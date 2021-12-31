package de.ollie.carp.chalkous9.persistence;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import de.ollie.carp.chalkous9.persistence.converter.VolkDBOConverter;
import de.ollie.carp.chalkous9.persistence.repository.VolkDBORepository;
import de.ollie.carp.chalkous9.core.model.VolkSO;

/**
 * A DBO persistence adapter for volks.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Named
public class VolkJPAPersistenceAdapter {

	@Inject
	private VolkDBOConverter converter;
	@Inject
	private VolkDBORepository repository;

	public VolkSO create(VolkSO model) {
		model.setKey(null);
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	public Optional<VolkSO> findById(String key) {
		return repository.findById(key).map(dbo -> converter.toModel(dbo));
	}

	public VolkSO update(VolkSO model) {
		return converter.toModel(repository.save(converter.toDBO(model)));
	}

	public void delete(VolkSO model) {
		repository.deleteById(model.getKey());
	}

}