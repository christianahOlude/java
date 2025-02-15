package TV;

import java.util.ArrayList;

public class Television {
    private boolean isOn = false;
    private int count = 0;
    private int volumeLevel = count;

//
//    public Television(boolean isOn) {
//        this.isOn = false;
//    }


    public boolean turnOn(){
        if(!isOn){
            isOn = true;
        }
        return true;

    }


    public boolean isOn() {
        isOn = false;
        return isOn;
    }

    public boolean turnOff() {
        if(isOn){
            isOn = false;
        }
        return false;
    }

//    public void setChannel() {
//        for(int counter = 0; counter < setChannel(); counter++){}j
//    }

    public void increaseVolume() {
        this.count++;
    }

    public int volumeLevel() {
        return count;
    }

    public void decreaseVolume() {
        this.count--;
    }

    public void channelUp() {

    }
}
