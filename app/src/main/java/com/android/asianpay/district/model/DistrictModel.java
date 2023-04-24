package com.android.asianpay.district.model;

public class DistrictModel {
    private String districtname;
    private int population;
    private double avgTemperature;
    private double area;

    public DistrictModel(String districtname, int population, double avgTemperature, double area) {
        this.districtname = districtname;
        this.population = population;
        this.avgTemperature = avgTemperature;
        this.area = area;
    }

    public String getDistrictname() {
        return districtname;
    }

    public int getPopulation() {
        return population;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public double getArea() {
        return area;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}