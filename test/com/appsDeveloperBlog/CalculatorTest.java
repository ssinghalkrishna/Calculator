package com.appsDeveloperBlog;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


//used to make names less technical and long in test report, more friendly
@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {
    Calculator calculator;
    //naming convention
    //test<System or method under test>_<Condition or State change>_<expected result>

    @BeforeAll
    static void setup() { //need to be static
        System.out.println("Executing @BeforeAll");
    }

    @AfterAll
    static void cleanup() { //need to be static
        System.out.println("In Cleanup");
        //close db connection
        //if tests made changes to db, use this to delete those records
    }

    @BeforeEach
    void beforeEachTestMethod() {
        // to initialize object or
        // reset data to make sure each test works w objects in new and clean state
        System.out.println("in Before each");
        calculator = new Calculator();
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("in After each");
    }

    @DisplayName("Valid div test")
    @Test
    void testIntDivision_Valid_Pass() {
        //AAA
        // Arrange or Given
        //    Calculator calculator = new Calculator();
        // Act  or When
        int result = calculator.intDivision(4, 2);
        // Assert or Then pattern
        assertEquals(2, result);
    }

    // @Disabled("WIP")
    @DisplayName("Division by zero")
    @Test
    void testintDivision_WhenDividedByZero_ThrowsArithmeticException() {
        //    fail("Not implemented yet");
        int num1 = 5;
        String expectedExceptionMessage = "/ by zero";

        ArithmeticException actualException = assertThrows(ArithmeticException.class,
                () -> {
                    calculator.intDivision(num1, 0);
                }, "div by 0 throws exception");

        assertEquals(expectedExceptionMessage, actualException.getMessage(), "div by 0 exception");
    }

    @DisplayName("valid sub")
    @Test
    void intSubtraction() {
        //      Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 2;
        int expected = 3;
        int actual = calculator.intSubtraction(num1, num2);
        assertEquals(expected, actual, () -> num1 + " - " + num2 + " did not produce " + expected);
        //message computed in case of each pass or fail, so slows down. so use lambda
        //now computed only in case of fail, no resources used in case of pass
    }
}