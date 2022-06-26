package com.medops_system.model;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "medicine")
public class Medicine {
    @Id
    @Column(unique = true,nullable = false,columnDefinition = "char",length = 6)
    private String MID;
    @Column(nullable = false,columnDefinition = "varchar",length = 50)
    private String MName;
    @Column(nullable = true,columnDefinition = "varchar",length = 20)
    private String MSpecification;
    @Column(nullable = true,columnDefinition = "varchar",length = 10)
    private String MSUnit;
    @Column(nullable = true,columnDefinition = "varchar",length = 10)
    private String MDUnit;
    @Column(nullable = false,columnDefinition = "decimal(12,2)",length = 12)
    private BigDecimal MPPrice;
    @Column(nullable = true,columnDefinition = "decimal(12,2)",length = 12)
    private BigDecimal MRPrice;
    @Column(nullable = false,columnDefinition = "int",length = 11)
    private Integer MStore;
    @Formula(value = "MPPrice * MStore")
    @Column(nullable = true,columnDefinition = "decimal(12,2)",length = 12)
    private BigDecimal MAmount;

    @Override
    public String toString() {
        return "Medicine{" +
                "MID=" + MID +
                ", MName='" + MName + '\'' +
                ", MSpecification='" + MSpecification + '\'' +
                ", MSUnit=" + MSUnit +
                ", MDUnit='" + MDUnit + '\'' +
                ", MPPrice=" + MPPrice +
                ", MRPrice='" + MRPrice + '\'' +
                ", MStore='" + MStore + '\'' +
                ", MAmount='" + MAmount + '\'' +
                '}';
    }
    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getMName() { return MName; }

    public void setMName(String MName) { this.MName = MName; }

    public String getMSpecification() {
        return MSpecification;
    }

    public void setMSpecification(String MSpecification) {
        this.MSpecification = MSpecification;
    }

    public String getMSUnit() {
        return MSUnit;
    }

    public void setMSUnit(String MSUnit) {
        this.MSUnit = MSUnit;
    }

    public String getMDUnit() {
        return MDUnit;
    }

    public void setMDUnit(String MDUnit) {
        this.MDUnit = MDUnit;
    }

    public BigDecimal getMPPrice() {
        return MPPrice;
    }

    public void setMPPrice(BigDecimal MPPrice) {
        this.MPPrice = MPPrice;
    }

    public BigDecimal getMRPrice() {
        return MRPrice;
    }

    public void setMRPrice(BigDecimal MRPrice) {
        this.MRPrice = MRPrice;
    }

    public Integer getMStore() {
        return MStore;
    }

    public void setMStore(Integer MStore) {
        this.MStore = MStore;
    }

    public BigDecimal getMAmount() {
        return MAmount;
    }

    public void setMAmount(BigDecimal MAmount) {
        this.MAmount = MAmount;
    }
}
