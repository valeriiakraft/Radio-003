import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 9;
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 5;
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValuesAreGreaterThan9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 15;
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = -7;
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 0;
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 9;
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 4;
        radio.prevRadioStation();
        int expected = 3;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValuesAreGreaterThan9() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = 15;
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.currentRadioStationNumber = -4;
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newRadioStationWhenTheValueAre9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newRadioStationWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newRadioStationWhenTheValuesAreGreaterThan0AndLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(6);
        int expected = 6;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newRadioStationWhenTheValuesAreGreaterThan9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(15);
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newRadioStationWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-4);
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.soundVolume = 0;
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValueAre10() {
        Radio radio = new Radio();
        radio.soundVolume = 10;
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValuesAreGreaterThan0AndLessThan10() {
        Radio radio = new Radio();
        radio.soundVolume = 4;
        radio.increaseSoundVolume();
        int expected = 5;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValuesAreGreaterThan10() {
        Radio radio = new Radio();
        radio.soundVolume = 15;
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.soundVolume = -6;
        radio.increaseSoundVolume();
        int expected = 0;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValueAre0() {
        Radio radio = new Radio();
        radio.soundVolume = 0;
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValueAre10() {
        Radio radio = new Radio();
        radio.soundVolume = 10;
        radio.decreaseSoundVolume();
        int expected = 9;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValuesAreGreaterThan0AndLessThan10() {
        Radio radio = new Radio();
        radio.soundVolume = 4;
        radio.decreaseSoundVolume();
        int expected = 3;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValuesAreGreaterThan10() {
        Radio radio = new Radio();
        radio.soundVolume = 28;
        radio.decreaseSoundVolume();
        int expected = 10;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeWhenTheValuesAreLessThan0() {
        Radio radio = new Radio();
        radio.soundVolume = -8;
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.soundVolume;
        Assertions.assertEquals(expected, actual);
    }

}
