package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adze {
    public final Object a;

    public adze(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final adzd a(Reader reader) {
        Document c;
        XmlPullParser newPullParser;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        boolean z3;
        String str4;
        String str5;
        String str6;
        boolean z4;
        adzh adzhVar;
        String str7 = "name";
        String str8 = "urn:ietf:params:xml:ns:rlmi";
        String str9 = ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI;
        try {
            c = adxb.c();
            newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            z = true;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(reader);
            newPullParser.nextTag();
        } catch (ParserConfigurationException | XmlPullParserException e) {
            e = e;
        }
        try {
            adzd adzdVar = (adzd) this.a.b();
            String attributeValue = newPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            if (!Objects.isNull(attributeValue)) {
                adzdVar.a = attributeValue;
                String attributeValue2 = newPullParser.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
                if (!Objects.isNull(attributeValue2)) {
                    adzdVar.b = Integer.parseInt(attributeValue2);
                    String attributeValue3 = newPullParser.getAttributeValue("", "fullState");
                    if (!Objects.isNull(attributeValue3)) {
                        adzdVar.c = Boolean.parseBoolean(attributeValue3);
                        adzdVar.d = newPullParser.getAttributeValue("", "cid");
                        String name = newPullParser.getName();
                        int nextTag = newPullParser.nextTag();
                        String namespace = newPullParser.getNamespace();
                        String name2 = newPullParser.getName();
                        while (true) {
                            int i = 3;
                            if (nextTag == 3) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (!(z2 & name2.equals(name))) {
                                if (str8.equals(namespace)) {
                                    if (str7.equals(name2)) {
                                        adzf adzfVar = new adzf();
                                        adzfVar.a(newPullParser);
                                        adzdVar.a().add(adzfVar);
                                    } else if ("resource".equals(name2)) {
                                        adzg adzgVar = (adzg) adzdVar.e.b();
                                        String attributeValue4 = newPullParser.getAttributeValue("", str9);
                                        if (attributeValue4 != null) {
                                            adzgVar.a = attributeValue4;
                                            String name3 = newPullParser.getName();
                                            int nextTag2 = newPullParser.nextTag();
                                            String namespace2 = newPullParser.getNamespace();
                                            String name4 = newPullParser.getName();
                                            while (true) {
                                                if (nextTag2 == i) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (!(z3 & name4.equals(name3))) {
                                                    if (str8.equals(namespace2)) {
                                                        if (str7.equals(name4)) {
                                                            adzf adzfVar2 = new adzf();
                                                            adzfVar2.a(newPullParser);
                                                            adzgVar.b.add(adzfVar2);
                                                        } else if ("instance".equals(name4)) {
                                                            adzc adzcVar = (adzc) adzgVar.c.b();
                                                            String attributeValue5 = newPullParser.getAttributeValue("", "id");
                                                            if (!Objects.isNull(attributeValue5)) {
                                                                adzcVar.a = attributeValue5;
                                                                String attributeValue6 = newPullParser.getAttributeValue("", "state");
                                                                if (attributeValue6 != null) {
                                                                    adzh[] values = adzh.values();
                                                                    int length = values.length;
                                                                    str4 = str7;
                                                                    int i2 = 0;
                                                                    while (true) {
                                                                        if (i2 < length) {
                                                                            str5 = str8;
                                                                            adzhVar = values[i2];
                                                                            str6 = str9;
                                                                            if (adzhVar.d.equalsIgnoreCase(attributeValue6)) {
                                                                                break;
                                                                            }
                                                                            i2++;
                                                                            str8 = str5;
                                                                            str9 = str6;
                                                                        } else {
                                                                            str5 = str8;
                                                                            str6 = str9;
                                                                            adzhVar = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!Objects.isNull(adzhVar)) {
                                                                        adzcVar.b = adzhVar;
                                                                    } else {
                                                                        throw new XmlPullParserException("RLMI document was invalid value for 'state'element: ".concat(attributeValue6));
                                                                    }
                                                                } else {
                                                                    str4 = str7;
                                                                    str5 = str8;
                                                                    str6 = str9;
                                                                }
                                                                adzcVar.c = newPullParser.getAttributeValue("", "reason");
                                                                adzcVar.d = newPullParser.getAttributeValue("", "cid");
                                                                String name5 = newPullParser.getName();
                                                                int nextTag3 = newPullParser.nextTag();
                                                                String namespace3 = newPullParser.getNamespace();
                                                                String name6 = newPullParser.getName();
                                                                while (true) {
                                                                    if (nextTag3 == 3) {
                                                                        z4 = true;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                    if (z4 && name6.equals(name5)) {
                                                                        break;
                                                                    }
                                                                    if (adzcVar.e == null) {
                                                                        adzcVar.e = new ArrayList();
                                                                    }
                                                                    adzcVar.e.add(((aday) adzcVar.f.b()).I(c, new QName(namespace3, name6), newPullParser));
                                                                    nextTag3 = newPullParser.nextTag();
                                                                    namespace3 = newPullParser.getNamespace();
                                                                    name6 = newPullParser.getName();
                                                                }
                                                                adzgVar.b.add(adzcVar);
                                                                nextTag2 = newPullParser.nextTag();
                                                                namespace2 = newPullParser.getNamespace();
                                                                name4 = newPullParser.getName();
                                                                str7 = str4;
                                                                str8 = str5;
                                                                str9 = str6;
                                                                i = 3;
                                                            } else {
                                                                throw new XmlPullParserException("RLMI document missing 'id' required element.");
                                                            }
                                                        }
                                                    }
                                                    str4 = str7;
                                                    str5 = str8;
                                                    str6 = str9;
                                                    nextTag2 = newPullParser.nextTag();
                                                    namespace2 = newPullParser.getNamespace();
                                                    name4 = newPullParser.getName();
                                                    str7 = str4;
                                                    str8 = str5;
                                                    str9 = str6;
                                                    i = 3;
                                                } else {
                                                    str = str7;
                                                    str2 = str8;
                                                    str3 = str9;
                                                    adzdVar.a().add(adzgVar);
                                                    break;
                                                }
                                            }
                                            nextTag = newPullParser.nextTag();
                                            namespace = newPullParser.getNamespace();
                                            name2 = newPullParser.getName();
                                            str7 = str;
                                            str8 = str2;
                                            str9 = str3;
                                            z = true;
                                        } else {
                                            throw new XmlPullParserException("Missing required attribute [uri]", newPullParser, new Exception("Missing required attribute"));
                                        }
                                    }
                                }
                                str = str7;
                                str2 = str8;
                                str3 = str9;
                                nextTag = newPullParser.nextTag();
                                namespace = newPullParser.getNamespace();
                                name2 = newPullParser.getName();
                                str7 = str;
                                str8 = str2;
                                str9 = str3;
                                z = true;
                            } else {
                                return adzdVar;
                            }
                        }
                    } else {
                        throw new XmlPullParserException("RLMI document missing fullState required element.");
                    }
                } else {
                    throw new XmlPullParserException("RLMI document missing version required element.");
                }
            } else {
                throw new XmlPullParserException("RLMI document missing uri required element.");
            }
        } catch (ParserConfigurationException e2) {
            e = e2;
            throw new IOException(e.getMessage());
        } catch (XmlPullParserException e3) {
            e = e3;
            throw new IOException(e.getMessage());
        }
    }

    public adze(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adze(byte[] bArr) {
        aony aonyVar = new aony();
        aonyVar.b = 5;
        this.a = aonyVar.a();
    }

    public adze(char[] cArr) {
        alok alokVar = new alok();
        alokVar.h("accounting", aiaz.ACCOUNTING);
        alokVar.h("administrative_area_level_1", aiaz.ADMINISTRATIVE_AREA_LEVEL_1);
        alokVar.h("administrative_area_level_2", aiaz.ADMINISTRATIVE_AREA_LEVEL_2);
        alokVar.h("administrative_area_level_3", aiaz.ADMINISTRATIVE_AREA_LEVEL_3);
        alokVar.h("administrative_area_level_4", aiaz.ADMINISTRATIVE_AREA_LEVEL_4);
        alokVar.h("administrative_area_level_5", aiaz.ADMINISTRATIVE_AREA_LEVEL_5);
        alokVar.h("airport", aiaz.AIRPORT);
        alokVar.h("amusement_park", aiaz.AMUSEMENT_PARK);
        alokVar.h("aquarium", aiaz.AQUARIUM);
        alokVar.h("archipelago", aiaz.ARCHIPELAGO);
        alokVar.h("art_gallery", aiaz.ART_GALLERY);
        alokVar.h("atm", aiaz.ATM);
        alokVar.h("bakery", aiaz.BAKERY);
        alokVar.h("bank", aiaz.BANK);
        alokVar.h("bar", aiaz.BAR);
        alokVar.h("beauty_salon", aiaz.BEAUTY_SALON);
        alokVar.h("bicycle_store", aiaz.BICYCLE_STORE);
        alokVar.h("book_store", aiaz.BOOK_STORE);
        alokVar.h("bowling_alley", aiaz.BOWLING_ALLEY);
        alokVar.h("bus_station", aiaz.BUS_STATION);
        alokVar.h("cafe", aiaz.CAFE);
        alokVar.h("campground", aiaz.CAMPGROUND);
        alokVar.h("car_dealer", aiaz.CAR_DEALER);
        alokVar.h("car_rental", aiaz.CAR_RENTAL);
        alokVar.h("car_repair", aiaz.CAR_REPAIR);
        alokVar.h("car_wash", aiaz.CAR_WASH);
        alokVar.h("casino", aiaz.CASINO);
        alokVar.h("cemetery", aiaz.CEMETERY);
        alokVar.h("church", aiaz.CHURCH);
        alokVar.h("city_hall", aiaz.CITY_HALL);
        alokVar.h("clothing_store", aiaz.CLOTHING_STORE);
        alokVar.h("colloquial_area", aiaz.COLLOQUIAL_AREA);
        alokVar.h("continent", aiaz.CONTINENT);
        alokVar.h("convenience_store", aiaz.CONVENIENCE_STORE);
        alokVar.h("country", aiaz.COUNTRY);
        alokVar.h("courthouse", aiaz.COURTHOUSE);
        alokVar.h("dentist", aiaz.DENTIST);
        alokVar.h("department_store", aiaz.DEPARTMENT_STORE);
        alokVar.h("doctor", aiaz.DOCTOR);
        alokVar.h("drugstore", aiaz.DRUGSTORE);
        alokVar.h("electrician", aiaz.ELECTRICIAN);
        alokVar.h("electronics_store", aiaz.ELECTRONICS_STORE);
        alokVar.h("embassy", aiaz.EMBASSY);
        alokVar.h("establishment", aiaz.ESTABLISHMENT);
        alokVar.h("finance", aiaz.FINANCE);
        alokVar.h("fire_station", aiaz.FIRE_STATION);
        alokVar.h("floor", aiaz.FLOOR);
        alokVar.h("florist", aiaz.FLORIST);
        alokVar.h("food", aiaz.FOOD);
        alokVar.h("funeral_home", aiaz.FUNERAL_HOME);
        alokVar.h("furniture_store", aiaz.FURNITURE_STORE);
        alokVar.h("gas_station", aiaz.GAS_STATION);
        alokVar.h("general_contractor", aiaz.GENERAL_CONTRACTOR);
        alokVar.h("geocode", aiaz.GEOCODE);
        alokVar.h("grocery_or_supermarket", aiaz.GROCERY_OR_SUPERMARKET);
        alokVar.h("gym", aiaz.GYM);
        alokVar.h("hair_care", aiaz.HAIR_CARE);
        alokVar.h("hardware_store", aiaz.HARDWARE_STORE);
        alokVar.h("health", aiaz.HEALTH);
        alokVar.h("hindu_temple", aiaz.HINDU_TEMPLE);
        alokVar.h("home_goods_store", aiaz.HOME_GOODS_STORE);
        alokVar.h("hospital", aiaz.HOSPITAL);
        alokVar.h("insurance_agency", aiaz.INSURANCE_AGENCY);
        alokVar.h("intersection", aiaz.INTERSECTION);
        alokVar.h("jewelry_store", aiaz.JEWELRY_STORE);
        alokVar.h("laundry", aiaz.LAUNDRY);
        alokVar.h("lawyer", aiaz.LAWYER);
        alokVar.h("library", aiaz.LIBRARY);
        alokVar.h("light_rail_station", aiaz.LIGHT_RAIL_STATION);
        alokVar.h("liquor_store", aiaz.LIQUOR_STORE);
        alokVar.h("local_government_office", aiaz.LOCAL_GOVERNMENT_OFFICE);
        alokVar.h("locality", aiaz.LOCALITY);
        alokVar.h("locksmith", aiaz.LOCKSMITH);
        alokVar.h("lodging", aiaz.LODGING);
        alokVar.h("meal_delivery", aiaz.MEAL_DELIVERY);
        alokVar.h("meal_takeaway", aiaz.MEAL_TAKEAWAY);
        alokVar.h("mosque", aiaz.MOSQUE);
        alokVar.h("movie_rental", aiaz.MOVIE_RENTAL);
        alokVar.h("movie_theater", aiaz.MOVIE_THEATER);
        alokVar.h("moving_company", aiaz.MOVING_COMPANY);
        alokVar.h("museum", aiaz.MUSEUM);
        alokVar.h("natural_feature", aiaz.NATURAL_FEATURE);
        alokVar.h("neighborhood", aiaz.NEIGHBORHOOD);
        alokVar.h("night_club", aiaz.NIGHT_CLUB);
        alokVar.h("painter", aiaz.PAINTER);
        alokVar.h("park", aiaz.PARK);
        alokVar.h("parking", aiaz.PARKING);
        alokVar.h("pet_store", aiaz.PET_STORE);
        alokVar.h("pharmacy", aiaz.PHARMACY);
        alokVar.h("physiotherapist", aiaz.PHYSIOTHERAPIST);
        alokVar.h("place_of_worship", aiaz.PLACE_OF_WORSHIP);
        alokVar.h("plumber", aiaz.PLUMBER);
        alokVar.h("plus_code", aiaz.PLUS_CODE);
        alokVar.h("point_of_interest", aiaz.POINT_OF_INTEREST);
        alokVar.h("police", aiaz.POLICE);
        alokVar.h("political", aiaz.POLITICAL);
        alokVar.h("post_box", aiaz.POST_BOX);
        alokVar.h("post_office", aiaz.POST_OFFICE);
        alokVar.h("postal_code_prefix", aiaz.POSTAL_CODE_PREFIX);
        alokVar.h("postal_code_suffix", aiaz.POSTAL_CODE_SUFFIX);
        alokVar.h("postal_code", aiaz.POSTAL_CODE);
        alokVar.h("postal_town", aiaz.POSTAL_TOWN);
        alokVar.h("premise", aiaz.PREMISE);
        alokVar.h("primary_school", aiaz.PRIMARY_SCHOOL);
        alokVar.h("real_estate_agency", aiaz.REAL_ESTATE_AGENCY);
        alokVar.h("restaurant", aiaz.RESTAURANT);
        alokVar.h("roofing_contractor", aiaz.ROOFING_CONTRACTOR);
        alokVar.h("room", aiaz.ROOM);
        alokVar.h("route", aiaz.ROUTE);
        alokVar.h("rv_park", aiaz.RV_PARK);
        alokVar.h("school", aiaz.SCHOOL);
        alokVar.h("secondary_school", aiaz.SECONDARY_SCHOOL);
        alokVar.h("shoe_store", aiaz.SHOE_STORE);
        alokVar.h("shopping_mall", aiaz.SHOPPING_MALL);
        alokVar.h("spa", aiaz.SPA);
        alokVar.h("stadium", aiaz.STADIUM);
        alokVar.h("storage", aiaz.STORAGE);
        alokVar.h("store", aiaz.STORE);
        alokVar.h("street_address", aiaz.STREET_ADDRESS);
        alokVar.h("street_number", aiaz.STREET_NUMBER);
        alokVar.h("sublocality_level_1", aiaz.SUBLOCALITY_LEVEL_1);
        alokVar.h("sublocality_level_2", aiaz.SUBLOCALITY_LEVEL_2);
        alokVar.h("sublocality_level_3", aiaz.SUBLOCALITY_LEVEL_3);
        alokVar.h("sublocality_level_4", aiaz.SUBLOCALITY_LEVEL_4);
        alokVar.h("sublocality_level_5", aiaz.SUBLOCALITY_LEVEL_5);
        alokVar.h("sublocality", aiaz.SUBLOCALITY);
        alokVar.h("subpremise", aiaz.SUBPREMISE);
        alokVar.h("subway_station", aiaz.SUBWAY_STATION);
        alokVar.h("supermarket", aiaz.SUPERMARKET);
        alokVar.h("synagogue", aiaz.SYNAGOGUE);
        alokVar.h("taxi_stand", aiaz.TAXI_STAND);
        alokVar.h("tourist_attraction", aiaz.TOURIST_ATTRACTION);
        alokVar.h("town_square", aiaz.TOWN_SQUARE);
        alokVar.h("train_station", aiaz.TRAIN_STATION);
        alokVar.h("transit_station", aiaz.TRANSIT_STATION);
        alokVar.h("travel_agency", aiaz.TRAVEL_AGENCY);
        alokVar.h("university", aiaz.UNIVERSITY);
        alokVar.h("veterinary_care", aiaz.VETERINARY_CARE);
        alokVar.h("zoo", aiaz.ZOO);
        this.a = alokVar.b();
    }

    public adze() {
        this.a = new HashMap();
    }
}
