package com.poja.sum.endpoint.rest.controller;
import com.poja.sum.PojaGenerated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;
@PojaGenerated
@RestController
public class BigSumController {
    @Service
    public static class BigSumService {
        public BigInteger calculateSum(BigInteger a, BigInteger b) {
            return a.add(b);
        }
    }
    private final BigSumService bigSumService;
    @Autowired
    public BigSumController(BigSumService bigSumService) {
        this.bigSumService = bigSumService;
    }
    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam("a") BigInteger a, @RequestParam("b") BigInteger b) {
        BigInteger result = bigSumService.calculateSum(a, b);
        return result.toString();
    }
}
