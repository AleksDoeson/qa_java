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
    public void maleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionDoesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionWithWrongSexThrowsException() throws Exception {
        new Lion("Дракон", feline); // неправильный пол
    }

    @Test
    public void getKittensReturnsFelineKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", feline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", feline);
        assertEquals(expectedFood, lion.getFood());
    }
}


