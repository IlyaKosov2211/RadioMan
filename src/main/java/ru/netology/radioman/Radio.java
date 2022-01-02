package ru.netology.radioman;

public class Radio {

    private int currentStation;

    private int currentVolume;

    private int numberOfStations = 10;

    private int minStation = 0;

    private int maxStation = 9;

    private int minVolume = 0;

    private int maxVolume = 100;

    public Radio(int currentStation, int currentVolume, int numberOfStations, int minStation, int maxStation, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.numberOfStations = numberOfStations;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    private int getMinStation() {

        return minStation;
    }

    private int getMaxStation() {

        return maxStation;
    }

    private int getMinVolume() {

        return minVolume;
    }

    private int getMaxVolume() {

        return maxVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setManualInstalationStation(int newCurrentStation) {
        if (newCurrentStation < getMaxStation()) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation > getMaxStation()) {
            currentStation = getMinStation();
        }
        if (newCurrentStation < getMinStation()) {
            currentStation = getMinStation();
        }

        if (newCurrentStation == getMinStation()) {
            currentStation = getMinStation();
        }
        if (newCurrentStation == getMaxStation()) {
            currentStation = getMaxStation();
        }
    }

    public void buttonNextStation() {
        int newStation = currentStation + 1;
        currentStation = newStation;
        if (newStation > getMaxStation()) {
            currentStation = getMinStation();
        }
    }

    public void buttonPrevStation() {
        int newStation = currentStation - 1;
        currentStation = newStation;
        if (newStation < getMinStation()) {
            currentStation = getMaxStation();
        }
    }

    public void setManualInstalationVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMaxVolume()) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume > getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
        if (newCurrentVolume < getMinVolume()) {
            currentVolume = getMinVolume();
        }
        if (newCurrentVolume == getMinVolume()) {
            currentVolume = getMinVolume();
        }
        if (newCurrentVolume == getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
    }

    public void buttonIncreaseTheVolume() {
        int newVolume = currentVolume + 1;
        currentVolume = newVolume;
        if (newVolume > getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
    }

    public void buttonLowerTheVolume() {
        int newVolume = currentVolume - 1;
        currentVolume = newVolume;
        if (newVolume < getMinVolume()) {
            currentVolume = getMinVolume();
        }
    }


}