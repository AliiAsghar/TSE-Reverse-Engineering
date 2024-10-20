package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aiay implements Parcelable {
    ACCESSIBILITY_OPTIONS,
    ADDRESS_COMPONENTS,
    ADR_FORMAT_ADDRESS,
    ALLOWS_DOGS,
    BUSINESS_STATUS,
    CURBSIDE_PICKUP,
    CURRENT_OPENING_HOURS,
    CURRENT_SECONDARY_OPENING_HOURS,
    DELIVERY,
    DINE_IN,
    DISPLAY_NAME,
    EDITORIAL_SUMMARY,
    EV_CHARGE_OPTIONS,
    FORMATTED_ADDRESS,
    FUEL_OPTIONS,
    GOOD_FOR_CHILDREN,
    GOOD_FOR_GROUPS,
    GOOD_FOR_WATCHING_SPORTS,
    GOOGLE_MAPS_URI,
    ICON_BACKGROUND_COLOR,
    ICON_MASK_URL,
    ID,
    INTERNATIONAL_PHONE_NUMBER,
    LIVE_MUSIC,
    LOCATION,
    MENU_FOR_CHILDREN,
    NATIONAL_PHONE_NUMBER,
    OPENING_HOURS,
    OUTDOOR_SEATING,
    PARKING_OPTIONS,
    PAYMENT_OPTIONS,
    PHOTO_METADATAS,
    PLUS_CODE,
    PRICE_LEVEL,
    PRIMARY_TYPE,
    PRIMARY_TYPE_DISPLAY_NAME,
    RATING,
    RESERVABLE,
    RESOURCE_NAME,
    RESTROOM,
    REVIEWS,
    SECONDARY_OPENING_HOURS,
    SERVES_BEER,
    SERVES_BREAKFAST,
    SERVES_BRUNCH,
    SERVES_COCKTAILS,
    SERVES_COFFEE,
    SERVES_DESSERT,
    SERVES_DINNER,
    SERVES_LUNCH,
    SERVES_VEGETARIAN_FOOD,
    SERVES_WINE,
    SHORT_FORMATTED_ADDRESS,
    SUB_DESTINATIONS,
    TAKEOUT,
    TYPES,
    USER_RATING_COUNT,
    UTC_OFFSET,
    VIEWPORT,
    WEBSITE_URI,
    ADDRESS,
    ICON_URL,
    LAT_LNG,
    NAME,
    PHONE_NUMBER,
    USER_RATINGS_TOTAL,
    WHEELCHAIR_ACCESSIBLE_ENTRANCE;

    public static final Parcelable.Creator<aiay> CREATOR = new ahzu(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
