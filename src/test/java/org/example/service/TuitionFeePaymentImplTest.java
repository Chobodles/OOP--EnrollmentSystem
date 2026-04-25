package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentImplTest {
    private TuitionFeePaymentImpl tuitionFeePaymentImpl;

    @BeforeEach
    void setup(){
        tuitionFeePaymentImpl = new TuitionFeePaymentImpl();
    }

    @Test
    @DisplayName("Calculation of TuitionFee")
    void shouldCalculateTotalTuitionFee(){
        assertEquals(5000, tuitionFeePaymentImpl.calculateTuitionFee(5,0));
    }

    @Test
    @DisplayName("Calculation of TuitionFee with 10 percent")
    void shouldCalculateTotalTuitionFeeWith10PercentDiscount(){
        assertEquals(4500, tuitionFeePaymentImpl.calculateTuitionFee(5,.10));
    }

    @Test
    void shouldMakePayment(){
        tuitionFeePaymentImpl.calculateTuitionFee(3,0.10);

        //act
        tuitionFeePaymentImpl.makePayment(1000);

        assertEquals(1700, tuitionFeePaymentImpl.getRemainingBalance(),  0.001);

    }
    @Test
    void shouldCheckIfTheTuitionFeeIsNotFullyPaid(){
        tuitionFeePaymentImpl.calculateTuitionFee(3,.1);

        tuitionFeePaymentImpl.makePayment(1700);

        assertFalse(tuitionFeePaymentImpl.isFullyPaid());
    }

    @Test
    void shouldCheckIfTheTuitionFeeIsFullyPaid(){
        tuitionFeePaymentImpl.calculateTuitionFee(3,.1);

        tuitionFeePaymentImpl.makePayment(2700);

        assertTrue(tuitionFeePaymentImpl.isFullyPaid());
    }
}