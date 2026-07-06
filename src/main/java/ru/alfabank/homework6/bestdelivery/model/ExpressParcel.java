package ru.alfabank.homework6.bestdelivery.model;

public class ExpressParcel extends Parcel {
    private int deliveryHours;

    public ExpressParcel(String recipientName, String deliveryAdress, double parcelWeight, String parcelTracknumber, int deliveryHours) {
        super(recipientName, deliveryAdress, parcelWeight, parcelTracknumber);
        this.deliveryHours = deliveryHours;
    }

    // считаем стоимость быстрой доставки
    @Override
    public double calculateDeliveryPrice() {
        if (deliveryHours > 24) {
            return super.calculateDeliveryPrice() + 500;
        } else {
            return super.calculateDeliveryPrice();
        }
    }

    //инфа по быстрой посылке
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours);
    }

}
