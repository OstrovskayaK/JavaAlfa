package ru.alfabank.homework6.bestdelivery.model;

public class FragileParcel extends Parcel {

    private boolean requiresCarefulHandling;

    public FragileParcel(String recipientName, String deliveryAdress, double parcelWeight, String parcelTracknumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAdress, parcelWeight, parcelTracknumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }
    // стоимость доставки хрупкой посылки
    @Override
    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    // инфа для хрупкой посылки
    @Override
    public void printInfo() {
       super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
