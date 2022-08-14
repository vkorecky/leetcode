import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3,3}, 6));
    }
}