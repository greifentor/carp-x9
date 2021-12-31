package de.ollie.carp.chalkous9.core.service.port.persistence;

import java.util.Optional;

import de.ollie.carp.chalkous9.core.model.VolkSO;
import lombok.Generated;

/**
 * A persistence port interface for Volk CRUD operations.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface VolkPersistencePort {

	VolkSO create(VolkSO model);

	Optional<VolkSO> findById(String key);

	VolkSO update(VolkSO model);

	void delete(VolkSO model);

}