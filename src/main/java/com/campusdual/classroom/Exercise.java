package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.actualFuel = -8;
        ft.showDetails();
    }
}