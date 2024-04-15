package com.movieflix.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BasicPlanTest {

    @Test
    void shouldReturnChargesForBasicPlan() {
        BasicPlan basicPlan = new BasicPlan();
        double expectedPlanCharge = 22.8;

        double charges = basicPlan.charges();

        assertEquals(expectedPlanCharge, charges);
    }
}
