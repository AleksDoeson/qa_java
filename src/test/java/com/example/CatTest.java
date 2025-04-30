package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class CatTest {

    @Test
    public void testGetSoundReturnsMeow() {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        System.out.println("Cat says: " + cat.getSound());
        assertEquals("мяу", cat.getSound());
    }

    @Test
    public void testGetFoodReturnsMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}

