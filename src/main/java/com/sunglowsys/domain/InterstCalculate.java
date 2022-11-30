package com.sunglowsys.domain;

public class InterstCalculate {
    private double principleAmount;
    private double rateOfInterst;
    private double duration;
    private double totalAmmount;

    public InterstCalculate(double principleAmount, double rateOfInterst, double duration, double totalAmmount) {
        this.principleAmount = principleAmount;
        this.rateOfInterst = rateOfInterst;
        this.duration = duration;
        this.totalAmmount = totalAmmount;
    }

    public InterstCalculate() {

    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public void setPrincipleAmount(double principleAmount) {
        this.principleAmount = principleAmount;
    }

    public double getRateOfInterst() {
        return rateOfInterst;
    }

    public void setRateOfInterst(double rateOfInterst) {
        this.rateOfInterst = rateOfInterst;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getTotalAmmount() {
        return totalAmmount;
    }

    public void setTotalAmmount(double totalAmmount) {
        this.totalAmmount = totalAmmount;
    }
}
