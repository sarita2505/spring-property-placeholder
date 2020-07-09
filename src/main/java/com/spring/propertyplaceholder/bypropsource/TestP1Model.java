package com.spring.propertyplaceholder.bypropsource;

public class TestP1Model {
    String country;
    String state;

    public TestP1Model() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TestP1{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
