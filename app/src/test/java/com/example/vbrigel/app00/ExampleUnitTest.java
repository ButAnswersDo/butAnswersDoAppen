package com.example.vbrigel.app00;

import android.support.v7.widget.ThemedSpinnerAdapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest{
    private HelperClass testClass = new HelperClass();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testBusName() throws Exception{
        String testName = "buss3";
        testClass.setBusName("buss3");
        testName.equals(testClass.getBusName());
    }

    @Test
    public void testErrorCategroy() throws Exception{
        String testCategory = "Dörrar";
        testClass.setErrorCategory("Dörrar");
        testCategory.equals(testClass.getErrorCategory());
    }

    @Test
    public void testErrorSubCategroy() throws Exception{
        String testSubCategory = "Temperatur";
        testClass.setErrorCategory("Temperatur");
        testSubCategory.equals(testClass.getErrorSubCategory());
    }

    @Test
    public void testMessage() throws Exception{
        String testMessage = "Bussen brinner!!";
        testClass.setMessage("Bussen brinner!!");
        testMessage.equals(testClass.getMessage());
    }
}