package com.example.methods;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

public class DeprecatedMethods {


    /**
     * build outMerchantId for Qdb interface use.
     *
     * @param solutionId solutionId
     * @param poiId      poiId
     * @return outMerchantId
     */
    private static String buildOutMerchantId(int solutionId, long poiId) {
        if (poiId != 0) {
            return "" + poiId;
        }
        return "S" + solutionId;
    }
}
