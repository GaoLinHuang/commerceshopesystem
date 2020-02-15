package com.koalin.commerceshopesystem.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version 1.0
 * @ClassName UmsMemberLevel
 * @Author koalin
 * @Description //TODO UmsMemberLevel的描述
 * @Date 2020/2/14 0:27
 */
public class UmsMemberLevel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private int growthPoint;
    private int defaultStatus;
    private BigDecimal freeFreightPoint;
    private int commentGrowthPoint;
    private int priviledgeFreeFreight;
    private int priviledgeSignIn;
    private int priviledgeComment;
    private int priviledgePromotion;
    private int priviledgeMemberPrice;
    private int priviledgeBirthday;
    private String note;

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

    public int getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(int growthPoint) {
        this.growthPoint = growthPoint;
    }

    public int getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(int defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public int getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(int commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public int getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(int priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public int getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(int priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public int getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(int priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public int getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(int priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public int getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(int priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public int getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(int priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
