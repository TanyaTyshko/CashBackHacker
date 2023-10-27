package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testFinalBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testBuyOneHundredMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testBuyOneMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testBuyOneHundredAndOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 899;

        int actual = service.remain(amount);
        int expected = 101;

        Assert.assertEquals(actual, expected);
    }
}
