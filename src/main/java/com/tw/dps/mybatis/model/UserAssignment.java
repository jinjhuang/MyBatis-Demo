package com.tw.dps.mybatis.model;

import java.util.Date;

public class UserAssignment {
    private Integer userAssignmentId;

    private Integer userId;

    private Integer orgUnitId;

    private String userRole;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    private String updatedBy;

    public UserAssignment(Integer userAssignmentId, Integer userId, Integer orgUnitId, String userRole, Date createdAt, Date updatedAt, String createdBy, String updatedBy) {
        this.userAssignmentId = userAssignmentId;
        this.userId = userId;
        this.orgUnitId = orgUnitId;
        this.userRole = userRole;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public UserAssignment() {
        super();
    }

    public Integer getUserAssignmentId() {
        return userAssignmentId;
    }

    public void setUserAssignmentId(Integer userAssignmentId) {
        this.userAssignmentId = userAssignmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(Integer orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}