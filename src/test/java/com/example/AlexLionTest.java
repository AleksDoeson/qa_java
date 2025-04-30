package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class AlexLionTest {

    private AlexLion alex;

    @Before
    public void setUp() throws Exception {
        Feline feline = mock(Feline.class);
        alex = new AlexLion(feline);
    }

    @Test
    public void testGetFriendsReturnsCorrectList() {
        assertEquals("Должен вернуть список друзей: Марти, Глория, Мелман",
                List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLivingReturnsCorrectPlace() {
        assertEquals("Должен вернуть место проживания: Нью-Йоркский зоопарк",
                "Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittensReturnsZero() {
        assertEquals("Алекс не должен иметь детей", 0, alex.getKittens());
    }
}



