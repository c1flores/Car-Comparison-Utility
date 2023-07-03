package src.assets.Java;

public class CarComparison {
        public static void main(String[] args) {
            // Car 1: $25,000, 50 miles/gallon
            double price1 = 25000.0;
            double efficiency1 = 50.0;
    
            // Car 2: $20,000, 30 miles/gallon
            double price2 = 20000.0;
            double efficiency2 = 30.0;
    
            // Constants
            double pricePerGallon = 4.0;
            int annualMilesDriven = 15000;
            int numYears = 10;
    
            // Calculate the total cost for each car
            double totalCost1 = calculateTotalCost(price1, efficiency1, pricePerGallon, annualMilesDriven, numYears);
            double totalCost2 = calculateTotalCost(price2, efficiency2, pricePerGallon, annualMilesDriven, numYears);
    
            // Compare the total costs and choose the better car
            if (totalCost1 < totalCost2) {
                System.out.println("Choose car 1.");
            } else {
                System.out.println("Choose car 2.");
            }
        }
    
        public static double calculateTotalCost(double purchasePrice, double fuelEfficiency,
                                                double pricePerGallon, int annualMilesDriven, int numYears) {
            double annualFuelConsumed = annualMilesDriven / fuelEfficiency;
            double annualFuelCost = pricePerGallon * annualFuelConsumed;
            double operatingCost = 10 * annualFuelCost;
            return purchasePrice + operatingCost;
        }
    }
    

