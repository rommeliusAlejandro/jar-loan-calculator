import loancalculator.LoanCalculator;
import model.LoanDetails;
import model.LoanRepayment;

import java.util.List;

public class Main {

    public static void main(String [] args) {

        LoanDetails loanDetails = new LoanDetails();
        for(String arg : args) {
            System.out.println("You passed "+arg+" as argument!");
            builder(arg, loanDetails);
        }

        List<LoanRepayment> schedule = LoanCalculator.getInstance().getSchedule(loanDetails);

        for(LoanRepayment repayment : schedule) {
            System.out.println("--------------------------------");
            System.out.println("Period = "+repayment.getPeriod());
            System.out.println("Date = "+repayment.getDate());
            System.out.println("Balance = "+repayment.getBalance());
            System.out.println("Installment = "+repayment.getInstallment());
            System.out.println("To Capital = "+repayment.getToCapital());
            System.out.println("To Interest = "+repayment.getToInterest());
            System.out.println("--------------------------------");
        }
    }

    private static void builder(String arg, LoanDetails loanDetails) {

        String [] argArray = arg.split("=");

        String argName = argArray[0];
        String argValue = argArray[1];

        if("principal".equalsIgnoreCase(argName)) {
            loanDetails.setPrincipal(Double.parseDouble(argValue));
        }

        if("loanLife".equalsIgnoreCase(argName)) {
            loanDetails.setLoanLife(Integer.parseInt(argValue));
        }

        if("interest".equalsIgnoreCase(argName)) {
            loanDetails.setYearlyInteresRate(Double.parseDouble(argValue));
        }
    }

}
