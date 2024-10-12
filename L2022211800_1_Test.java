import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 测试类：FractionToDecimalTest
 *
 * 测试用例设计原则：
 * 本测试类遵循等价类划分原则，即根据输入数据的不同分类，对每个分类进行测试。
 * 本例中，我们将输入数据分类为：
 * 1. 结果为整数
 * 2. 相同符号的整数相除
 * 3. 不同符号的小数相除
 * 4. 循环小数
 */

public class L2022211800_1_Test {

    private Solution1 solution = new Solution1();

    /**
     * 测试目的：测试两个整数是否能正确转换为小数。
     * 测试用例：numerator = 2, denominator = 1
     */
    @Test
    public void testInteger1() {
        String expected = "2";
        String actual = solution.fractionToDecimal(2, 1);
        assertEquals(expected, actual);
    }
    @Test
    public void testInteger2() {
        String expected = "100";
        String actual = solution.fractionToDecimal(10000, 100);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：测试两个相同符号的整数和小数是否能正确转换为小数。
     * 测试用例：numerator = 1, denominator = 2
     */
    @Test
    public void testSameSignFraction() {
        String expected = "0.5";
        String actual = solution.fractionToDecimal(1, 2);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：测试两个不同符号的整数和小数是否能正确转换为小数。
     * 测试用例：numerator = -1, denominator = 2
     */
    @Test
    public void testDifferentSignFraction() {
        String expected = "-0.5";
        String actual = solution.fractionToDecimal(-1, 2);
        assertEquals(expected, actual);
    }

    /**
     * 测试目的：测试循环小数是否能正确转换为小数。
     * 测试用例：numerator = 4, denominator = 333
     */
    @Test
    public void testCyclicFraction() {
        String expected = "0.(012)";
        String actual = solution.fractionToDecimal(4, 333);
        assertEquals(expected, actual);
    }
    @Test
    public void testCyclicFraction1() {
        String expected = "2.(3)";
        String actual = solution.fractionToDecimal(7, 3);
        assertEquals(expected, actual);
    }



}
