import api.StackInterface;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.interfaces.RSAKey;

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
        StackInterface<Integer> stack = null;
        int[] result = new int[10];
        int[] expected = new int[10];

        pushAndPop(stack, expected, result);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {

        // please change the null to the stack class name you created !!!
        StackInterface<Integer> stack = null;
        stack.setCapacity(5);
        int[] result = new int[10];
        int[] expected = new int[10];

        pushAndPop(stack, expected, result);

        Assert.assertArrayEquals(expected, result);
    }


    private void pushAndPop(StackInterface<Integer> stack, int[] expected, int[] result) {

        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            expected[i - 1] = i;
        }

        for (int i = 1; i <= 10; i++) {
            result[i - 1] = stack.pop();
        }
    }


}
