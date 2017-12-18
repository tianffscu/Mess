/**
 * file HackValidOrderQueryRequest.java
 * com.dianping.orderdish.hackorder.entity
 * TODO(用一句话描述该文件做什么)
 *
 * @author xiaofa.zhang@dianping.com
 * @date 2017年8月24日 下午3:13:01
 * @version V1.0
 * Copyright 2003-2015 Dianping Corporation 2017
 * 版权所有
 */
package com.example;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * <b>Name</b>  HackValidOrderQueryRequest</br>
 * <b>Description</b> 秒付订单查询
 *
 * @author xiaofa.zhang@dianping.com
 * 2017年8月24日 下午3:13:01
 */

/**
 * <b>Name</b>  HackValidOrderQueryRequest</br>
 * <b>Description</b> 通用查询请求
 * @author xiaofa.zhang@dianping.com
 * 2017年8月24日 下午5:07:59
 *
 */
public class HackValidOrderQueryRequest implements Serializable {


    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = -6351712410679191604L;

    private List<Integer> payActionIdList = Collections.emptyList();
    private int payActionIdSize = 0;

    private List<Integer> pullActionIdList = Collections.emptyList();
    private int pullActionIdSize = 0;

    private List<String> pullOrderIdList = Collections.emptyList();
    private int pullOrderIdSize = 0;

    private List<Integer> shopIdList = Collections.emptyList();
    private int shopIdSize = 0;

    private List<Integer> mtShopIdList = Collections.emptyList();
    private int mtShopIdSize = 0;

    private List<Integer> payStatusList = Collections.emptyList();
    private int payStatusSize = 0;

    private List<Integer> dpUserIdList = Collections.emptyList();
    private int dpUserIdSize = 0;

    private List<Integer> mtUserIdList = Collections.emptyList();
    private int mtUserIdSize = 0;

    private Integer barCode;

    private String phone;

    private String shopName;

    private String tableNum;

    private String viewId;//统一订单号,接leaf,格式如MFXXXXXXX

    private Integer channel;//下单渠道

    private int desc = 0;//是否降序排列,0:不排序；1:降序；2:升序；排序因子参考dateType值

    private int dateType = 1;

    private Date startDate;

    private Date endDate;

    private boolean includeRefund = false; //默认不包含退款信息

    private int paging = 0; //默认分页;1:不分页
    //分页所用,必须均不为空才生效
    private int offset = 30;

    private int start = 0;//非页码，是数据的下标开始

    /**
     * @return payActionIdList
     */
    public List<Integer> getPayActionIdList() {
        return payActionIdList;
    }

    /**
     * @param payActionIdList the payActionIdList to set
     */
    public void setPayActionIdList(List<Integer> payActionIdList) {
        this.payActionIdList = payActionIdList;
    }

    /**
     * @return pullActionIdList
     */
    public List<Integer> getPullActionIdList() {
        return pullActionIdList;
    }

    /**
     * @param pullActionIdList the pullActionIdList to set
     */
    public void setPullActionIdList(List<Integer> pullActionIdList) {
        this.pullActionIdList = pullActionIdList;
    }

    /**
     * @return pullOrderIdList
     */
    public List<String> getPullOrderIdList() {
        return pullOrderIdList;
    }

    /**
     * @param pullOrderIdList the pullOrderIdList to set
     */
    public void setPullOrderIdList(List<String> pullOrderIdList) {
        this.pullOrderIdList = pullOrderIdList;
    }

    /**
     * @return shopIdList
     */
    public List<Integer> getShopIdList() {
        return shopIdList;
    }

    /**
     * @param shopIdList the shopIdList to set
     */
    public void setShopIdList(List<Integer> shopIdList) {
        this.shopIdList = shopIdList;
    }

    /**
     * @return mtShopIdList
     */
    public List<Integer> getMtShopIdList() {
        return mtShopIdList;
    }

    /**
     * @param mtShopIdList the mtShopIdList to set
     */
    public void setMtShopIdList(List<Integer> mtShopIdList) {
        this.mtShopIdList = mtShopIdList;
    }

    /**
     * @return barCode
     */
    public Integer getBarCode() {
        return barCode;
    }

    /**
     * @param barCode the barCode to set
     */
    public void setBarCode(Integer barCode) {
        this.barCode = barCode;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return tableNum
     */
    public String getTableNum() {
        return tableNum;
    }

    /**
     * @param tableNum the tableNum to set
     */
    public void setTableNum(String tableNum) {
        this.tableNum = tableNum;
    }

    /**
     * @return viewId
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * @param viewId the viewId to set
     */
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * @return channel
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }


    /**
     * @return dateType
     */
    public int getDateType() {
        return dateType;
    }

    /**
     * @param dateType the dateType to set
     */
    public void setDateType(int dateType) {
        this.dateType = dateType;
    }

    /**
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    /**
     * @return desc
     */
    public int getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(int desc) {
        this.desc = desc;
    }

    /**
     * @return paging
     */
    public int getPaging() {
        return paging;
    }

    /**
     * @param paging the paging to set
     */
    public void setPaging(int paging) {
        this.paging = paging;
    }

    /**
     * @return offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * @return start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @return includeRefund
     */
    public boolean isIncludeRefund() {
        return includeRefund;
    }

    /**
     * @param includeRefund the includeRefund to set
     */
    public void setIncludeRefund(boolean includeRefund) {
        this.includeRefund = includeRefund;
    }

    /**
     * @return payStatusList
     */
    public List<Integer> getPayStatusList() {
        return payStatusList;
    }

    /**
     * @param payStatusList the payStatusList to set
     */
    public void setPayStatusList(List<Integer> payStatusList) {
        this.payStatusList = payStatusList;
    }

    /**
     * @return dpUserIdList
     */
    public List<Integer> getDpUserIdList() {
        return dpUserIdList;
    }

    /**
     * @param dpUserIdList the dpUserIdList to set
     */
    public void setDpUserIdList(List<Integer> dpUserIdList) {
        this.dpUserIdList = dpUserIdList;
    }

    /**
     * @return mtUserIdList
     */
    public List<Integer> getMtUserIdList() {
        return mtUserIdList;
    }

    /**
     * @param mtUserIdList the mtUserIdList to set
     */
    public void setMtUserIdList(List<Integer> mtUserIdList) {
        this.mtUserIdList = mtUserIdList;
    }

    /**
     * @return payActionIdSize
     */
    public int getPayActionIdSize() {
        payActionIdSize = payActionIdList == null ? 0 : payActionIdList.size();
        return payActionIdSize;
    }

    /**
     * @return pullActionIdSize
     */
    public int getPullActionIdSize() {
        pullActionIdSize = pullActionIdList == null ? 0 : pullActionIdList.size();
        return pullActionIdSize;
    }

    /**
     * @return pullOrderIdSize
     */
    public int getPullOrderIdSize() {
        pullOrderIdSize = pullOrderIdList == null ? 0 : pullOrderIdList.size();
        return pullOrderIdSize;
    }

    /**
     * @return shopIdSize
     */
    public int getShopIdSize() {
        shopIdSize = shopIdList == null ? 0 : shopIdList.size();
        return shopIdSize;
    }

    /**
     * @return mtShopIdSize
     */
    public int getMtShopIdSize() {
        mtShopIdSize = mtShopIdList == null ? 0 : mtShopIdList.size();
        return mtShopIdSize;
    }

    /**
     * @return payStatusSize
     */
    public int getPayStatusSize() {
        payStatusSize = payStatusList == null ? 0 : payStatusList.size();
        return payStatusSize;
    }

    /**
     * @return dpUserIdSize
     */
    public int getDpUserIdSize() {
        dpUserIdSize = dpUserIdList == null ? 0 : dpUserIdList.size();
        return dpUserIdSize;
    }

    /**
     * @return mtUserIdSize
     */
    public int getMtUserIdSize() {
        mtUserIdSize = mtUserIdList == null ? 0 : mtUserIdList.size();
        return mtUserIdSize;
    }


    /**
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName the shopName to set
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /* (非 Javadoc)
    * <p>Title: toString</p>
    * <p>Description: </p>
    * @return
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
        return "HackValidOrderQueryRequest [payActionIdList=" + payActionIdList + ", payActionIdSize=" + payActionIdSize
                + ", pullActionIdList=" + pullActionIdList + ", pullActionIdSize=" + pullActionIdSize
                + ", pullOrderIdList=" + pullOrderIdList + ", pullOrderIdSize=" + pullOrderIdSize + ", shopIdList="
                + shopIdList + ", shopIdSize=" + shopIdSize + ", mtShopIdList=" + mtShopIdList + ", mtShopIdSize="
                + mtShopIdSize + ", payStatusList=" + payStatusList + ", payStatusSize=" + payStatusSize
                + ", dpUserIdList=" + dpUserIdList + ", dpUserIdSize=" + dpUserIdSize + ", mtUserIdList=" + mtUserIdList
                + ", mtUserIdSize=" + mtUserIdSize + ", barCode=" + barCode + ", phone=" + phone + ", shopName="
                + shopName + ", tableNum=" + tableNum + ", viewId=" + viewId + ", channel=" + channel + ", desc=" + desc
                + ", dateType=" + dateType + ", startDate=" + startDate + ", endDate=" + endDate + ", includeRefund="
                + includeRefund + ", paging=" + paging + ", offset=" + offset + ", start=" + start + "]";
    }

}
