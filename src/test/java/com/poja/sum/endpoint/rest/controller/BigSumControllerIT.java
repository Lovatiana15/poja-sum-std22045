package com.poja.sum.endpoint.rest.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import com.poja.sum.PojaGenerated;
import com.poja.sum.conf.FacadeIT;
import com.poja.sum.endpoint.rest.controller.BigSumController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@PojaGenerated
class BigSumControllerIT extends FacadeIT {

    @Autowired
    private BigSumController bigSumController;

    @Test
    void calculateBigSum() {
        BigInteger numA = new BigInteger("10");
        BigInteger numB = new BigInteger("20");
        BigInteger expectedResult = new BigInteger("30");
        BigSumController.BigSumService bigSumService = new BigSumController.BigSumService();
        assertEquals(expectedResult.toString(), bigSumService.calculateSum(numA, numB).toString());
    }
}

