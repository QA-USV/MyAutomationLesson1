package ru.netology.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CashbackHackServiceTest {

    @Test
    void calculateRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRemainIfAmountZero() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRemainIfAmountOne() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRemainIfAmountOneThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRemainIfAmountMoreThenThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1010;

        int expected = 990;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateRemainIfAmountTwoThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}