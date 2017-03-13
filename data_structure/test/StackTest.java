import api.StackInterface;
import impl.StackImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ERIC_LAI on 2017-03-07.
 */
public class StackTest {

    @Before
    public void before() {
        System.out.println("=====================================================================");
        System.out.println("==================== Running the stack test case ====================");
        System.out.println("=====================================================================");
    }

    @After
    public void after() {
        System.out.println("=====================================================================");
        System.out.println("===================== End of the stack test case ====================");
        System.out.println("=====================================================================");
    }

    @Test
    public void test1() {

        // please change the null to the stack class name you created !!!
        StackInterface<Integer> stack = new StackImpl<>();
        int[] result = new int[10];
        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        for (int i = 1; i <= 10; i++) {
            result[i - 1] = stack.pop();
        }

        Assert.assertArrayEquals(expected, result);
    }

}
