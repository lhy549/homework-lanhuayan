package com.nf.phone.entity;

public class Phone {
    private int id; //id
    private String brand; //牌子
    private double price; //价格
    private double size; //大小
    private String info;//说明
    private String address;//产地
    private String store;//店铺名：
    public Phone(){}

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", info='" + info + '\'' +
                ", address='" + address + '\'' +
                ", store='" + store + '\'' +
                '}';
    }

    public Phone(int id, String brand, double price, double size, String info, String address, String store) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.info = info;
        this.address = address;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
