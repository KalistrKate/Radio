package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(30);
    @Test
    public void Test() {

        radio.setCurrentRadioStation(30);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestCurrentStation() {

        radio.setCurrentRadioStation(29);

        int expected = 29;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestRadioNotShouldNextStation() {

        radio.setCurrentRadioStation(29);
        int expected = 0;
        int actual = radio.nextRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestRadioShouldNextStation() {

        radio.setCurrentRadioStation(27);
        int expected = 28;
        int actual = radio.nextRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestRadioNotShouldPrevStation() {

        radio.setCurrentRadioStation(0);
        int expected = 29;
        int actual = radio.prevRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestRadioShouldPrevStation() {

        radio.setCurrentRadioStation(28);
        int expected = 27;
        int actual = radio.prevRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeTest(){
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeTest(){
        radio.setCurrentVolume(5);
        int expected = 6;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMaxTest(){
        radio.setCurrentVolume(100);
        int expected = 100;

        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinTest() {
        radio.setCurrentVolume(0);
        int expected = 0;

        int actual = radio.prevVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTest() {
        radio.setCurrentVolume(50);
        int expected = 49;

        int actual = radio.prevVolume();
        Assertions.assertEquals(expected, actual);
    }
}