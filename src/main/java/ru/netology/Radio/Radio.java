package ru.netology.Radio;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    private int currentVolume;
    private int stationsCount;


    public Radio(int stationsCount) {

        this.maxRadioStation = stationsCount -1;
    }
    public Radio() {

    }
    public int getMinRadioStation() {

        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int nextRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > maxRadioStation) {
            return minRadioStation;
        }
        return currentRadioStation;
        }

    public int prevRadioStation() {
        currentRadioStation = currentRadioStation -1;
        if (currentRadioStation < minRadioStation) {
            return maxRadioStation;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        return currentVolume;
    }
}