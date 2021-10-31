package com.github.courage007.commondivisor;

/**
 * [最大公约数类]
 *
 * @author: courage007
 * @date: 2021/10/27 23:26
 */
public class GreatestCommonDivisor {
    public int gcdInBruteForce(int first, int second) {
        if (first == second) {
            return first;
        }
        if (first < second) {
            int swap = second;
            second = first;
            first = swap;
        }
        int commonDivisor = 1;
        for (int i = second; i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor = i;
                break;
            }
        }
        return commonDivisor;
    }

    public int gcdInEuclid(int first, int second) {
        if (first < second) {
            int swap = first;
            first = second;
            second = swap;
        }
        int temp;
        while(second != 0) {
            temp = first % second;
            first = second;
            second = temp;
        }
        return first;
    }
}
