package fr.unlimil.iut.tirepressuremonitoringsystem;

import java.util.Random;

public class PressureSensor implements Sensor
{

	public static final double OFFSET = 16;
	private static Random rando = new Random();
	
	@Override
	public double probeValue()
	{
		double pressureTelemetryValue;
		pressureTelemetryValue = samplePressure();
		return OFFSET + pressureTelemetryValue;
	}

	private static double samplePressure()
	{
		return 6 * rando.nextDouble() * rando.nextDouble();
	}
} 