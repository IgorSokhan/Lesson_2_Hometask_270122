package com.company;

public class Main {

    public static void main(String[] args) {
        Cars brand = new Cars();
        brand.addBrand("Subaru ");
        Cars model = new Cars();
        model.addModel("Impreza ");
        Cars modification = new Cars();
        modification.addModification("WRX STI");
        System.out.println("The car of the century = " + Cars.carName);
    }

    public static class Cars {
        public static String carName = " ";

        public static void addBrand(String brandName) {
            Cars.carName = Cars.carName + brandName;
            System.out.println("The brand of a car = " + brandName);
        }

        public static void addModel(String modelName) {
            Cars.carName = Cars.carName + modelName;
            System.out.println("The model of a car = " + modelName);
        }

        public static void addModification(String modification) {
            Cars.carName = Cars.carName + modification;
            System.out.println("The modification of a car = " + modification);  //test-test-test
        }

    }

}
