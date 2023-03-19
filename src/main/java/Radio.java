public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber;
    private int maxSoundVolume= 100;
    private int minSoundVolume= 0;

    public Radio(int numberOfRadioStations){
   maxRadioStationNumber=numberOfRadioStations-1;
    }
    public Radio(){
        maxRadioStationNumber = 9;
    }


    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= maxRadioStationNumber) {
            if (newRadioStationNumber >= 0) {
                currentRadioStationNumber = newRadioStationNumber;
            }
        }
    }


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStation() {
        if (currentRadioStationNumber ==  maxRadioStationNumber) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber =  maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume <= maxSoundVolume) {
            if (newCurrentSoundVolume >= minSoundVolume) {
                currentSoundVolume = newCurrentSoundVolume;
            }
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume == minSoundVolume) {
            currentSoundVolume = minSoundVolume;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }


    }
}