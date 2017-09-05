package com.example.jhoel.myapplication;



public class TipCalculatorModel {

    float tipCalc;
    float numBill;
    float numTip;

    public float getTipCalc() {
        return tipCalc;
    }

    public void setTipCalc(float tipCalc) {
        tipCalc = numBill * (numTip * 0.01f);
        this.tipCalc = tipCalc;
    }

    public float getNumBill() {
        return numBill;
    }

    public void setNumBill(float numBill) {
        this.numBill = numBill;
    }

    public float getNumTip() {
        return numTip;
    }

    public void setNumTip(float numTip) {
        this.numTip = numTip;
    }
}
