/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for add simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    /**
     * Test for add simple addition
     */
    @Test
    public void addTwoNumbersNegative() {

        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));

    }

    /**
     * Test for add simple addition using float
     */
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222, 0.01)));
    }

    /**
     * Test for sub simple addition
     */
    @Test
    public void subTwoNumbers() {

        double resultSub = mCalculator.sub(3d, 2d);
        assertThat(resultSub, is(equalTo(1d)));
    }

    /**
     * Test for sub simple addition
     */
    @Test
    public void subWorksWithNegativeResults() {

        double resultSub = mCalculator.sub(3d, 4d);
        assertThat(resultSub, is(equalTo(-1d)));
    }


    /**
     * Test for mul simple addition
     */
    @Test
    public void mulTwoNumbers() {

        double resultMul = mCalculator.mul(3d, 2d);
        assertThat(resultMul, is(equalTo(6d)));
    }

    /**
     * Test for mul simple addition
     */
    @Test
    public void mulTwoNumbersZero() {

        double resultMul = mCalculator.mul(6d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }


    /**
     * Test for div simple addition
     */
    @Test
    public void divTwoNumbers() {

        double resultDiv = mCalculator.div(10d, 2d);
        assertThat(resultDiv, is(equalTo(5d)));
    }


    /**
     * Test for div simple addition
     */
    @Test
    public void divTwoNumbersZero() {

        double resultDiv = mCalculator.div(8d, 0d);
        assertThat(resultDiv, is(equalTo(8d)));
    }

}