package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Radio_demoTest {

    @Test
    public void shouldDisplayCurrentStation() {
        Radio_demo radio = new Radio_demo(); // проверка изменения радиостанций с помощью клавиш 0-9
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStation() { // проверка изменения радиостанций с помощью клавиши Next
        Radio_demo radio = new Radio_demo();
        radio.setCurrentStation(5);
        radio.nextCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStation() { // проверка изменения радиостанций с помощью клавиши Previous
        Radio_demo radio = new Radio_demo();
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDisplayCurrentVolume() { // проверка отображения текущего уровня громкости (0-10)
        Radio_demo radio = new Radio_demo();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolume() { // проверка увеличения уровня громкости 0-10
        Radio_demo radio = new Radio_demo();
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() { // проверка уменьшения уровня громкости 10-0
        Radio_demo radio = new Radio_demo();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
}