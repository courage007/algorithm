package com.github.courage007.commondivisor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * [最大公约数测试类]
 *
 * @author: courage007
 * @date: 2021/10/27 23:43
 */
public class GreatestCommonDivisorTest {
    @Test
    public void testGcd() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        assertEquals(5, greatestCommonDivisor.gcdInBruteForce(5, 10));
        assertEquals(1, greatestCommonDivisor.gcdInBruteForce(3, 7));
        assertEquals(5, greatestCommonDivisor.gcdInBruteForce(10, 5));
        assertEquals(10, greatestCommonDivisor.gcdInBruteForce(10, 10));
    }

    @Test
    void testGcdInEuclid() {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        assertEquals(5, greatestCommonDivisor.gcdInEuclid(5, 10));
        assertEquals(1, greatestCommonDivisor.gcdInEuclid(3, 7));
        assertEquals(5, greatestCommonDivisor.gcdInEuclid(10, 5));
        assertEquals(10, greatestCommonDivisor.gcdInEuclid(10, 10));
    }
}
