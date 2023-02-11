package absofy.Discriminant.Executor;

import net.absofy.DiscriminantExecutor.Calculator;
import net.absofy.DiscriminantExecutor.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DiscriminantExecutorTest {

    @Test

    public void ReturnNullIfDiscriminantNegativeTest() { //Discriminant here is <0
        Calculator calculator = new Calculator();
        Solution solution = calculator.findRootsQuadraticEquation(1, 0, 4);
        Assert.assertNull(solution.getX1());
        Assert.assertNull(solution.getX2());


    }

    @Test
    public void ReturnRootsIfDiscriminantEqualZeroTest() { //Discriminant here is ==0

        Calculator calculator = new Calculator();
        Solution solution = calculator.findRootsQuadraticEquation(1, 4, 4);
        Assert.assertNotNull(solution);
        Assert.assertEquals(solution.getX1(), solution.getX2());

    }
@Test
    public void ReturnRootsIfDiscriminantPositive() { //Discriminant here is ==0

        Calculator calculator = new Calculator();
        Solution solution = calculator.findRootsQuadraticEquation(1, 50, 4);
        Assert.assertNotNull(solution);
        Assert.assertNotEquals(solution.getX1(), solution.getX2());
    }
}













