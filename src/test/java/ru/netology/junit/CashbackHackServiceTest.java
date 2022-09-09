package ru.netology.junit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfAmountZero() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfAmountOne() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfAmountOneThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfAmountMoreThenThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1010;

        int expected = 990;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfAmountTwoThousand() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}