package com.movieflix.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlanTest {

    @Test
    void shouldReturnChargesForBasicPlan() {

        double expectedPlanCharge = 22.8;

        double charges = Plan.BASIC.charges();

        assertEquals(expectedPlanCharge, charges);
    }
}
