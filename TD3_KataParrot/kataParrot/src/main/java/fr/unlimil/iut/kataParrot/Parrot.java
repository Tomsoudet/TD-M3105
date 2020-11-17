package fr.unlimil.iut.kataParrot;


public abstract class Parrot {
	private ParrotTypeEnum type;

	public Parrot(ParrotTypeEnum _type) {
		this.type = _type;
	}

	public abstract double getSpeed();

}
