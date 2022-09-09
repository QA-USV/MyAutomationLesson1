package ru.netology.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void calculateRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}