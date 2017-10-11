package com.yoan;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void testAddDotToTheEnd() {
        String message = "blabla";
        String finalMessage = "blabla.";

        assertEquals(finalMessage, Main.addDotToTheEnd(message));
    }

}