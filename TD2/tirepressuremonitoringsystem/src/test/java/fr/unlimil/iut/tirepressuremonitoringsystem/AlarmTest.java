package fr.unlimil.iut.tirepressuremonitoringsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {
	 
	@Test
	public void alarm_pression_trop_basse() {
		Alarm alarm = new Alarm(sensorThatProbes(5.0), new SafetyRange(17.0, 21.0));
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void alarm_pression_trop_haute() {
		Alarm alarm = new Alarm(sensorThatProbes(25.0), new SafetyRange(17.0, 21.0));
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void alarm_pression_dans_le_seuil() {
		Alarm alarm = new Alarm(sensorThatProbes(18.0), new SafetyRange(17.0, 21.0));
		alarm.check();
		assertFalse(alarm.isAlarmOn());
	}
	
	@Test
	public void alarm_pression_reste_declenchee() {
		Alarm alarm = new Alarm(sensorThatProbes(15.0, 18.0), new SafetyRange(17.0, 21.0));
		alarm.check();
		assertTrue(alarm.isAlarmOn());
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
	
	private PressureSensor sensorThatProbes(double value) {
		PressureSensor sensor = mock(PressureSensor.class);
		when(sensor.probeValue()).thenReturn(value);
		return sensor;
	}
	
	private PressureSensor sensorThatProbes(double value1, double value2) {
		PressureSensor sensor = mock(PressureSensor.class);
		when(sensor.probeValue()).thenReturn(value1).thenReturn(value2);
		return sensor;
	}
}
