/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.vimate.core.entity.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Gin
 */
@Entity
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean flagIsFilter;
    private enum type {EPIC, STORY, TASK};
    private Long projId;
    private String name;
    private String description;
    private enum status{OPENED, IMPLEMENTATION, PAUSED, CHECKING, CLOSED};
    private int completePercent;
    private boolean flagIsGroup; 
    private Long employeeId;
    private Long managerId;
    private int taslLevel;
    private Long parentId;
    private int subtaskNum;
    private enum priority{LOW, NORMAL, HIGH, CRITICAL};
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startTime;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date estimExeTime;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date spentTime;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date deadline;
    private int difficulty;

    public boolean isFlagIsFilter() {
        return flagIsFilter;
    }

    public void setFlagIsFilter(boolean flagIsFilter) {
        this.flagIsFilter = flagIsFilter;
    }

    public Long getProjId() {
        return projId;
    }

    public void setProjId(Long projId) {
        this.projId = projId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(int completePercent) {
        this.completePercent = completePercent;
    }

    public boolean isFlagIsGroup() {
        return flagIsGroup;
    }

    public void setFlagIsGroup(boolean flagIsGroup) {
        this.flagIsGroup = flagIsGroup;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public int getTaslLevel() {
        return taslLevel;
    }

    public void setTaslLevel(int taslLevel) {
        this.taslLevel = taslLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public int getSubtaskNum() {
        return subtaskNum;
    }

    public void setSubtaskNum(int subtaskNum) {
        this.subtaskNum = subtaskNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEstimExeTime() {
        return estimExeTime;
    }

    public void setEstimExeTime(Date estimExeTime) {
        this.estimExeTime = estimExeTime;
    }

    public Date getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(Date spentTime) {
        this.spentTime = spentTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.Task[ id=" + id + " ]";
    }
    
}
