public class Compound{
    public static void main(String[] args){
        double principal = Double.parseDouble(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int numberOfYears = Integer.parseInt(args[2]);
        double compound = principal;
        for (int g=1;g<=numberOfYears;++g)
            compound += compound * (interestRate/100);
        System.out.println("Your initial amount was: $"+ principal);
        System.out.println("Your interest rate: " + interestRate + '%');
        System.out.println("Your investment is for " + numberOfYears + " years");
        System.out.printf("Your $" + principal + " would worth $%.2f\n", compound);
    }
}