package com.example.demo.DTO;

import com.example.demo.entity.production;

public class ProductionChange {
    private production Preproduction;
    private String ChangeState;
    private int ChangeCostNum;
    private int ChageProductNum;

    public production getPreproduction() {
        return Preproduction;
    }

    public void setPreproduction(production preproduction) {
        this.Preproduction = preproduction;
    }

    public String getChangeState() {
        return ChangeState;
    }

    public void setChangeState(String changeState) {
        this.ChangeState = changeState;
    }

    public int getChangeCostNum() {
        return ChangeCostNum;
    }

    public void setChangeCostNum(int changeCostNum) {
        this.ChangeCostNum = changeCostNum;
    }

    public int getChageProductNum() {
        return ChageProductNum;
    }

    public void setChageProductNum(int chageProductNum) {
        this.ChageProductNum = chageProductNum;
    }

    public ProductionChange(production preproduction, String changeState, int changeCostNum, int chageProductNum) {
        this.Preproduction = preproduction;
        this.ChangeState = changeState;
        this.ChangeCostNum = changeCostNum;
        this.ChageProductNum = chageProductNum;
    }
}
