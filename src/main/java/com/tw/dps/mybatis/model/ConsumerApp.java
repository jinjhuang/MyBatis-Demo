package com.tw.dps.mybatis.model;

import java.util.Date;

public class ConsumerApp {
    private Integer appId;

    private String oktaAppId;

    private String appName;

    private String appLabel;

    private Integer orgId;

    private String clientId;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    public ConsumerApp(Integer appId, String oktaAppId, String appName, String appLabel, Integer orgId, String clientId, Date createdAt, String createdBy, Date updatedAt, String updatedBy) {
        this.appId = appId;
        this.oktaAppId = oktaAppId;
        this.appName = appName;
        this.appLabel = appLabel;
        this.orgId = orgId;
        this.clientId = clientId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public ConsumerApp() {
        super();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getOktaAppId() {
        return oktaAppId;
    }

    public void setOktaAppId(String oktaAppId) {
        this.oktaAppId = oktaAppId == null ? null : oktaAppId.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel == null ? null : appLabel.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}