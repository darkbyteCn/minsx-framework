package com.minsx.core.common.entity.system;

import com.minsx.core.common.entity.base.simple.SimpleMinsxEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "minsx_sys_userinfo")
public class UserInfo extends SimpleMinsxEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "userinfo_id")
    private Integer id;

    @Column(name = "sex")
    private String sex;

    @Column(name = "qq", unique = true)
    private String qq;

    @Column(name = "we_chat", unique = true)
    private String weChat;

    @Column(name = "micro_blog", unique = true)
    private String microBlog;

    @Column(name = "telephone", unique = true)
    private String telephone;

    @Column(name = "birth_address")
    private String birthAddress;

    @Column(name = "current_address")
    private String currentAddress;

    @Column(name = "school")
    private String school;

    @Column(name = "education")
    private String education;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "married")
    private String married;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "company")
    private String company;

    @Column(name = "home_page")
    private String homePage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getMicroBlog() {
        return microBlog;
    }

    public void setMicroBlog(String microBlog) {
        this.microBlog = microBlog;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirthAddress() {
        return birthAddress;
    }

    public void setBirthAddress(String birthAddress) {
        this.birthAddress = birthAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }
}
