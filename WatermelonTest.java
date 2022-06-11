package Lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void CheckSizeZero(){
        Watermelon Water = new Watermelon();
        assertFalse(Water.CheckWaterSize(0));
    }

    @Test
    public void CheckSizeFalse(){
        Watermelon Water = new Watermelon();
        assertFalse(Water.CheckWaterSize(55));

    }
    @Test
    public void CheckSizeTwo(){
        Watermelon Water = new Watermelon();
        assertFalse(Water.CheckWaterSize(2));

    }
    @Test
    public void CheckSizeHund(){
        Watermelon Water = new Watermelon();
        assertTrue(Water.CheckWaterSize(100));

    }
    @Test

    public void CheckSizeTrue() {
        Watermelon Water = new Watermelon();
        assertTrue(Water.CheckWaterSize(66));

    }
    @Test
    public void CheckSizeOne(){
        Watermelon Water = new Watermelon();
        assertFalse(Water.CheckWaterSize(1));

    }
    @Test
    public void CheckSizeTwoHund(){
        Watermelon Water = new Watermelon();
        assertFalse(Water.CheckWaterSize(200));

    }
}

