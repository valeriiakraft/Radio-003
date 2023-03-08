public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

    public void nextRadioStation() {
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 0;
            return;
        }
        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
            return;
        }
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        }
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return;
        }
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
            return;
        }
        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 9;
            return;
        }

        if (currentRadioStationNumber <= 9){
            currentRadioStationNumber = currentRadioStationNumber - 1;

    }
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber >= 0) {
            if (newRadioStationNumber <= 9) {
                currentRadioStationNumber = newRadioStationNumber;
            }

        }
        return;
    }

    public void increaseSoundVolume() {
        if (soundVolume >= 0) {
            if (soundVolume < 10) {
                soundVolume = soundVolume + 1;
                return;
            }

        }
        if (soundVolume < 0) {
            soundVolume = 0;
            return;
        }
        if (soundVolume >= 10) {
            soundVolume = 10;
        }

    }

    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            if (soundVolume <= 10) {
                soundVolume = soundVolume - 1;
                return;
            }

        }
        if (soundVolume <= 0) {
            soundVolume = 0;
            return;
        }
        if (soundVolume > 10) {
            soundVolume = 10;
        }

    }
}