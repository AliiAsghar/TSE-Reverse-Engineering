package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahxx {
    private static final alor a;

    static {
        alok alokVar = new alok();
        alokVar.h(aiay.ACCESSIBILITY_OPTIONS, "accessibilityOptions");
        alokVar.h(aiay.ADDRESS, "formattedAddress");
        alokVar.h(aiay.ADDRESS_COMPONENTS, "addressComponents");
        alokVar.h(aiay.ADR_FORMAT_ADDRESS, "adrFormatAddress");
        alokVar.h(aiay.ALLOWS_DOGS, "allowsDogs");
        alokVar.h(aiay.BUSINESS_STATUS, "businessStatus");
        alokVar.h(aiay.CURBSIDE_PICKUP, "curbsidePickup");
        alokVar.h(aiay.CURRENT_OPENING_HOURS, "currentOpeningHours");
        alokVar.h(aiay.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours");
        alokVar.h(aiay.DELIVERY, "delivery");
        alokVar.h(aiay.DINE_IN, "dineIn");
        alokVar.h(aiay.DISPLAY_NAME, "displayName");
        alokVar.h(aiay.EDITORIAL_SUMMARY, "editorialSummary");
        alokVar.h(aiay.EV_CHARGE_OPTIONS, "evChargeOptions");
        alokVar.h(aiay.FORMATTED_ADDRESS, "formattedAddress");
        alokVar.h(aiay.FUEL_OPTIONS, "fuelOptions");
        alokVar.h(aiay.GOOD_FOR_CHILDREN, "goodForChildren");
        alokVar.h(aiay.GOOD_FOR_GROUPS, "goodForGroups");
        alokVar.h(aiay.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports");
        alokVar.h(aiay.GOOGLE_MAPS_URI, "googleMapsUri");
        alokVar.h(aiay.ICON_BACKGROUND_COLOR, "iconBackgroundColor");
        alokVar.h(aiay.ICON_MASK_URL, "iconMaskBaseUri");
        alokVar.h(aiay.ICON_URL, "iconMaskBaseUri");
        alokVar.h(aiay.ID, "id");
        alokVar.h(aiay.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber");
        alokVar.h(aiay.LAT_LNG, "location");
        alokVar.h(aiay.LIVE_MUSIC, "liveMusic");
        alokVar.h(aiay.LOCATION, "location");
        alokVar.h(aiay.MENU_FOR_CHILDREN, "menuForChildren");
        alokVar.h(aiay.NAME, "displayName");
        alokVar.h(aiay.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber");
        alokVar.h(aiay.OPENING_HOURS, "regularOpeningHours");
        alokVar.h(aiay.OUTDOOR_SEATING, "outdoorSeating");
        alokVar.h(aiay.PARKING_OPTIONS, "parkingOptions");
        alokVar.h(aiay.PAYMENT_OPTIONS, "paymentOptions");
        alokVar.h(aiay.PHONE_NUMBER, "internationalPhoneNumber");
        alokVar.h(aiay.PHOTO_METADATAS, "photos");
        alokVar.h(aiay.PLUS_CODE, "plusCode");
        alokVar.h(aiay.PRICE_LEVEL, "priceLevel");
        alokVar.h(aiay.PRIMARY_TYPE, "primaryType");
        alokVar.h(aiay.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName");
        alokVar.h(aiay.RATING, "rating");
        alokVar.h(aiay.RESERVABLE, "reservable");
        alokVar.h(aiay.RESOURCE_NAME, "name");
        alokVar.h(aiay.RESTROOM, "restroom");
        alokVar.h(aiay.REVIEWS, "reviews");
        alokVar.h(aiay.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours");
        alokVar.h(aiay.SERVES_BEER, "servesBeer");
        alokVar.h(aiay.SERVES_BREAKFAST, "servesBreakfast");
        alokVar.h(aiay.SERVES_BRUNCH, "servesBrunch");
        alokVar.h(aiay.SERVES_COCKTAILS, "servesCocktails");
        alokVar.h(aiay.SERVES_COFFEE, "servesCoffee");
        alokVar.h(aiay.SERVES_DESSERT, "servesDessert");
        alokVar.h(aiay.SERVES_DINNER, "servesDinner");
        alokVar.h(aiay.SERVES_LUNCH, "servesLunch");
        alokVar.h(aiay.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood");
        alokVar.h(aiay.SERVES_WINE, "servesWine");
        alokVar.h(aiay.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress");
        alokVar.h(aiay.SUB_DESTINATIONS, "subDestinations");
        alokVar.h(aiay.TAKEOUT, "takeout");
        alokVar.h(aiay.TYPES, "types");
        alokVar.h(aiay.USER_RATINGS_TOTAL, "userRatingCount");
        alokVar.h(aiay.USER_RATING_COUNT, "userRatingCount");
        alokVar.h(aiay.UTC_OFFSET, "utcOffsetMinutes");
        alokVar.h(aiay.VIEWPORT, "viewport");
        alokVar.h(aiay.WEBSITE_URI, "websiteUri");
        alokVar.h(aiay.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "accessibilityOptions");
        a = alokVar.b();
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((aiay) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
