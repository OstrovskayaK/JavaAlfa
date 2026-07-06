package ru.alfabank.homework6.bestdelivery.service;

import ru.alfabank.homework6.bestdelivery.model.Parcel;

public class ParcelService extends Parcel {
    public void printParcelsReport(Parcel[] parcels) {

        for (Parcel parcel : parcels) {
            parcel.printInfo();
            System.out.println("Delivery price - " + parcel.calculateDeliveryPrice());
            System.out.println();
        }
    }
}