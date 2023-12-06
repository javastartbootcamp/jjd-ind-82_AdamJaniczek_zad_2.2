package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        String firstProductName = "Mleko";
        String firstNameOfManufacturer = "Mlekowita";
        double firstProductPrice = 2.50;
        String secondProductName = "Czekolada";
        String secondNameOfManufacturer = "Wedel";
        double secondProductPrice = 2.19;
        System.out.printf("%s %s %.2f", firstProductName, firstNameOfManufacturer, firstProductPrice);
        System.out.println();
        System.out.printf("%s %s %.2f", secondProductName, secondNameOfManufacturer, secondProductPrice);


    }
}
