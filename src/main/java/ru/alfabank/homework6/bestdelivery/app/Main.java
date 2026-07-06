package ru.alfabank.homework6.bestdelivery.app;

import ru.alfabank.homework6.bestdelivery.model.ExpressParcel;
import ru.alfabank.homework6.bestdelivery.model.FragileParcel;
import ru.alfabank.homework6.bestdelivery.model.Parcel;
import ru.alfabank.homework6.bestdelivery.service.ParcelService;

public class Main {

    static void main() {

        Parcel regularParcel = new Parcel("Murlok Alexeevich", "Moskva, Arbat 1", 8, "PUPU656775676");
        FragileParcel fragileParcel = new FragileParcel("Lolita Eduardovna", "Kazan, Tverskaya 1", 4.8,"PUPUPU56454", true);
        ExpressParcel expressParcel = new ExpressParcel("Vasilisa", "Urupinsk, ul.Lenina 1", 666, "PUPUPU6456456", 87);

        Parcel emptyParcel = new Parcel();

        Parcel[] parcels = {regularParcel, fragileParcel, expressParcel, emptyParcel};

        ParcelService parcelService = new ParcelService();

        parcelService.printParcelsReport(parcels);
    }
}