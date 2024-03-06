package com.csi.service;

public class ApplicationService {

    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationService();

        System.out.println("\n Addition Result: " + applicationService.add(3, 2));

        System.out.println("\n Substration Result: " + applicationService.sub(10, 5));

        System.out.println("\n Multiplication Result: " + applicationService.mul(2, 3));

        System.out.println("\n Division Result: " + applicationService.div(10, 5));

    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public float div(float n1, float n2) {
        return n1 / n2;
    }
}
