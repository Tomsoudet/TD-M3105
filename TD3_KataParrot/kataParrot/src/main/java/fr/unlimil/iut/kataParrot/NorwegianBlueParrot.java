package fr.unlimil.iut.kataParrot;

public class NorwegianBlueParrot extends Parrot {
	
	private double voltage;
	private boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	private double getBaseSpeed(double voltage) {
		return Math.min(Constantes.MAXSPEED, voltage * Constantes.BASESPEED);
	}
}
