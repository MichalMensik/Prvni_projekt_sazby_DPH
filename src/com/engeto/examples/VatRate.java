package com.engeto.examples;

public class VatRate {
    private String stateAbbreviation;
    private String state;
    private int fullRate;
    private double reducedRate;
    private boolean specialRate;

    public VatRate(String stateAbbreviation, String state, int fullRate, double reducedRate, boolean specialRate) {
        this.stateAbbreviation = stateAbbreviation;
        this.state = state;
        this.fullRate = fullRate;
        this.reducedRate = reducedRate;
        this.specialRate = specialRate;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getFullRate() {
        return fullRate;
    }

    public void setFullRate(int fullRate) {
        this.fullRate = fullRate;
    }

    public double getReducedRate() {
        return reducedRate;
    }

    public void setReducedRate(double reducedRate) {
        this.reducedRate = reducedRate;
    }

    public boolean isSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(boolean specialRate) {
        this.specialRate = specialRate;
    }


    @Override
    public String toString() {
        return getStateAbbreviation()
                + " [" + state + "]"
                + ": " + fullRate + " % ";
    }


}
