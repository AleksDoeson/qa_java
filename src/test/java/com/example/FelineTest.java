package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getDefaultKittensReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnsCorrectCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}

