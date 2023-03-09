import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(4);
        radio.prevRadioStation();
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNewRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(6);
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWhenTheValuesAreGreaterThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(16);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewRadioStationWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-16);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAre10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValuesAreGreaterThan0AndLessThan10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.increaseSoundVolume();
        int expected = 5;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseSoundVolumeWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValueAre10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.decreaseSoundVolume();
        int expected = 9;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValuesAreGreaterThan0AndLessThan10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.decreaseSoundVolume();
        int expected = 3;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueAre10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValuesAreGreaterThan0AndLessThan10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(6);
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValueGreaterThan10() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(12);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewCurrentSoundVolumeWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-6);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
