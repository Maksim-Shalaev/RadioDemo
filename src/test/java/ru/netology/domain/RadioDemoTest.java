package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioDemoTest {

    RadioDemo radio = new RadioDemo();

    @Test
    public void shouldSetMaxStation() { // проверка максимального количества радиостанции
        RadioDemo radio = new RadioDemo(12);
        assertEquals(12, radio.getMaxStation());
    }

    @Test
    public void shouldNextWithNewMaxStation() { // проверка изменения станций в пределах максимального количества
        RadioDemo radio = new RadioDemo(12);
        radio.setCurrentStation(11);
        radio.nextCurrentStation();
        assertEquals(12,radio.getCurrentStation());
    }

    @Test
    public void shouldDisplayCurrentStation() { // проверка переключения радиостанций с помощью клавиш 0-9
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStation() { // проверка переключения радиостанций с помощью клавиши Next
        radio.setCurrentStation(3);
        radio.nextCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationIfLimit() { // проверка переключения радиостанций при нажатии клавиши 10
        radio.setCurrentStation(10);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationOverLimit() { // проверка переключения радиостанций при нажатии клавиш 10, 11, 12 и тд
        radio.setCurrentStation(111);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStation() { // проверка переключения радиостанций с помощью клавиши Previous
        radio.setCurrentStation(6);
        radio.prevCurrentStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationIfLimit() { // проверка переключения радиостанций при нажатии клавиши 0
        radio.setCurrentStation(10);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationOverLimit() { // проверка переключения радиостанций при нажатии "отрицательных" клавиш
        radio.setCurrentStation(-1);
        radio.prevCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldDisplayCurrentVolume() { // проверка отображения текущего уровня громкости (0-100)
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolume() { // проверка увеличения уровня громкости 0-100
        radio.setCurrentVolume(95);
        radio.increaseCurrentVolume();
        assertEquals(96, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeIfLimit() { // проверка увеличения уровня громкости при нажатии клавиш более 100
        radio.setCurrentVolume(101);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() { // проверка уменьшения уровня громкости 100-0
        radio.setCurrentVolume(99);
        radio.decreaseCurrentVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeOverLimit() { // проверка уменьшения уровня громкости "отрицательными" клавишами
        radio.setCurrentVolume(-5);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}