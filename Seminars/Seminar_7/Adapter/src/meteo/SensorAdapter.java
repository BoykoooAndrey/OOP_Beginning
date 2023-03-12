package meteo;

import java.time.LocalDateTime;

import meteo.metSensors.MeteoSensor;
import meteo.tempSensors.*;

public class SensorAdapter implements MeteoSensor{

    SensorTemperature adpt;
    public SensorAdapter(SensorTemperature adpt) {
        this.adpt = adpt;
    }

    @Override
    public int getId() {
        return adpt.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adpt.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime result = LocalDateTime.of(adpt.year(), 1, 1, 0,0,0);
        
        return result.plusDays(adpt.day()-1).plusSeconds(adpt.second());
    }
    
}
