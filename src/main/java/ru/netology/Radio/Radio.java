package ru.netology.Radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void nextRadioStationBeforeMax() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        return;
    }
    public void nextRadioStationAfterMax() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStationBeforeMin() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }
    public void prevRadioStationAfterMin() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void nextVolumeBeforeMax() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void nextVolumeAfterMax() {
        if (currentVolume == 10) {
            currentVolume = 0;
        }
    }
    public void prevVolumeBeforeMin() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void prevVolumeAfterMin() {
        if (currentVolume == 0) {
            currentVolume = 10;
        }
    }
}