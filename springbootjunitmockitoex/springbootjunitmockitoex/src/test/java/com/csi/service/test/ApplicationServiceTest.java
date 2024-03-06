package com.csi.service.test;

import com.csi.service.ApplicationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationServiceTest {

    ApplicationService applicationService = new ApplicationService();

    @Test
    public void addTest() {
        Assertions.assertEquals(5, applicationService.add(3, 2));
    }

    @Test
    public void subTest() {
        Assertions.assertEquals(2, applicationService.sub(5, 3));
    }

    @Test
    public void mulTest() {
        Assertions.assertEquals(6, applicationService.mul(3, 2));
    }

    @Test
    public void divTest() {
        Assertions.assertEquals(2, applicationService.div(10, 5));
    }
}
