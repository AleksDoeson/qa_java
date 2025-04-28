package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class AlexLionTest {

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        Feline feline = mock(Feline.class);
        AlexLion alex = new AlexLion(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsCorrectPlace() throws Exception {
        Feline feline = mock(Feline.class);
        AlexLion alex = new AlexLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        Feline feline = mock(Feline.class);
        AlexLion alex = new AlexLion(feline);
        assertEquals(0, alex.getKittens());
    }
}

