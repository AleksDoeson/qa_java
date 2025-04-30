package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void testMaleLionHasMane() throws Exception {
        Lion lion = new Lion("самец", feline);
        assertTrue("Самец льва должен иметь гриву",lion.doesHaveMane());
    }

    @Test
    public void testFemaleLionDoesNotHaveMane() throws Exception {
        Lion lion = new Lion("самка", feline);
        assertFalse("Самка льва не должна иметь гриву",lion.doesHaveMane());
    }

    @Test
    public void testLionWithWrongSexThrowsException() {
        try {
            new Lion("Дракон", feline); // неправильный пол
            fail("Ожидалось исключение, но его не было");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void testGetKittensReturnsFelineKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("самец", feline);
        assertEquals("Лев должен вернуть количество котят, равное 3",3, lion.getKittens());
    }

    @Test
    public void testGetFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("самец", feline);
        assertEquals("Для льва (хищника) должен быть возвращен список еды: Животные, Птицы, Рыба",expectedFood, lion.getFood());
    }
}



