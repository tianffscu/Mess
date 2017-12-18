package com.example.po;

/**
 * for Job use：check shop userNo.
 * save record for those shops which has different 'userNo' records with QDB.
 */
public class ShopUserNoBo implements Cloneable {

    public static final int PAY_TYPE_TO_SINGLE_SHOP_OWNER = 1;
    public static final int PAY_TYPE_TO_GROUP_SHOP_OWNER = 0;

    //solutionId
    private int solutionId;

    //Mt shopId
    private int shopId;

    //DB column userNo
    private long userNum;

    //Qdb column userNo
    private long qdbUserNum;

    //DB column virtualUserNum
    private long virtualUserNum;

    //Qbd column virtualUserNum
    private long qdbVirtualUserNum;

    //shop pay type
    //  1---> direct pay using userNo
    //  0---> pay using virtualUserNo based on the agreement
    private int payType;

    //Qdb payType
    private int qdbPayType;

    private String reasonTitle;

    private String detail;

    public ShopUserNoBo() {
    }

    public ShopUserNoBo(int solutionId, int shopId, long userNum, long qdbUserNum, long virtualUserNum, long qdbVirtualUserNum, int payType, int qdbPayType, String reasonTitle, String detail) {
        this.solutionId = solutionId;
        this.shopId = shopId;
        this.userNum = userNum;
        this.qdbUserNum = qdbUserNum;
        this.virtualUserNum = virtualUserNum;
        this.qdbVirtualUserNum = qdbVirtualUserNum;
        this.payType = payType;
        this.qdbPayType = qdbPayType;
        this.reasonTitle = reasonTitle;
        this.detail = detail;
    }

    public int getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(int solutionId) {
        this.solutionId = solutionId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public long getUserNum() {
        return userNum;
    }

    public void setUserNum(long userNum) {
        this.userNum = userNum;
    }

    public long getVirtualUserNum() {
        return virtualUserNum;
    }

    public void setVirtualUserNum(long virtualUserNum) {
        this.virtualUserNum = virtualUserNum;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getReasonTitle() {
        return reasonTitle;
    }

    public void setReasonTitle(String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void addReason(String title, String detail) {
        this.reasonTitle += title + " ";
        this.detail += detail +" ";
    }

    public long getQdbUserNum() {
        return qdbUserNum;
    }

    public void setQdbUserNum(long qdbUserNum) {
        this.qdbUserNum = qdbUserNum;
    }

    public long getQdbVirtualUserNum() {
        return qdbVirtualUserNum;
    }

    public void setQdbVirtualUserNum(long qdbVirtualUserNum) {
        this.qdbVirtualUserNum = qdbVirtualUserNum;
    }

    public int getQdbPayType() {
        return qdbPayType;
    }

    public void setQdbPayType(int qdbPayType) {
        this.qdbPayType = qdbPayType;
    }

    @Override
    public String toString() {
        return "ShopUserNoBo{" +
                "solutionId=" + solutionId +
                ", shopId=" + shopId +
                ", userNum=" + userNum +
                ", qdbUserNum=" + qdbUserNum +
                ", virtualUserNum=" + virtualUserNum +
                ", qdbVirtualUserNum=" + qdbVirtualUserNum +
                ", payType=" + payType +
                ", qdbPayType=" + qdbPayType +
                ", reasonTitle='" + reasonTitle + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    @Override
    public ShopUserNoBo clone() throws CloneNotSupportedException {
        return (ShopUserNoBo) super.clone();
    }
}
