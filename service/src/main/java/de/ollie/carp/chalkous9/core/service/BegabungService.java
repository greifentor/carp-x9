package de.ollie.carp.chalkous9.core.service;

import de.ollie.carp.chalkous9.core.model.Abenteurer;

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

	int calculateBonusFor(Abenteurer abenteurer, Begabung begabung);

}