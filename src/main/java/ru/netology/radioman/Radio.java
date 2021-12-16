package ru.netology.radioman;

public class Radio {

    public int currentStation;

    public int currentVolume;

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

        return 10;
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
            currentStation = newCurrentStation;
        }
        if (newCurrentStation == getMaxStation()) {
            currentStation = getMaxStation();
        }
    }

    public void setButtonNextStation(int newCurrentStation) {
        if (newCurrentStation < getMaxStation()) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation > getMaxStation()) {
            currentStation = getMinStation();
        }
        if (newCurrentStation < getMinStation()) {
            currentStation = getMinStation();
        }
        if (newCurrentStation == getMinStation()) {
            currentStation = getMinStation() + 1;
        }
        if (newCurrentStation == getMaxStation()) {
            currentStation = getMinStation();
        }
    }

    public void setButtonPrevStation(int newCurrentStation) {
        if (newCurrentStation < getMaxStation()) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation > getMaxStation()) {
            currentStation = getMaxStation();
        }
        if (newCurrentStation < getMinStation()) {
            currentStation = getMaxStation();
        }
        if (newCurrentStation == getMinStation()) {
            currentStation = getMaxStation();
        }
        if (newCurrentStation == getMaxStation()) {
            currentStation = getMaxStation() - 1;
        }
    }

    public void setButtonIncreaseTheVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMaxVolume()) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
        if (newCurrentVolume < getMinVolume()) {
            currentVolume = getMinVolume();
        }
        if (newCurrentVolume == getMinVolume()) {
            currentVolume = getMinVolume() + 1;
        }
        if (newCurrentVolume == getMaxVolume()) {
            currentVolume = getMaxVolume();
        }
    }

    public void setButtonLowerTheVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMaxVolume()) {
            currentVolume = newCurrentVolume - 1;
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
            currentVolume = getMaxVolume() - 1;
        }
    }
}


