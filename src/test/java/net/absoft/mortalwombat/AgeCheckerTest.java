package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;
public class AgeCheckerTest {
    @Test
    public void testAgeUserAblePlayGame() {
        AgeChecker ageChecker = new AgeChecker();
        ageChecker.setMinAge(17);

        Assert.assertTrue(ageChecker.isUserAdult(18), "valid Age User is not able for playing game");

    }
    @Test
    public void testAgeUserCantPlayGame(){
        AgeChecker ageChecker =new AgeChecker();
        ageChecker.setMinAge(18);
        Assert.assertFalse(ageChecker.isUserAdult(14),"not valid Age .// for playing game ");
    }
}
