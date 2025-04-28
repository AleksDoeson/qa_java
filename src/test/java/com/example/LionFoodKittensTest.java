package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class LionFoodKittensTest {

    @Test
    public void getFoodReturnsListOfFood() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void getKittensReturnsCorrectCount() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка", feline);
        assertEquals(1, lion.getKittens());
    }
}

