package fr.unlimil.iut.kataParrot;

public class AfricanParrot extends Parrot {
	private static final double LOADFACTOR = 9.0;
	
	int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN,  0, false);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - LOADFACTOR * numberOfCoconuts);
	}
	
	
}
