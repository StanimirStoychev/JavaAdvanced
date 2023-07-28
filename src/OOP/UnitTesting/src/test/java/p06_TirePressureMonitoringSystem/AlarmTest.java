package p06_TirePressureMonitoringSystem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {

    @Test
    public void testAlarmOnWithLowPressure() {
        Sensor sensorWithLowPressure = mock(Sensor.class);
        when(sensorWithLowPressure.popNextPressurePsiValue()).thenReturn(12.0);
        Alarm alarm = new Alarm(sensorWithLowPressure);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmOnWithNormalPressure() {
        Sensor sensorWithLowPressure = mock(Sensor.class);
        when(sensorWithLowPressure.popNextPressurePsiValue()).thenReturn(20.0);
        Alarm alarm = new Alarm(sensorWithLowPressure);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmOnWithHighPressure() {
        Sensor sensorWithLowPressure = mock(Sensor.class);
        when(sensorWithLowPressure.popNextPressurePsiValue()).thenReturn(30.0);
        Alarm alarm = new Alarm(sensorWithLowPressure);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }
}