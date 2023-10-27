package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldCalculateAmountOfAditionBuyIfBuyAfter1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1450;

        int actual = service.remain(amount);
        int expected = 550;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateAmountOfAditionBuyAtTheBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
}
