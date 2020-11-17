package fr.unlimil.iut.kataParrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN, 0, false);
	}
	
	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

}
