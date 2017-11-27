package com.study.first.user.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.sql.Date;

public class User<T extends User> extends Model<T> {

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    private String id;

    private String name;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
