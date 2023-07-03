class CreditCardInterestCalculator {
    public static void main(String[] args) {

        double initialBalance = 5000.0;
        double interestRate = 0.17;


        double oneMonthInterest = initialBalance * interestRate;
        double oneMonthTotal = initialBalance + oneMonthInterest;


        double twoMonthsInterest = oneMonthTotal * interestRate;
        double twoMonthsTotal = oneMonthTotal + twoMonthsInterest;


        System.out.println("Interest due after one month: $" + oneMonthInterest);
        System.out.println("Interest due after two months: $" + twoMonthsInterest);
    }
}
