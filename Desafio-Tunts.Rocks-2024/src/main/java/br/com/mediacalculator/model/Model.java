package br.com.mediacalculator.model;

public class Model {
    private double P1;
    private double P2;
    private double P3;
    private double fouls;

    private String name;
    private double registration;

    private String situation;
    private double finalgrade;

    private String situation1;
    private double finaln;


    public String getSituation1() {
        return situation1;
    }

    public void setSituation1(String situation1) {
        this.situation1 = situation1;
    }

    public double getFinaln() {
        return finaln;
    }

    public void setFinaln(double finaln) {
        this.finaln = finaln;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public double getFinalgrade() {
        return finalgrade;
    }

    public void setFinalgrade(double finalgrade) {
        this.finalgrade = finalgrade;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  double getRegistration() {
        return registration;
    }

    public void setRegistration(double registration) {
        this.registration = registration;
    }

    public  double getFouls() {
        return fouls;
    }

    public void setFouls(double fouls) {
        this.fouls = fouls;
    }

    public  double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public  double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public  double getP3() {
        return P3;
    }

    public void setP3(double p3) {
        P3 = p3;
    }
}

