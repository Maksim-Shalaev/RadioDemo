package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioDemoTest {

    @Test
    public void shouldDisplayCurrentStation() {
        RadioDemo radio = new RadioDemo(); // проверка изменения радиостанций с помощью клавиш 0-9
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStation() { // проверка изменения радиостанций с помощью клавиши Next
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(3);
        radio.nextCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStation() { // проверка изменения радиостанций с помощью клавиши Previous
        RadioDemo radio = new RadioDemo();
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDisplayCurrentVolume() { // проверка отображения текущего уровня громкости (0-10)
        RadioDemo radio = new RadioDemo();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolume() { // проверка увеличения уровня громкости 0-10
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() { // проверка уменьшения уровня громкости 10-0
        RadioDemo radio = new RadioDemo();
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
}