package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    private TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup(){
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    @DisplayName("Calculation of TuitionFee")
    void shouldCalculateTotalTuitionFee(){
        assertEquals(5000, tuitionFeePayment.calculateTuitionFee(5,0));
    }

    @Test
    @DisplayName("Calculation of TuitionFee with 10 percent")
    void shouldCalculateTotalTuitionFeeWith10PercentDiscount(){
        assertEquals(4500, tuitionFeePayment.calculateTuitionFee(5,.10));
    }

    @Test
    void shouldMakePayment(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);

        //act
        tuitionFeePayment.makePayment(1000);

        assertEquals(1700, tuitionFeePayment.getRemainingBalance(),  0.001);

    }
    @Test
    void shouldCheckIfTheTuitionFeeIsNotFullyPaid(){
        tuitionFeePayment.calculateTuitionFee(3,.1);

        tuitionFeePayment.makePayment(1700);

        assertFalse(tuitionFeePayment.isFullyPaid());
    }

    @Test
    void shouldCheckIfTheTuitionFeeIsFullyPaid(){
        tuitionFeePayment.calculateTuitionFee(3,.1);

        tuitionFeePayment.makePayment(2700);

        assertTrue(tuitionFeePayment.isFullyPaid());
    }
}