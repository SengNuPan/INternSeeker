package com.example.sengnupan.android_pj;


public class company {
    private String title,days,time,lunch,coffee,uniform,internet,address,lat,lon,phone;


    public company() {
    }

    public company(String title, String days,String time,String lunch,String coffee,String uniform,String phone,String internet,String address,String lat,String lon) {
        this.title = title;
        this.days=days;
        this.time = time;
        this.lunch=lunch;
        this.coffee = coffee;
        this.uniform=uniform;
        this.phone=phone;
        this.internet = internet;
        this.address=address;
        this.lon=lon;
        this.lat=lat;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }
    public String getCoffee(){
        return coffee;
    }
    public void setCoffee(String coffee){
        this.coffee=coffee;
    }
    public String getUniform(){
        return uniform;
    }
    public void setUniform(String uniform){
        this.uniform=uniform;
    }
    public String getInternet(){
        return internet;
    }
    public void setInternet(String internet){
        this.internet=internet;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
