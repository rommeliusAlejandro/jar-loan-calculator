package model;

public class LoanDetails {

    private Integer loanLife;

    private Double principal;

    private Double yearlyInteresRate;

    public Integer getLoanLife() {
        return loanLife;
    }

    public void setLoanLife(Integer loanLife) {
        this.loanLife = loanLife;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getYearlyInteresRate() {
        return yearlyInteresRate;
    }

    public void setYearlyInteresRate(Double yearlyInteresRate) {
        this.yearlyInteresRate = yearlyInteresRate;
    }
}
