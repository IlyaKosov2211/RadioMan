package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setManualInstalationStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(2);
        int actual = station.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationValueAboveTheMaximum() {
        Radio station = new Radio();
        station.setManualInstalationStation(10);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setManualInstalationStationNegativeValue() {
        Radio station = new Radio();
        station.setManualInstalationStation(-2);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void setManualInstalationStationMinStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(0);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void setManualInstalationStationMaxStation() {
        Radio station = new Radio();
        station.setManualInstalationStation(9);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void ButtonNextStation() {
        Radio station = new Radio();
        station.setButtonNextStation(8);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void ButtonNextStationValueAboveTheMaximum() {
        Radio station = new Radio();
        station.setButtonNextStation(15);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void ButtonNextStationNegativeValue() {
        Radio station = new Radio();
        station.setButtonNextStation(-8);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void ButtonNextStationMinStation() {
        Radio station = new Radio();
        station.setButtonNextStation(0);
        int actual = station.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void ButtonNextStationMaxStation() {
        Radio station = new Radio();
        station.setButtonNextStation(9);
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStation() {
        Radio station = new Radio();
        int currentStation = 7;
        station.setButtonPrevStation(currentStation);
        int actual = station.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationValueAboveTheMaximum() {
        Radio station = new Radio();
        int currentStation = 12;
        station.setButtonPrevStation(currentStation);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationNegativeValue() {
        Radio station = new Radio();
        int currentStation = -2;
        station.setButtonPrevStation(currentStation);
        int actual = station.currentStation;
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationMinStation() {
        Radio station = new Radio();
        int currentStation = 0;
        station.setButtonPrevStation(currentStation);
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonPrevStationMaxStation() {
        Radio station = new Radio();
        int currentStation = 9;
        station.setButtonPrevStation(currentStation);
        int actual = station.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonIncreaseTheVolume() {
        Radio volume = new Radio();
        int currentVolume = 1;
        volume.setButtonIncreaseTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonIncreaseTheVolumeValueAboveTheMaximum() {
        Radio volume = new Radio();
        int currentVolume = 12;
        volume.setButtonIncreaseTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonIncreaseTheVolumeNegativeValue() {
        Radio volume = new Radio();
        int currentVolume = -3;
        volume.setButtonIncreaseTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonIncreaseTheVolumeMinVolume() {
        Radio volume = new Radio();
        int currentVolume = 0;
        volume.setButtonIncreaseTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonIncreaseTheVolumeMaxVolume() {
        Radio volume = new Radio();
        int currentVolume = 10;
        volume.setButtonIncreaseTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonLowerTheVolume() {
        Radio volume = new Radio();
        int currentVolume = 9;
        volume.setButtonLowerTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonLowerTheVolumeValueAboveTheMaximum() {
        Radio volume = new Radio();
        int currentVolume = 15;
        volume.setButtonLowerTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonLowerTheVolumeNegativeValue() {
        Radio volume = new Radio();
        int currentVolume = -4;
        volume.setButtonLowerTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonLowerTheVolumeMinVolume() {
        Radio volume = new Radio();
        int currentVolume = 0;
        volume.setButtonLowerTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setButtonLowerTheVolumeMaxVolume() {
        Radio volume = new Radio();
        int currentVolume = 10;
        volume.setButtonLowerTheVolume(currentVolume);
        int actual = volume.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }
}