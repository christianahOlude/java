import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void airConditionerIsOffByDefault() {
    AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void testThatAirConditionerCanBeTurnedOnTwice() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void testThatAcIncreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.increaseTemperature();
        assertTrue(airConditioner.increaseTemperature());
    }

    @Test
    public void testThatAcDecreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.decreaseTemperature();
        assertTrue(airConditioner.decreaseTemperature());
    }

    @Test
    public void testThatAcIncreasesTwice(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertTrue(airConditioner.increaseTemperature());
    }
    @Test
    public void testThatAcDoesNotIncreaseThan30(){
        AirConditioner airConditioner = new AirConditioner();
        for(int i = 16; i <= 30; i++){
            airConditioner.increaseTemperature();
        }

        assertFalse(airConditioner.getTemperature() == 30);
    }
    @Test
    public void testThatAcDoesNotDecreaseThan16(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.decreaseTemperature();
        //assertTrue(airConditioner.decreaseTemperature());
    }

    @Test
    public void testThatAcHAsToBeOnBeforeIncreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.increaseTemperature();
       // assertFalse(airConditioner.getTemperature() == 16);
    }
    @Test
    public void testThatAcHAsToBeOnAfterDecreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.decreaseTemperature();
       // assertFalse(airConditioner.getTemperature() == 16);
    }




}