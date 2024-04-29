package az.edu.turing.module02.part02.lesson12;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcAppTest {

    private CalcApp calcApp;

    @BeforeAll
    public void setUp() {
        this.calcApp = new CalcApp();
    }

    @Test
    void add() {
        int actual = calcApp.add(2, 3);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }
}