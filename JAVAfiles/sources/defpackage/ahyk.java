package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import defpackage.ahym;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyk {
    public static final /* synthetic */ int a = 0;
    private static final alor b;
    private static final alor c;
    private static final alor d;

    static {
        alok alokVar = new alok();
        alokVar.h("OPERATIONAL", aiax.OPERATIONAL);
        alokVar.h("CLOSED_TEMPORARILY", aiax.CLOSED_TEMPORARILY);
        alokVar.h("CLOSED_PERMANENTLY", aiax.CLOSED_PERMANENTLY);
        b = alokVar.b();
        alok alokVar2 = new alok();
        alokVar2.h("accounting", aiaz.ACCOUNTING);
        alokVar2.h("administrative_area_level_1", aiaz.ADMINISTRATIVE_AREA_LEVEL_1);
        alokVar2.h("administrative_area_level_2", aiaz.ADMINISTRATIVE_AREA_LEVEL_2);
        alokVar2.h("administrative_area_level_3", aiaz.ADMINISTRATIVE_AREA_LEVEL_3);
        alokVar2.h("administrative_area_level_4", aiaz.ADMINISTRATIVE_AREA_LEVEL_4);
        alokVar2.h("administrative_area_level_5", aiaz.ADMINISTRATIVE_AREA_LEVEL_5);
        alokVar2.h("airport", aiaz.AIRPORT);
        alokVar2.h("amusement_park", aiaz.AMUSEMENT_PARK);
        alokVar2.h("aquarium", aiaz.AQUARIUM);
        alokVar2.h("archipelago", aiaz.ARCHIPELAGO);
        alokVar2.h("art_gallery", aiaz.ART_GALLERY);
        alokVar2.h("atm", aiaz.ATM);
        alokVar2.h("bakery", aiaz.BAKERY);
        alokVar2.h("bank", aiaz.BANK);
        alokVar2.h("bar", aiaz.BAR);
        alokVar2.h("beauty_salon", aiaz.BEAUTY_SALON);
        alokVar2.h("bicycle_store", aiaz.BICYCLE_STORE);
        alokVar2.h("book_store", aiaz.BOOK_STORE);
        alokVar2.h("bowling_alley", aiaz.BOWLING_ALLEY);
        alokVar2.h("bus_station", aiaz.BUS_STATION);
        alokVar2.h("cafe", aiaz.CAFE);
        alokVar2.h("campground", aiaz.CAMPGROUND);
        alokVar2.h("car_dealer", aiaz.CAR_DEALER);
        alokVar2.h("car_rental", aiaz.CAR_RENTAL);
        alokVar2.h("car_repair", aiaz.CAR_REPAIR);
        alokVar2.h("car_wash", aiaz.CAR_WASH);
        alokVar2.h("casino", aiaz.CASINO);
        alokVar2.h("cemetery", aiaz.CEMETERY);
        alokVar2.h("church", aiaz.CHURCH);
        alokVar2.h("city_hall", aiaz.CITY_HALL);
        alokVar2.h("clothing_store", aiaz.CLOTHING_STORE);
        alokVar2.h("colloquial_area", aiaz.COLLOQUIAL_AREA);
        alokVar2.h("continent", aiaz.CONTINENT);
        alokVar2.h("convenience_store", aiaz.CONVENIENCE_STORE);
        alokVar2.h("country", aiaz.COUNTRY);
        alokVar2.h("courthouse", aiaz.COURTHOUSE);
        alokVar2.h("dentist", aiaz.DENTIST);
        alokVar2.h("department_store", aiaz.DEPARTMENT_STORE);
        alokVar2.h("doctor", aiaz.DOCTOR);
        alokVar2.h("drugstore", aiaz.DRUGSTORE);
        alokVar2.h("electrician", aiaz.ELECTRICIAN);
        alokVar2.h("electronics_store", aiaz.ELECTRONICS_STORE);
        alokVar2.h("embassy", aiaz.EMBASSY);
        alokVar2.h("establishment", aiaz.ESTABLISHMENT);
        alokVar2.h("finance", aiaz.FINANCE);
        alokVar2.h("fire_station", aiaz.FIRE_STATION);
        alokVar2.h("floor", aiaz.FLOOR);
        alokVar2.h("florist", aiaz.FLORIST);
        alokVar2.h("food", aiaz.FOOD);
        alokVar2.h("funeral_home", aiaz.FUNERAL_HOME);
        alokVar2.h("furniture_store", aiaz.FURNITURE_STORE);
        alokVar2.h("gas_station", aiaz.GAS_STATION);
        alokVar2.h("general_contractor", aiaz.GENERAL_CONTRACTOR);
        alokVar2.h("geocode", aiaz.GEOCODE);
        alokVar2.h("grocery_or_supermarket", aiaz.GROCERY_OR_SUPERMARKET);
        alokVar2.h("gym", aiaz.GYM);
        alokVar2.h("hair_care", aiaz.HAIR_CARE);
        alokVar2.h("hardware_store", aiaz.HARDWARE_STORE);
        alokVar2.h("health", aiaz.HEALTH);
        alokVar2.h("hindu_temple", aiaz.HINDU_TEMPLE);
        alokVar2.h("home_goods_store", aiaz.HOME_GOODS_STORE);
        alokVar2.h("hospital", aiaz.HOSPITAL);
        alokVar2.h("insurance_agency", aiaz.INSURANCE_AGENCY);
        alokVar2.h("intersection", aiaz.INTERSECTION);
        alokVar2.h("jewelry_store", aiaz.JEWELRY_STORE);
        alokVar2.h("laundry", aiaz.LAUNDRY);
        alokVar2.h("lawyer", aiaz.LAWYER);
        alokVar2.h("library", aiaz.LIBRARY);
        alokVar2.h("light_rail_station", aiaz.LIGHT_RAIL_STATION);
        alokVar2.h("liquor_store", aiaz.LIQUOR_STORE);
        alokVar2.h("local_government_office", aiaz.LOCAL_GOVERNMENT_OFFICE);
        alokVar2.h("locality", aiaz.LOCALITY);
        alokVar2.h("locksmith", aiaz.LOCKSMITH);
        alokVar2.h("lodging", aiaz.LODGING);
        alokVar2.h("meal_delivery", aiaz.MEAL_DELIVERY);
        alokVar2.h("meal_takeaway", aiaz.MEAL_TAKEAWAY);
        alokVar2.h("mosque", aiaz.MOSQUE);
        alokVar2.h("movie_rental", aiaz.MOVIE_RENTAL);
        alokVar2.h("movie_theater", aiaz.MOVIE_THEATER);
        alokVar2.h("moving_company", aiaz.MOVING_COMPANY);
        alokVar2.h("museum", aiaz.MUSEUM);
        alokVar2.h("natural_feature", aiaz.NATURAL_FEATURE);
        alokVar2.h("neighborhood", aiaz.NEIGHBORHOOD);
        alokVar2.h("night_club", aiaz.NIGHT_CLUB);
        alokVar2.h("painter", aiaz.PAINTER);
        alokVar2.h("park", aiaz.PARK);
        alokVar2.h("parking", aiaz.PARKING);
        alokVar2.h("pet_store", aiaz.PET_STORE);
        alokVar2.h("pharmacy", aiaz.PHARMACY);
        alokVar2.h("physiotherapist", aiaz.PHYSIOTHERAPIST);
        alokVar2.h("place_of_worship", aiaz.PLACE_OF_WORSHIP);
        alokVar2.h("plumber", aiaz.PLUMBER);
        alokVar2.h("plus_code", aiaz.PLUS_CODE);
        alokVar2.h("point_of_interest", aiaz.POINT_OF_INTEREST);
        alokVar2.h("police", aiaz.POLICE);
        alokVar2.h("political", aiaz.POLITICAL);
        alokVar2.h("post_box", aiaz.POST_BOX);
        alokVar2.h("post_office", aiaz.POST_OFFICE);
        alokVar2.h("postal_code_prefix", aiaz.POSTAL_CODE_PREFIX);
        alokVar2.h("postal_code_suffix", aiaz.POSTAL_CODE_SUFFIX);
        alokVar2.h("postal_code", aiaz.POSTAL_CODE);
        alokVar2.h("postal_town", aiaz.POSTAL_TOWN);
        alokVar2.h("premise", aiaz.PREMISE);
        alokVar2.h("primary_school", aiaz.PRIMARY_SCHOOL);
        alokVar2.h("real_estate_agency", aiaz.REAL_ESTATE_AGENCY);
        alokVar2.h("restaurant", aiaz.RESTAURANT);
        alokVar2.h("roofing_contractor", aiaz.ROOFING_CONTRACTOR);
        alokVar2.h("room", aiaz.ROOM);
        alokVar2.h("route", aiaz.ROUTE);
        alokVar2.h("rv_park", aiaz.RV_PARK);
        alokVar2.h("school", aiaz.SCHOOL);
        alokVar2.h("secondary_school", aiaz.SECONDARY_SCHOOL);
        alokVar2.h("shoe_store", aiaz.SHOE_STORE);
        alokVar2.h("shopping_mall", aiaz.SHOPPING_MALL);
        alokVar2.h("spa", aiaz.SPA);
        alokVar2.h("stadium", aiaz.STADIUM);
        alokVar2.h("storage", aiaz.STORAGE);
        alokVar2.h("store", aiaz.STORE);
        alokVar2.h("street_address", aiaz.STREET_ADDRESS);
        alokVar2.h("street_number", aiaz.STREET_NUMBER);
        alokVar2.h("sublocality_level_1", aiaz.SUBLOCALITY_LEVEL_1);
        alokVar2.h("sublocality_level_2", aiaz.SUBLOCALITY_LEVEL_2);
        alokVar2.h("sublocality_level_3", aiaz.SUBLOCALITY_LEVEL_3);
        alokVar2.h("sublocality_level_4", aiaz.SUBLOCALITY_LEVEL_4);
        alokVar2.h("sublocality_level_5", aiaz.SUBLOCALITY_LEVEL_5);
        alokVar2.h("sublocality", aiaz.SUBLOCALITY);
        alokVar2.h("subpremise", aiaz.SUBPREMISE);
        alokVar2.h("subway_station", aiaz.SUBWAY_STATION);
        alokVar2.h("supermarket", aiaz.SUPERMARKET);
        alokVar2.h("synagogue", aiaz.SYNAGOGUE);
        alokVar2.h("taxi_stand", aiaz.TAXI_STAND);
        alokVar2.h("tourist_attraction", aiaz.TOURIST_ATTRACTION);
        alokVar2.h("town_square", aiaz.TOWN_SQUARE);
        alokVar2.h("train_station", aiaz.TRAIN_STATION);
        alokVar2.h("transit_station", aiaz.TRANSIT_STATION);
        alokVar2.h("travel_agency", aiaz.TRAVEL_AGENCY);
        alokVar2.h("university", aiaz.UNIVERSITY);
        alokVar2.h("veterinary_care", aiaz.VETERINARY_CARE);
        alokVar2.h("zoo", aiaz.ZOO);
        c = alokVar2.b();
        alok alokVar3 = new alok();
        alokVar3.h("ACCESS", aian.ACCESS);
        alokVar3.h("BREAKFAST", aian.BREAKFAST);
        alokVar3.h("BRUNCH", aian.BRUNCH);
        alokVar3.h("DELIVERY", aian.DELIVERY);
        alokVar3.h("DINNER", aian.DINNER);
        alokVar3.h("DRIVE_THROUGH", aian.DRIVE_THROUGH);
        alokVar3.h("HAPPY_HOUR", aian.HAPPY_HOUR);
        alokVar3.h("KITCHEN", aian.KITCHEN);
        alokVar3.h("LUNCH", aian.LUNCH);
        alokVar3.h("ONLINE_SERVICE_HOURS", aian.ONLINE_SERVICE_HOURS);
        alokVar3.h("PICKUP", aian.PICKUP);
        alokVar3.h("SENIOR_HOURS", aian.SENIOR_HOURS);
        alokVar3.h("TAKEOUT", aian.TAKEOUT);
        d = alokVar3.b();
    }

    static aiaj a(String str) {
        if (str != null) {
            try {
                return aiaj.b(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e);
            }
        }
        return null;
    }

    static aiav b(Boolean bool) {
        if (bool == null) {
            return aiav.UNKNOWN;
        }
        if (bool.booleanValue()) {
            return aiav.TRUE;
        }
        return aiav.FALSE;
    }

    static aibi c(ahym.d.c cVar) {
        aiac aiacVar;
        aiaj aiajVar = null;
        if (cVar == null) {
            return null;
        }
        try {
            Integer num = cVar.day;
            num.getClass();
            String str = cVar.time;
            str.getClass();
            boolean z = true;
            String format = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
            if (str.length() != 4) {
                z = false;
            }
            d.t(z, format);
            try {
                aiak a2 = aiak.a(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                try {
                    aiajVar = a(cVar.date);
                } catch (IllegalArgumentException unused) {
                }
                switch (num.intValue()) {
                    case 0:
                        aiacVar = aiac.SUNDAY;
                        break;
                    case 1:
                        aiacVar = aiac.MONDAY;
                        break;
                    case 2:
                        aiacVar = aiac.TUESDAY;
                        break;
                    case 3:
                        aiacVar = aiac.WEDNESDAY;
                        break;
                    case 4:
                        aiacVar = aiac.THURSDAY;
                        break;
                    case 5:
                        aiacVar = aiac.FRIDAY;
                        break;
                    case 6:
                        aiacVar = aiac.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                }
                ajyt a3 = aibi.a(aiacVar, a2);
                a3.e = aiajVar;
                a3.m(Boolean.TRUE.equals(cVar.truncated));
                return a3.l();
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(format, e);
            }
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x021a, code lost:
    
        if (r5.isEmpty() != false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aiba d(defpackage.ahym r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyk.d(ahym, java.util.List):aiba");
    }

    private static abra e(String str) {
        return new abra(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static LatLng f(ahym.c.a aVar) {
        if (aVar != null) {
            Double d2 = aVar.lat;
            Double d3 = aVar.lng;
            if (d2 != null && d3 != null) {
                return new LatLng(d2.doubleValue(), d3.doubleValue());
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static aiao g(ahym.d dVar) {
        alog alogVar;
        ArrayList arrayList;
        alog alogVar2;
        alog alogVar3;
        aibg a2;
        ahzo ahzoVar;
        if (dVar == null) {
            return null;
        }
        aibn a3 = aiao.a();
        ahym.d.a[] aVarArr = dVar.periods;
        if (aVarArr != null) {
            alogVar = alog.p(aVarArr);
        } else {
            int i = alog.d;
            alogVar = alsx.a;
        }
        if (!alogVar.isEmpty()) {
            arrayList = new ArrayList();
            alur it = alogVar.iterator();
            while (it.hasNext()) {
                ahym.d.a aVar = (ahym.d.a) it.next();
                if (aVar != null) {
                    ahzoVar = new ahzo(c(aVar.open), c(aVar.close));
                } else {
                    ahzoVar = null;
                }
                h(arrayList, ahzoVar);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        a3.h(arrayList);
        String[] strArr = dVar.weekdayText;
        if (strArr != null) {
            alogVar2 = alog.p(strArr);
        } else {
            alogVar2 = alsx.a;
        }
        a3.j(alogVar2);
        a3.d = (aian) d.getOrDefault(dVar.type, null);
        ahym.d.b[] bVarArr = dVar.specialDays;
        if (bVarArr != null) {
            alogVar3 = alog.p(bVarArr);
        } else {
            alogVar3 = alsx.a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!alogVar3.isEmpty()) {
            alur it2 = alogVar3.iterator();
            while (it2.hasNext()) {
                ahym.d.b bVar = (ahym.d.b) it2.next();
                if (bVar != null) {
                    try {
                        aiaj a4 = a(bVar.date);
                        a4.getClass();
                        aibf a5 = aibg.a(a4);
                        a5.b(Boolean.TRUE.equals(bVar.exceptionalHours));
                        a2 = a5.a();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                    h(arrayList2, a2);
                }
                a2 = null;
                h(arrayList2, a2);
            }
        }
        a3.i(arrayList2);
        return a3.f();
    }

    private static void h(Collection collection, Object obj) {
        if (obj != null) {
            collection.add(obj);
        }
    }
}
