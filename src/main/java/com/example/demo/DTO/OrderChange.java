package com.example.demo.DTO;

import com.example.demo.entity.order;

public class OrderChange {
    private order preOrder;
    private int changeNum;
    private String changeState;

    public order getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(order preOrder) {
        this.preOrder = preOrder;
    }

    public int getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(int changeNum) {
        this.changeNum = changeNum;
    }

    public String getChangeState() {
        return changeState;
    }

    public void setChangeState(String changeState) {
        this.changeState = changeState;
    }

    public OrderChange(order preOrder, int changeNum, String changeState) {
        this.preOrder = preOrder;
        this.changeNum = changeNum;
        this.changeState = changeState;
    }

    @Override
    public String toString() {
        return "OrderChange{" +
                "preOrder=" + preOrder +
                ", changeNum=" + changeNum +
                ", changeState='" + changeState + '\'' +
                '}';
    }
}
