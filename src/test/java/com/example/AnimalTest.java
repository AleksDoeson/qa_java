package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void testGetFoodForHerbivoreReturnsPlants() throws Exception {
        List<String> food = animal.getFood("Травоядное");
        assertEquals("Для травоядных должен возвращаться список: Трава, Различные растения",List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void testGetFoodForPredatorReturnsMeat() throws Exception {
        List<String> food = animal.getFood("Хищник");
        assertEquals("Для хищников должен возвращаться список: Животные, Птицы, Рыба",List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test(expected = Exception.class)
    public void testGetFoodForUnknownAnimalThrowsException() throws Exception {
        animal.getFood("Дракон"); // неправильное животное
    }

    @Test
    public void testGetFamilyReturnsCorrectFamily() {
        String family = animal.getFamily();
        assertTrue("Семейство должно содержать слово 'заячьи'",family.contains("заячьи"));
    }
}
