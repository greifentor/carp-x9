package de.ollie.carp.chalkous9.core.service;

import de.ollie.carp.chalkous9.core.model.Adventurer;

public interface BegabungService {

	public enum Begabung {
		FERNKAMPF,
		GEWANDTHEIT,
		HANDGEMENGE,
		HANDWERK,
		HEIMLICHKEIT,
		KOMMUNIKATION,
		MAGIE,
		NAHKAMPF,
		SPRACHEN,
		ÜBERLEBEN,
		WAHRNEHMUNG,
		WISSEN
	}

	int calculateBonusFor(Adventurer aventurer, Begabung begabung);

}