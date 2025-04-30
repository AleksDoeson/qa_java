package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class FelineTest {

    @Test
    public void testGatMeatReturnsListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetDefaultKittensReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensReturnsCorrectCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}

