package de.ollie.carp.chalkous9.core.model;

public interface Abenteurer {

	public enum Characteristic {
		STAERKE,
		GESCHICKLICHKEIT,
		KONSTITUTION,
		KOERPERMASSE,
		INTELLIGENZ,
		AURA,
		CHARISMA,
		SELBSTDISZIPLIN
	}

	int getCharacteristicCurrentValue(Characteristic characteristic);

}