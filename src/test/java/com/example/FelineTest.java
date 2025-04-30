package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class FelineTest {

    @Test
    public void testGatMeatReturnsListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals("Метод eatMeat() должен вернуть список: Животные, Птицы, Рыба",List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        assertEquals("Метод getFamily() должен вернуть значение: Кошачьи","Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetDefaultKittensReturnsOne() {
        Feline feline = new Feline();
        assertEquals("По умолчанию метод getKittens() должен возвращать количество котят = 1",1, feline.getKittens());
    }

    @Test
    public void testGetKittensReturnsCorrectCount() {
        Feline feline = new Feline();
        assertEquals("Метод getKittens(3) должен вернуть количество котят = 3",3, feline.getKittens(3));
    }
}

