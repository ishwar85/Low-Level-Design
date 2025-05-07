package SplitWise.model;

import java.util.List;

public class Transaction {
    String paidByUserId;

    double amount;
    List<String> involvedUserIds;
    SplitType splitType;
    List<Integer> shareList;

    public Transaction(String paidByUserId, double amount, List<String> involvedUserIds, SplitType splitType, List<Integer> shareList) {
        this.paidByUserId = paidByUserId;
        this.amount = amount;
        this.involvedUserIds = involvedUserIds;
        this.splitType = splitType;
        this.shareList = shareList;
    }

    public String getPaidByUserId() {
        return paidByUserId;
    }

    public double getAmount() {
        return amount;
    }

    public List<String> getInvolvedUserIds() {
        return involvedUserIds;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public List<Integer> getShareList() {
        return shareList;
    }

    public void setPaidByUserId(String paidByUserId) {
        this.paidByUserId = paidByUserId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInvolvedUserIds(List<String> involvedUserIds) {
        this.involvedUserIds = involvedUserIds;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public void setShareList(List<Integer> shareList) {
        this.shareList = shareList;
    }
}
