package com.bootcamp.gosling7.example_enum;

public enum Gender {
    /**
     * Enum adalah special class yang digunakan untuk mendefinisikan sekelompok constant
     * Naming convention SCREAMING_SNAKE_CASE
     */
    MALE("Laki-laki"), FEMALE("Perempuan");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Method bawaan ENUM ada 2:
     * 1. valueOf() ->  mencari ENUM berdasarkan string dan harus sama (incasesensitive)
     * 2. values()  ->  mengembalikan array of ENUM
     */
}
