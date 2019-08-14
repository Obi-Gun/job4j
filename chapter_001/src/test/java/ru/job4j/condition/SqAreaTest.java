package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void ifPerimeterIs4AndKoeffIs1ThenSqIs1() {
        int inPerim = 4;
        int inKoeff = 1;
        int expected = 1;
        int out = (int) SqArea.square(inPerim, inKoeff);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void ifPerimeterIs8AndKoeffIs1ThenSqIs4() {
        int inPerim = 8;
        int inKoeff = 1;
        int expected = 4;
        int out = (int) SqArea.square(inPerim, inKoeff);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void ifPerimeterIs12AndKoeffIs1ThenSqIs9() {
        int inPerim = 12;
        int inKoeff = 1;
        int expected = 9;
        int out = (int) SqArea.square(inPerim, inKoeff);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void ifPerimeterIs8AndKoeffIs2ThenSqIs8() {
        int inPerim = 12;
        int inKoeff = 2;
        int expected = 8;
        int out = (int) SqArea.square(inPerim, inKoeff);
        Assert.assertEquals(expected, out);
    }
}
