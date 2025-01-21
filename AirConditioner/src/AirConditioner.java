//package AirConditioner.src;

public class AirConditioner {
    private boolean isOn = false;
    private int temperatureDegree = 16;

    public void turnOn(){
        if(!this.isOn) this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        if(isOn) this.isOn = false;
    }

    public boolean increaseTemperature(){
        if(this.temperatureDegree >= 16) {
            temperatureDegree++;
        }else {
            temperatureDegree = 16;
        }
        return true;
    }

    public boolean decreaseTemperature() {
        if(this.temperatureDegree <= 30){
            temperatureDegree--;
        }else {
            temperatureDegree = 30;
        }
        return true;
    }

    public int getTemperature() {
        return this.temperatureDegree;
    }
}


































