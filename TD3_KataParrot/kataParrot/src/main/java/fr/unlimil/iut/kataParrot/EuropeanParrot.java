package fr.unlimil.iut.kataParrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN);
	}
	
	@Override
	public double getSpeed() {
		return Constantes.BASESPEED;
	}

}
