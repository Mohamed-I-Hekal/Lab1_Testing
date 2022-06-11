package Lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Young_PhysTest {
    @Test

    public void CheckForceLess(){
        Young_Phys Phys = new Young_Phys();
        assertFalse(Phys.ChkValid(-101));
    }
    @Test

    public void CheckForceMore(){
        Young_Phys Phys = new Young_Phys();
        assertFalse(Phys.ChkValid(101));
    }
    @Test

    public void CheckForce(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(1));
    }
    @Test
    public void CheckForceNintynine(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(99));
    }
    @Test

    public void CheckForceHunderad(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(100));
    }
    @Test

    public void CheckForceNegHunderad(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(-100));
    }
    @Test
    public void CheckNegForce(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(1));
    }
    @Test
    public void CheckForceNegNintynine(){
        Young_Phys Phys = new Young_Phys();
        assertTrue(Phys.ChkValid(-99));
    }
    @Test
    public void CheckCode() {
        int[] testcases = {-200, -101, -100, -99, -5, 0, 1, 2, 7, 38, 99, 100, 101, 115};
        boolean valid = true;
        for (int i = 0; i <= 7; i++) {
            Young_Phys Phys = new Young_Phys();
            if (Phys.ChkValid(testcases[i]) == true && (testcases)[i] < 1 || testcases[i] > 100)
                valid = false;
            break;
        }
        assertTrue(valid);
    }
}