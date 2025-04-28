package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFoodForHerbivoreReturnsPlants() throws Exception {
        List<String> food = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void getFoodForPredatorReturnsMeat() throws Exception {
        List<String> food = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test(expected = Exception.class)
    public void getFoodForUnknownAnimalThrowsException() throws Exception {
        animal.getFood("Дракон"); // неправильное животное
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {
        String family = animal.getFamily();
        assertTrue(family.contains("заячьи"));
    }
}
