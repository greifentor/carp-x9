package de.ollie.carp.chalkous9.core.service;

import java.util.Optional;

import de.ollie.carp.chalkous9.core.model.VolkSO;

public interface VolkService {

	VolkSO create(VolkSO model);

	Optional<VolkSO> findById(String key);

	VolkSO update(VolkSO model);

	void delete(VolkSO model);

}