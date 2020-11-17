package fr.unlimil.iut.tirepressuremonitoringsystem;

public class Alarm {
	
	private SafetyRange safetyRange;
	private boolean alarmOn;
	private Sensor sensor;
	
	public Alarm(Sensor sensor, SafetyRange safetyRange ) {
		this.alarmOn = false;
		this.sensor = sensor;
		this.safetyRange = safetyRange;
	}
	
	
	
	public void check() {
		double presValue = sensor.probeValue();
		if (isNotSafe(presValue)) {
			activateAlarm();
		}
	}



	private void activateAlarm() {
		this.alarmOn = true;
	}

	private boolean isNotSafe(double value) {
		return !safetyRange.contains(value);
	}
	
	public boolean isAlarmOn() {
		return alarmOn;
	}
}
