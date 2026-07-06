package ru.alfabank.homework6.bestdelivery.model;

public class Parcel {

    private String recipientName;
    private String deliveryAdress;
    protected double parcelWeight;
    String parcelTracknumber;

    // конструкторы
    public Parcel(String recipientName, String deliveryAdress, double parcelWeight, String parcelTracknumber) {
        this.recipientName = recipientName;
        this.deliveryAdress = deliveryAdress;
        this.parcelWeight = parcelWeight;
        this.parcelTracknumber = parcelTracknumber;
    }

    public Parcel() {
    }

    // геттеры и сеттеры
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    // расчет стоимости
    public double calculateDeliveryPrice() {
        double deliveryPrice = 100 + parcelWeight*300;
        return deliveryPrice;
    }

    // общая инфа про посылку
    public void printInfo() {
        System.out.println("Recipient's name - " + recipientName);
        System.out.println("Adress - " + deliveryAdress);
        System.out.println("Weight - " + parcelWeight);
        System.out.println("Track number - " + parcelTracknumber);
    }

}
