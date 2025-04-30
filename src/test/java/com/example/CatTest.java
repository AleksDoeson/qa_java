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
        assertEquals("Ожидался звук 'Мяу', но получено: ","мяу", cat.getSound());
    }

    @Test
    public void testGetFoodReturnsMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals("Для кошки должен быть возвращен список: Животные, Птицы, Рыба",List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}

