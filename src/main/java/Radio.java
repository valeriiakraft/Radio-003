public class Radio {
    private int currentRadioStationNumber;
    private int currentSoundVolume;


    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= 9) {
            currentRadioStationNumber = newRadioStationNumber;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStation() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume <= 10) {
            currentSoundVolume = newCurrentSoundVolume;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume == 10) {
            currentSoundVolume = 10;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume == 0) {
            currentSoundVolume = 0;
            return;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }


    }
}