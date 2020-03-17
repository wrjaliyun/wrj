package com.weiruijie.pojo;

import java.util.Date;

public class Card {
    private Integer id;

    private String name;

    private String sex;

    private Integer type;

    private Date birthday;

    private String cardnumber;

    private Integer sheng;

    private Integer shi;

    private Integer xian;

    private String zhuzhi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public Integer getSheng() {
        return sheng;
    }

    public void setSheng(Integer sheng) {
        this.sheng = sheng;
    }

    public Integer getShi() {
        return shi;
    }

    public void setShi(Integer shi) {
        this.shi = shi;
    }

    public Integer getXian() {
        return xian;
    }

    public void setXian(Integer xian) {
        this.xian = xian;
    }

    public String getZhuzhi() {
        return zhuzhi;
    }

    public void setZhuzhi(String zhuzhi) {
        this.zhuzhi = zhuzhi == null ? null : zhuzhi.trim();
    }
}