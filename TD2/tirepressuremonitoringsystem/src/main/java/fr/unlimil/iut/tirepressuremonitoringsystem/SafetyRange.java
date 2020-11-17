package fr.unlimil.iut.tirepressuremonitoringsystem;

public class SafetyRange {

	private final double lowThreshold;
	private final double highThreshold;
	
	public SafetyRange(double lowThreshold, double highThreshold) {
		this.lowThreshold = lowThreshold;
		this.highThreshold = highThreshold;	
	}
	
	public boolean contains(double value) {
		return lowThreshold <= value && value <= highThreshold;
	}
}
