package com.example.po;

public class DcManagerReportRequest {
    private static final long serialVersionUID = -6278641197740436192L;
    /**
     * 以下为必填字段
     */
    private int mtShopId; // 美团门店 id
    private int reportCode; // 上报 code
    private String posName; // pos 名
    private String posVersion; // pos 版本
    private int installType;

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

    public int getReportCode() {
        return reportCode;
    }

    public void setReportCode(int reportCode) {
        this.reportCode = reportCode;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getPosVersion() {
        return posVersion;
    }

    public void setPosVersion(String posVersion) {
        this.posVersion = posVersion;
    }

    public String getInstallerMis() {
        return installerMis;
    }

    public void setInstallerMis(String installerMis) {
        this.installerMis = installerMis;
    }

    public int getInstallType() {
        return installType;
    }

    public void setInstallType(int installType) {
        this.installType = installType;
    }
}
