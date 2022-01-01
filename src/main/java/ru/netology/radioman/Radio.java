package ru.netology.radioman;

public class Radio {

    private int currentStation;

    private int currentVolume;

    private int numberOfStation = 10;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public Radio() {

    }

    public int getNumberOfStation(){
        return 10;
    }


    private int getMinStation() {

        return 0;
    }

    private int getMaxStation() {

        return 9;
    }

    private int getMinVolume() {

        return 0;
    }

    private int getMaxVolume() {

        return 100;
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