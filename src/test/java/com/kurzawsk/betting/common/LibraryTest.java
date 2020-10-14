package com.kurzawsk.betting.common;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LibraryTest {

    @Test
    public void should_return_false() {
        assertThat(Library.someLibraryMethod2()).isFalse();
    }
}