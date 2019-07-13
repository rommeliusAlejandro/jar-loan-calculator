package loancalculator;

import model.LoanDetails;
import model.LoanRepayment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanCalculator {

    private static LoanCalculator instance;

    public static LoanCalculator getInstance() {
        if(null == instance) {
            instance = new LoanCalculator();
        }

        return instance;
    }

    public List<LoanRepayment> getSchedule(LoanDetails loanDetails) {

        Double montlhyInterest = (loanDetails.getYearlyInteresRate()/12)/100;

        Double toCapital = loanDetails.getPrincipal() / loanDetails.getLoanLife();

        Double balance = loanDetails.getPrincipal();

        Double interest = montlhyInterest * balance;
        Double installment = toCapital + (montlhyInterest * balance);

        List<LoanRepayment> schedule = new ArrayList<>();

        int i = 1;
        while (i <= loanDetails.getLoanLife()) {
            LoanRepayment repayment = new LoanRepayment();

            repayment.setDate(LocalDate.now().plusMonths(i));
            repayment.setInstallment(installment);
            repayment.setPeriod(i);
            repayment.setToCapital(toCapital);
            repayment.setToInterest(interest);
            repayment.setBalance(balance);

            schedule.add(repayment);

            balance -= toCapital;
            i++;
        }

        return schedule;

    }
}
