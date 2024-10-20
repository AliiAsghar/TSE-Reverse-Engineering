package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyo {
    private static final alor a;

    static {
        alok alokVar = new alok();
        alokVar.h(aiay.ADDRESS, "formatted_address");
        alokVar.h(aiay.ADDRESS_COMPONENTS, "address_components");
        alokVar.h(aiay.BUSINESS_STATUS, "business_status");
        alokVar.h(aiay.CURBSIDE_PICKUP, "curbside_pickup");
        alokVar.h(aiay.CURRENT_OPENING_HOURS, "current_opening_hours");
        alokVar.h(aiay.DELIVERY, "delivery");
        alokVar.h(aiay.DINE_IN, "dine_in");
        alokVar.h(aiay.DISPLAY_NAME, "name");
        alokVar.h(aiay.EDITORIAL_SUMMARY, "editorial_summary");
        alokVar.h(aiay.FORMATTED_ADDRESS, "formatted_address");
        alokVar.h(aiay.ICON_BACKGROUND_COLOR, "icon_background_color");
        alokVar.h(aiay.ICON_MASK_URL, "icon_mask_base_uri");
        alokVar.h(aiay.ICON_URL, "icon_mask_base_uri");
        alokVar.h(aiay.ID, "place_id");
        alokVar.h(aiay.INTERNATIONAL_PHONE_NUMBER, "international_phone_number");
        alokVar.h(aiay.LAT_LNG, "geometry/location");
        alokVar.h(aiay.LOCATION, "geometry/location");
        alokVar.h(aiay.NAME, "name");
        alokVar.h(aiay.OPENING_HOURS, "opening_hours");
        alokVar.h(aiay.PHONE_NUMBER, "international_phone_number");
        alokVar.h(aiay.PHOTO_METADATAS, "photos");
        alokVar.h(aiay.PLUS_CODE, "plus_code");
        alokVar.h(aiay.PRICE_LEVEL, "price_level");
        alokVar.h(aiay.RATING, "rating");
        alokVar.h(aiay.RESERVABLE, "reservable");
        alokVar.h(aiay.SECONDARY_OPENING_HOURS, "secondary_opening_hours");
        alokVar.h(aiay.SERVES_BEER, "serves_beer");
        alokVar.h(aiay.SERVES_BREAKFAST, "serves_breakfast");
        alokVar.h(aiay.SERVES_BRUNCH, "serves_brunch");
        alokVar.h(aiay.SERVES_DINNER, "serves_dinner");
        alokVar.h(aiay.SERVES_LUNCH, "serves_lunch");
        alokVar.h(aiay.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food");
        alokVar.h(aiay.SERVES_WINE, "serves_wine");
        alokVar.h(aiay.TAKEOUT, "takeout");
        alokVar.h(aiay.TYPES, "types");
        alokVar.h(aiay.USER_RATINGS_TOTAL, "user_ratings_total");
        alokVar.h(aiay.USER_RATING_COUNT, "user_ratings_total");
        alokVar.h(aiay.UTC_OFFSET, "utc_offset");
        alokVar.h(aiay.VIEWPORT, "geometry/viewport");
        alokVar.h(aiay.WEBSITE_URI, "website");
        alokVar.h(aiay.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance");
        a = alokVar.b();
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((aiay) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
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
