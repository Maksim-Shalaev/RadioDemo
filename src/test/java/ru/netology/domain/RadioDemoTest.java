package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioDemoTest {

    @Test
    public void shouldDisplayCurrentStation() {
        RadioDemo radio = new RadioDemo(); // проверка переключения радиостанций с помощью клавиш 0-9

        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStation() { // проверка переключения радиостанций с помощью клавиши Next
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(3);
        radio.nextCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationIfLimit() { // проверка переключения радиостанций при нажатии клавиши 9
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationOverLimit() { // проверка переключения радиостанций при нажатии клавиш 10, 11, 12 и тд
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(10);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStation() { // проверка переключения радиостанций с помощью клавиши Previous
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(6);
        radio.prevCurrentStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationIfLimit() { // проверка переключения радиостанций при нажатии клавиши 0
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationOverLimit() { // проверка переключения радиостанций при нажатии "отрицательных" клавиш
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(-1);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDisplayCurrentVolume() { // проверка отображения текущего уровня громкости (0-10)
        RadioDemo radio = new RadioDemo();
        //assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolume() { // проверка увеличения уровня громкости 0-10
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeIfLimit() { // проверка увеличения уровня громкости при нажатии клавиш более 10
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() { // проверка уменьшения уровня громкости 10-0
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeOverLimit() { // проверка уменьшения уровня громкости "отрицательными" клавишами
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(-5);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}