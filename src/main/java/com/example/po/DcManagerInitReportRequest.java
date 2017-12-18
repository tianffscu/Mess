package com.example.po;

public class DcManagerInitReportRequest {

    private static final long serialVersionUID = -1681410692964890917L;
    /**
     * 以下为必填字段
     */
    private int mtShopId;
    /**
     * 以下为选填字段
     */
    private String installerMis;

    public int getMtShopId() {
        return mtShopId;
    }

    public void setMtShopId(int mtShopId) {
        this.mtShopId = mtShopId;
    }

    public String getInstallerMis() {
        return installerMis;
    }

    public void setInstallerMis(String installerMis) {
        this.installerMis = installerMis;
    }
}
