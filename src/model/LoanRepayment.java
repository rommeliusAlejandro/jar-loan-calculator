package model;

import java.time.LocalDate;
import java.util.Date;

public class LoanRepayment {

    private Integer period;

    private LocalDate date;

    private Double installment;

    private Double principal;

    private Double toInterest;

    private Double toCapital;

    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getInstallment() {
        return installment;
    }

    public void setInstallment(Double installment) {
        this.installment = installment;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getToInterest() {
        return toInterest;
    }

    public void setToInterest(Double toInterest) {
        this.toInterest = toInterest;
    }

    public Double getToCapital() {
        return toCapital;
    }

    public void setToCapital(Double toCapital) {
        this.toCapital = toCapital;
    }
}
