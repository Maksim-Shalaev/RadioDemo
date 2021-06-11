package ru.netology.domain;

public class Radio_demo {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation > 0) && (currentStation <= 9)) {
            currentStation = currentStation;
            this.currentStation = currentStation;
        }
    }

    public void nextCurrentStation() {
        if (currentStation >= 0) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void prevCurrentStation (){
        if (currentStation <= 9) {
            currentStation = currentStation -1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume >=0) && (currentVolume <=10)){
            currentVolume = currentVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }
}



