package com.example.vbrigel.app00;

import android.support.v7.widget.ThemedSpinnerAdapter;

import org.junit.Test;
import org.junit.runners.model.TestClass;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest{
    private HelperClass testClass = new HelperClass();


    @Test
    public void testBusName() throws Exception{
        final String testName = "buss3";
        testClass.setBusName("buss3");
        testName.equals(testClass.getBusName());
    }

    @Test
    public void testNullBusName() throws Exception{
        final String testName = null;
        testClass.setBusName(null);
        assertEquals(testName, testClass.getBusName());
    }

    @Test
    public void testErrorCategroy() throws Exception{
        final String testCategory = "Dörrar";
        testClass.setErrorCategory("Dörrar");
        testCategory.equals(testClass.getErrorCategory());
    }

    @Test
    public void testNullErrorCategory() throws Exception{
        final String testCategory = null;
        testClass.setErrorSubCategory(null);
        assertEquals(testCategory, testClass.getErrorSubCategory());
    }

    @Test
    public void testErrorSubCategory() throws Exception{
        final String testSubCategory = "Temperatur";
        testClass.setErrorCategory("Temperatur");
        testSubCategory.equals(testClass.getErrorSubCategory());
    }

    @Test
    public void testNullErrorSubCategory() throws Exception{
        final String testSubCategory = null;
        testClass.setErrorSubCategory(null);
        assertEquals(testSubCategory, testClass.getErrorSubCategory());
    }

    @Test
    public void testMessage() throws Exception{
        final String testMessage = "Bussen brinner!!";
        testClass.setMessage("Bussen brinner!!");
        testMessage.equals(testClass.getMessage());
    }

    @Test
    public void testNullMessage() throws Exception{
        final String textMessage = null;
        testClass.setMessage(null);
        assertEquals(textMessage, testClass.getMessage());
    }

    @Test
    public void testOutput() throws Exception{
        final String testOutput = testClass.getCurrentTimeStamp()+", Dörrar, Mitten, dörren stänger inte";
        testClass.setErrorCategory("Dörrar");
        testClass.setErrorSubCategory("Mitten");
        testClass.setMessage("dörren stänger inte");
        testOutput.equals(testClass.getMessage());
    }

    @Test
    public void testNullOutput() throws Exception{
        final String testOutput = testClass.getCurrentTimeStamp()+", , , ";
        testClass.setErrorCategory(null);
        testClass.setErrorSubCategory(null);
        testClass.setMessage(null);
        testOutput.equals(testClass.getMessage());
    }
}