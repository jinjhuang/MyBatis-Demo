package com.tw.dps.mybatis.model;

import java.util.Date;

public class Api {
    private Integer apiId;

    private String apiName;

    private String description;

    private String apiVersion;

    private String apiPath;

    private String upstream;

    private Integer team;

    private Integer squad;

    private String header;

    private String md5Code;

    private String serviceEmail;

    private String apiStatus;

    private String activePlugins;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    public Api(Integer apiId, String apiName, String description, String apiVersion, String apiPath, String upstream, Integer team, Integer squad, String header, String md5Code, String serviceEmail, String apiStatus, String activePlugins, String createdBy, Date createdAt, String updatedBy, Date updatedAt) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.description = description;
        this.apiVersion = apiVersion;
        this.apiPath = apiPath;
        this.upstream = upstream;
        this.team = team;
        this.squad = squad;
        this.header = header;
        this.md5Code = md5Code;
        this.serviceEmail = serviceEmail;
        this.apiStatus = apiStatus;
        this.activePlugins = activePlugins;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    public Api() {
        super();
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion == null ? null : apiVersion.trim();
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath == null ? null : apiPath.trim();
    }

    public String getUpstream() {
        return upstream;
    }

    public void setUpstream(String upstream) {
        this.upstream = upstream == null ? null : upstream.trim();
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Integer getSquad() {
        return squad;
    }

    public void setSquad(Integer squad) {
        this.squad = squad;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getMd5Code() {
        return md5Code;
    }

    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code == null ? null : md5Code.trim();
    }

    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail == null ? null : serviceEmail.trim();
    }

    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus == null ? null : apiStatus.trim();
    }

    public String getActivePlugins() {
        return activePlugins;
    }

    public void setActivePlugins(String activePlugins) {
        this.activePlugins = activePlugins == null ? null : activePlugins.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}