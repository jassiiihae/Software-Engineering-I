package Airplane.cabin;

import Airplane.airplanePart.AirplanePart;

public abstract class System implements ISystem {

    protected AirplanePart system;
    protected boolean isOn;
    protected boolean isCleaned;

    // initialize attributes
    protected void setSystem(String id, String type, String manufacturer){
        system.setAll(id, type, manufacturer);
        isOn = false;
        isCleaned = true;
    }

    @Override
    // version returns id and type
    public String version() {
        return system.version();
    }

    @Override
    // set isOn to true
    public void on() {
        if(!isOn) isOn = true;
    }

    @Override
    // set isOn to false
    public void off() {
        if(isOn) isOn = false;
    }

    @Override
    // set isCelaned to true
    public void clean() {
        if (!isCleaned) isCleaned = true;

    }
}