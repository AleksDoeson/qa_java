package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}

