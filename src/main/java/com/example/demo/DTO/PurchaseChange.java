package com.example.demo.DTO;

import com.example.demo.entity.purchase;

public class PurchaseChange {
    private purchase Prepurchase;
    private int ChangeNum;
    private String ChangeState;

    public purchase getPrepurchase() {
        return Prepurchase;
    }

    public void setPrepurchase(purchase prepurchase) {
        this.Prepurchase = prepurchase;
    }

    public int getChangeNum() {
        return ChangeNum;
    }

    public void setChangeNum(int changeNum) {
        this.ChangeNum = changeNum;
    }

    public String getChangeState() {
        return ChangeState;
    }

    public void setChangeState(String changeState) {
        this.ChangeState = changeState;
    }

    public PurchaseChange(purchase prepurchase, int changeNum, String changeState) {
        this.Prepurchase = prepurchase;
        this.ChangeNum = changeNum;
        this.ChangeState = changeState;
    }
}
