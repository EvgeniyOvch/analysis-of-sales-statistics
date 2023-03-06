import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {
    private SalesManager salesManager;
    @BeforeEach
    void start (){
        salesManager = new SalesManager (new long[] {50, 70, 256, 400});
    }

    @Test
    void min () {
        long result = salesManager.max();
        Assertions.assertEquals(50,result);
    }

    @Test
    void max() {
        long result = salesManager.max();
        Assertions.assertEquals(400,result);
    }

    @Test
    void aver() {
        long result = salesManager.aver();
        Assertions.assertEquals(163,result);
    }
}