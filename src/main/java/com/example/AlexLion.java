package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private static final List<String> FRIENDS = List.of("Марти", "Глория", "Мелман");
    private static final String PLACE_OF_LIVING = "Нью-Йоркский зоопарк";

    public AlexLion(Feline feline) throws Exception {
        super("самец", feline);
    }

    /**
     * Возвращает список друзей Алекса.
     */
    public List<String> getFriends() {
        return FRIENDS;
    }

    /**
     * Возвращает место проживания Алекса.
     */
    public String getPlaceOfLiving() {
        return PLACE_OF_LIVING;
    }

    /**
     * Алекс не имеет котят.
     */
    @Override
    public int getKittens() {
        return 0;
    }
}


