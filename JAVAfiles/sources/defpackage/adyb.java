package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyb implements adxa {
    public adyj a = new adyj();
    private adyd b;
    private String c;
    private adyh d;
    private final armf e;
    private final armf f;

    public adyb(armf armfVar, armf armfVar2) {
        this.e = armfVar;
        this.f = armfVar2;
        this.b = (adyd) armfVar.b();
    }

    public final adyd a() {
        if (this.b == null) {
            this.b = (adyd) this.e.b();
        }
        return this.b;
    }

    public final void b(Document document, XmlPullParser xmlPullParser) {
        boolean z;
        adyb adybVar;
        Document document2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        Document document3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z5;
        String str8;
        boolean z6;
        String str9;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        adyb adybVar2 = this;
        Document document4 = document;
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            int i = 3;
            if (nextTag == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!(z & name.equalsIgnoreCase("geopriv"))) {
                String str10 = "urn:ietf:params:xml:ns:pidf:geopriv10";
                if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace)) {
                    String str11 = "location-info";
                    if (name.equalsIgnoreCase("location-info")) {
                        adyd adydVar = (adyd) adybVar2.e.b();
                        adybVar2.b = adydVar;
                        int nextTag2 = xmlPullParser.nextTag();
                        String name2 = xmlPullParser.getName();
                        String namespace2 = xmlPullParser.getNamespace();
                        while (true) {
                            if (nextTag2 == i) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && name2.equalsIgnoreCase(str11)) {
                                break;
                            }
                            if ("http://www.opengis.net/gml".equals(namespace2)) {
                                if (name2.equalsIgnoreCase("Point")) {
                                    adyl adylVar = new adyl();
                                    adylVar.b = xmlPullParser.getAttributeValue("", "srsName");
                                    int nextTag3 = xmlPullParser.nextTag();
                                    String namespace3 = xmlPullParser.getNamespace();
                                    str = str11;
                                    String name3 = xmlPullParser.getName();
                                    while (true) {
                                        if (nextTag3 == i) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11 && name3.equalsIgnoreCase("point")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace3) && name3.equalsIgnoreCase("pos")) {
                                            adylVar.a = new adyn();
                                            adylVar.a.cz(xmlPullParser);
                                        }
                                        nextTag3 = xmlPullParser.nextTag();
                                        namespace3 = xmlPullParser.getNamespace();
                                        name3 = xmlPullParser.getName();
                                        i = 3;
                                    }
                                    adydVar.a().add(adylVar);
                                } else {
                                    str = str11;
                                }
                                if (name2.equalsIgnoreCase("Polygon")) {
                                    adym adymVar = new adym();
                                    adymVar.b(xmlPullParser);
                                    adydVar.a().add(adymVar);
                                }
                                str2 = str10;
                                str3 = name;
                                document3 = document4;
                            } else {
                                str = str11;
                                if ("http://www.opengis.net/pidflo/1.0".equals(namespace2)) {
                                    if (name2.equalsIgnoreCase("Circle")) {
                                        adxy adxyVar = new adxy();
                                        xmlPullParser.getAttributeValue("", "srsName");
                                        str2 = str10;
                                        int nextTag4 = xmlPullParser.nextTag();
                                        String name4 = xmlPullParser.getName();
                                        str3 = name;
                                        while (true) {
                                            if (nextTag4 == 3) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10 && name4.equalsIgnoreCase("Circle")) {
                                                break;
                                            }
                                            if (name4.equalsIgnoreCase("radius")) {
                                                adxyVar.b = new adyc("radius");
                                                adxyVar.b.b(xmlPullParser);
                                            }
                                            if (name4.equalsIgnoreCase("pos")) {
                                                adxyVar.a = new adyn();
                                                adxyVar.a.cz(xmlPullParser);
                                            }
                                            nextTag4 = xmlPullParser.nextTag();
                                            name4 = xmlPullParser.getName();
                                        }
                                        adydVar.a().add(adxyVar);
                                    } else {
                                        str2 = str10;
                                        str3 = name;
                                    }
                                    if (name2.equalsIgnoreCase("Prism")) {
                                        adyg adygVar = new adyg();
                                        adygVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                        int nextTag5 = xmlPullParser.nextTag();
                                        String name5 = xmlPullParser.getName();
                                        String namespace4 = xmlPullParser.getNamespace();
                                        while (true) {
                                            if (nextTag5 == 3) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z8 && name5.equalsIgnoreCase("Prism")) {
                                                break;
                                            }
                                            if ("http://www.opengis.net/pidflo/1.0".equals(namespace4)) {
                                                if (name5.equalsIgnoreCase("height")) {
                                                    adygVar.c = new adyc("height");
                                                    adygVar.c.b(xmlPullParser);
                                                }
                                                if (name5.equalsIgnoreCase("base")) {
                                                    String name6 = xmlPullParser.getName();
                                                    xmlPullParser.getNamespace();
                                                    while (true) {
                                                        if (nextTag5 == 3) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        if (!(name6.equalsIgnoreCase("base") & z9)) {
                                                            xmlPullParser.nextTag();
                                                            String name7 = xmlPullParser.getName();
                                                            xmlPullParser.getNamespace();
                                                            if (name7.equals("Polygon")) {
                                                                adygVar.b = new adym();
                                                            }
                                                            if (name7.equals("ArcBand")) {
                                                                adygVar.b = new adxw();
                                                            }
                                                            adygVar.b.b(xmlPullParser);
                                                            nextTag5 = xmlPullParser.nextTag();
                                                            name6 = xmlPullParser.getName();
                                                            xmlPullParser.getNamespace();
                                                        }
                                                    }
                                                }
                                            }
                                            nextTag5 = xmlPullParser.nextTag();
                                            name5 = xmlPullParser.getName();
                                            namespace4 = xmlPullParser.getNamespace();
                                        }
                                        adydVar.a().add(adygVar);
                                    }
                                    if (!name2.equalsIgnoreCase("Ellipsoid")) {
                                        str4 = "srsName";
                                        str5 = "radius";
                                    } else {
                                        adya adyaVar = new adya();
                                        adyaVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                        int nextTag6 = xmlPullParser.nextTag();
                                        String name8 = xmlPullParser.getName();
                                        str4 = "srsName";
                                        int i2 = 3;
                                        str5 = "radius";
                                        String namespace5 = xmlPullParser.getNamespace();
                                        while (true) {
                                            if (nextTag6 == i2) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7 && name8.equalsIgnoreCase("Ellipsoid")) {
                                                break;
                                            }
                                            if ("http://www.opengis.net/gml".equals(namespace5)) {
                                                if (name8.equalsIgnoreCase("pos")) {
                                                    adyaVar.b = new adyn();
                                                    adyaVar.b.cz(xmlPullParser);
                                                }
                                            } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace5)) {
                                                if (name8.equalsIgnoreCase("semiMajorAxis")) {
                                                    adyaVar.c = new adyc("semiMajorAxis");
                                                    adyaVar.c.b(xmlPullParser);
                                                }
                                                if (name8.equalsIgnoreCase("semiMinorAxis")) {
                                                    adyaVar.d = new adyc("semiMinorAxis");
                                                    adyaVar.d.b(xmlPullParser);
                                                }
                                                if (name8.equalsIgnoreCase("verticalAxis")) {
                                                    adyaVar.e = new adyc("verticalAxis");
                                                    adyaVar.e.b(xmlPullParser);
                                                }
                                                if (name8.equalsIgnoreCase("orientation")) {
                                                    adyaVar.f = new adxv("orientation");
                                                    adyaVar.f.b(xmlPullParser);
                                                }
                                            }
                                            nextTag6 = xmlPullParser.nextTag();
                                            name8 = xmlPullParser.getName();
                                            namespace5 = xmlPullParser.getNamespace();
                                            i2 = 3;
                                        }
                                        adydVar.a().add(adyaVar);
                                    }
                                    if (name2.equalsIgnoreCase("Sphere")) {
                                        adyi adyiVar = new adyi();
                                        str6 = str4;
                                        adyiVar.c = xmlPullParser.getAttributeValue("", str6);
                                        int nextTag7 = xmlPullParser.nextTag();
                                        String name9 = xmlPullParser.getName();
                                        String namespace6 = xmlPullParser.getNamespace();
                                        str7 = "orientation";
                                        while (true) {
                                            if (nextTag7 == 3) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (z6 && name9.equalsIgnoreCase("Sphere")) {
                                                break;
                                            }
                                            if ("http://www.opengis.net/gml".equals(namespace6)) {
                                                if (name9.equalsIgnoreCase("pos")) {
                                                    adyiVar.a = new adyn();
                                                    adyiVar.a.cz(xmlPullParser);
                                                }
                                            } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace6)) {
                                                str9 = str5;
                                                if (name9.equalsIgnoreCase(str9)) {
                                                    adyiVar.b = new adyc(str9);
                                                    adyiVar.b.b(xmlPullParser);
                                                }
                                                nextTag7 = xmlPullParser.nextTag();
                                                name9 = xmlPullParser.getName();
                                                namespace6 = xmlPullParser.getNamespace();
                                                str5 = str9;
                                            }
                                            str9 = str5;
                                            nextTag7 = xmlPullParser.nextTag();
                                            name9 = xmlPullParser.getName();
                                            namespace6 = xmlPullParser.getNamespace();
                                            str5 = str9;
                                        }
                                        adydVar.a().add(adyiVar);
                                    } else {
                                        str6 = str4;
                                        str7 = "orientation";
                                    }
                                    if (name2.equalsIgnoreCase("Ellipse")) {
                                        adxz adxzVar = new adxz();
                                        adxzVar.e = xmlPullParser.getAttributeValue("", str6);
                                        int nextTag8 = xmlPullParser.nextTag();
                                        String name10 = xmlPullParser.getName();
                                        String namespace7 = xmlPullParser.getNamespace();
                                        while (true) {
                                            if (nextTag8 == 3) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5 && name10.equalsIgnoreCase("Ellipse")) {
                                                break;
                                            }
                                            if ("http://www.opengis.net/gml".equals(namespace7)) {
                                                if (name10.equalsIgnoreCase("pos")) {
                                                    adxzVar.a = new adyn();
                                                    adxzVar.a.cz(xmlPullParser);
                                                }
                                            } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace7)) {
                                                if (name10.equalsIgnoreCase("semiMajorAxis")) {
                                                    adxzVar.b = new adyc("semiMajorAxis");
                                                    adxzVar.b.b(xmlPullParser);
                                                }
                                                if (name10.equalsIgnoreCase("semiMinorAxis")) {
                                                    adxzVar.c = new adyc("semiMinorAxis");
                                                    adxzVar.c.b(xmlPullParser);
                                                }
                                                str8 = str7;
                                                if (name10.equalsIgnoreCase(str8)) {
                                                    adxzVar.d = new adxv(str8);
                                                    adxzVar.d.b(xmlPullParser);
                                                }
                                                int nextTag9 = xmlPullParser.nextTag();
                                                str7 = str8;
                                                nextTag8 = nextTag9;
                                                name10 = xmlPullParser.getName();
                                                namespace7 = xmlPullParser.getNamespace();
                                            }
                                            str8 = str7;
                                            int nextTag92 = xmlPullParser.nextTag();
                                            str7 = str8;
                                            nextTag8 = nextTag92;
                                            name10 = xmlPullParser.getName();
                                            namespace7 = xmlPullParser.getNamespace();
                                        }
                                        adydVar.a().add(adxzVar);
                                    }
                                    if (name2.equalsIgnoreCase("ArcBand")) {
                                        adxw adxwVar = new adxw();
                                        adxwVar.b(xmlPullParser);
                                        adydVar.a().add(adxwVar);
                                    }
                                    document3 = document;
                                } else {
                                    str2 = str10;
                                    str3 = name;
                                    if (adydVar.a == null) {
                                        adydVar.a = new ArrayList();
                                    }
                                    document3 = document;
                                    adydVar.a.add(((aday) adydVar.b.b()).I(document3, new QName(namespace2, name2), xmlPullParser));
                                }
                            }
                            nextTag2 = xmlPullParser.nextTag();
                            name2 = xmlPullParser.getName();
                            namespace2 = xmlPullParser.getNamespace();
                            document4 = document3;
                            str11 = str;
                            name = str3;
                            str10 = str2;
                            i = 3;
                        }
                    }
                    String str12 = str10;
                    String str13 = name;
                    document2 = document4;
                    if (str13.equalsIgnoreCase("usage-rules")) {
                        adyj adyjVar = new adyj();
                        adybVar = this;
                        adybVar.a = adyjVar;
                        String namespace8 = xmlPullParser.getNamespace();
                        int nextTag10 = xmlPullParser.nextTag();
                        String name11 = xmlPullParser.getName();
                        while (true) {
                            if (nextTag10 == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && name11.equals("usage-rules")) {
                                break;
                            }
                            String str14 = str12;
                            if (str14.equals(namespace8)) {
                                if (name11.equalsIgnoreCase("retransmission-allowed")) {
                                    String nextText = xmlPullParser.nextText();
                                    if (nextText.equals("yes") || nextText.equalsIgnoreCase("true")) {
                                        adyjVar.a = Boolean.TRUE;
                                    }
                                    if (nextText.equalsIgnoreCase("no") || nextText.equalsIgnoreCase("false")) {
                                        adyjVar.a = Boolean.FALSE;
                                    }
                                } else if (name11.equalsIgnoreCase("ruleset-reference")) {
                                    adyjVar.c = xmlPullParser.nextText();
                                } else if (name11.equalsIgnoreCase("retention-expiry")) {
                                    adyjVar.d = adxb.b(xmlPullParser.nextText());
                                } else if (name11.equalsIgnoreCase("note-well")) {
                                    adyjVar.e = xmlPullParser.getAttributeValue("", "xml:lang");
                                    adyjVar.b = xmlPullParser.nextText();
                                }
                            }
                            int nextTag11 = xmlPullParser.nextTag();
                            str12 = str14;
                            nextTag10 = nextTag11;
                            namespace8 = xmlPullParser.getNamespace();
                            name11 = xmlPullParser.getName();
                        }
                    } else {
                        adybVar = this;
                    }
                    if (str13.equalsIgnoreCase("method")) {
                        adybVar.c = xmlPullParser.nextText();
                    }
                    if (str13.equalsIgnoreCase("provided-by")) {
                        adyh adyhVar = (adyh) adybVar.f.b();
                        adybVar.d = adyhVar;
                        int nextTag12 = xmlPullParser.nextTag();
                        String name12 = xmlPullParser.getName();
                        String namespace9 = xmlPullParser.getNamespace();
                        while (true) {
                            if (nextTag12 == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!(z2 & name12.equalsIgnoreCase("provided-by"))) {
                                adyhVar.a().add(((aday) adyhVar.a.b()).I(document2, new QName(namespace9, name12), xmlPullParser));
                                nextTag12 = xmlPullParser.nextTag();
                                name12 = xmlPullParser.getName();
                                namespace9 = xmlPullParser.getNamespace();
                            }
                        }
                    }
                } else {
                    adybVar = adybVar2;
                    document2 = document4;
                }
                nextTag = xmlPullParser.nextTag();
                Document document5 = document2;
                name = xmlPullParser.getName();
                adybVar2 = adybVar;
                namespace = xmlPullParser.getNamespace();
                document4 = document5;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
        adyd adydVar = this.b;
        if (adydVar != null) {
            adydVar.c(xmlSerializer);
        }
        adyj adyjVar = this.a;
        if (adyjVar != null) {
            adyjVar.c(xmlSerializer);
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
        }
        adyh adyhVar = this.d;
        if (adyhVar != null) {
            adyhVar.c(xmlSerializer);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyb)) {
            return false;
        }
        adyb adybVar = (adyb) obj;
        if (!Objects.equals(this.b, adybVar.a()) || !Objects.equals(this.a, adybVar.a) || !Objects.equals(this.c, adybVar.c) || !Objects.equals(this.d, adybVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d);
    }
}
