package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyAfter1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1450;

        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountOfAditionBuyAtTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
}

