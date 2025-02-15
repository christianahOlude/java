package TvTest;


import org.junit.Test;
import TV.Television;

import static org.junit.Assert.*;

public class TelevisionTest {
    @Test
    public void testThatTelevisionIsOff() {
        Television television = new Television();
        assertFalse(television.isOn());
    }
    @Test
    public void testThatTelevisionCanBeTurnedOn() {
        Television television = new Television();
        assertTrue(television.turnOn());
    }

    @Test
    public void testThatTelevisionCanBeTurnedOff(){
        Television television = new Television();
        assertFalse(television.turnOff());
    }
    @Test
    public void testThatTelevisionCanBeTurnedOnAndVolumeCanBeIncreased() {
        Television television = new Television();
        television.turnOn();
        assertTrue(television.turnOn());
        television.increaseVolume();
        assertEquals(1,television.volumeLevel());
        television.increaseVolume();
        assertEquals(2,television.volumeLevel());
    }
    @Test
    public void testThatTelevisionCanBeOnAndVolumeCanBeDecreased() {
        Television television = new Television();
        television.turnOn();
        television.increaseVolume();
        assertEquals(1,television.volumeLevel());
        television.increaseVolume();
        assertEquals(2,television.volumeLevel());
        television.increaseVolume();
        assertEquals(3,television.volumeLevel());
        television.decreaseVolume();
        assertEquals(2,television.volumeLevel());
        television.decreaseVolume();
        assertEquals(1,television.volumeLevel());
    }
    @Test
    public void testThatTelecisionCanBeOnAndChannelIsChanged(){
        Television television = new Television();
        television.turnOn();
        television.channelUp();
    }


}
