package com.safecornerscoffee.kickstarter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TravisCITest {

    @Test
    public void shouldBeFails() {
        assertThat(true).isFalse();
    }
}
