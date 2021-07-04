package de.ollie.carp.chalkous9.core.service.port.persistence;

import java.util.Optional;

import de.ollie.carp.chalkous9.core.model.Volk;
import lombok.Generated;

/**
 * A persistence port interface for Volk CRUD operations.
 *
 * GENERATED CODE !!! DO NOT CHANGE !!!
 */
@Generated
public interface VolkPersistencePort {

	Volk create(Volk model);

	Optional<Volk> findById(String key);

	Volk update(Volk model);

	void delete(Volk model);

}