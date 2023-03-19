import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadioStationWithConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio(16);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithoutConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio(48);
        radio.setCurrentRadioStationNumber(47);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithoutConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStationNumber(10);
        radio.nextRadioStation();
        int expected = 11;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWithoutConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(4);
        radio.nextRadioStation();
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationWithConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio(17);
        radio.setCurrentRadioStationNumber(0);
        radio.prevRadioStation();
        int expected = 16;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithoutConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio(22);
        radio.setCurrentRadioStationNumber(21);
        radio.prevRadioStation();
        int expected = 20;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithoutConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStationNumber(8);
        radio.prevRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWithoutConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(6);
        radio.prevRadioStation();
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio(64);
        radio.setCurrentRadioStationNumber(63);
        int expected = 63;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithoutConstructorParametersWhenTheValueAreMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio(4);
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNewRadioStationWithoutConstructorParametersWhenTheValueAreMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio(40);
        radio.setCurrentRadioStationNumber(15);
        int expected = 15;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithoutConstructorParametersWhenTheValuesAreGreaterThanMinRadioStationNumberAndLessThanMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithConstructorParametersWhenTheValuesAreGreaterThanMaxRadioStationNumber() {
        Radio radio = new Radio(17);
        radio.setCurrentRadioStationNumber(19);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithoutConstructorParametersWhenTheValuesAreGreaterThanMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(13);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithConstructorParametersWhenTheValuesAreLessThanMinRadioStationNumber() {
        Radio radio = new Radio(12);
        radio.setCurrentRadioStationNumber(-6);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWithoutConstructorParametersWhenTheValuesAreLessThanMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-4);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAreMinSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAreMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.increaseSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValuesAreGreaterThanMinSoundVolumeAndLessThanMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(48);
        radio.increaseSoundVolume();
        int expected = 49;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseSoundVolumeWhenTheValueAreMinSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValueAreMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.decreaseSoundVolume();
        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValuesAreGreaterThanMinSoundVolumeAndLessThanMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(33);
        radio.decreaseSoundVolume();
        int expected = 32;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueAreMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueAreMinSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValuesAreGreaterThanMinSoundVolumeAndLessThanMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(6);
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueGreaterThanMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(302);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValuesAreLessThanMinSoundVolumeAnd() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-6);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
