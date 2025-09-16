package com.cafe.cafetdd.unit;

import com.cafe.cafetdd.unit.Beverage.Americano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();

        assertEquals(americano.getName(), "Americano");

        // 위에 코드보다 훨씬 더 명시적
        assertThat(americano.getName()).isEqualTo("Americano");
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();

        assertThat(americano.getPrice()).isEqualTo(3000);
    }
}
