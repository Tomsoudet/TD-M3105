package fr.unlimil.iut.kataParrot;

public class AfricanParrot extends Parrot {
	
	int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(Constantes.MINSPEED, Constantes.BASESPEED - Constantes.LOADFACTOR * numberOfCoconuts);
	}
	
	
}
