package csku.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollectionTest {
    @Test
    public void testSizeZero() {
        ArrayCollection arrayC = new ArrayCollection(10);
        assertEquals(10, arrayC.size() );
    }
}
