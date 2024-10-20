package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxw implements adye, adxx {
    private adyn a;
    private adyc b;
    private adyc c;
    private adxv d;
    private adxv e;
    private String f = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.adxx
    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        this.f = null;
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.adxx
    public final void b(XmlPullParser xmlPullParser) {
        boolean z;
        this.f = xmlPullParser.getAttributeValue("", "srsName");
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if (nextTag == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!(z & name.equalsIgnoreCase("ArcBand"))) {
                if ("http://www.opengis.net/pidflo/1.0".equals(namespace)) {
                    if (name.equalsIgnoreCase("outerRadius")) {
                        adyc adycVar = new adyc("outerRadius");
                        this.c = adycVar;
                        adycVar.b(xmlPullParser);
                    }
                    if (name.equalsIgnoreCase("innerRadius")) {
                        adyc adycVar2 = new adyc("innerRadius");
                        this.b = adycVar2;
                        adycVar2.b(xmlPullParser);
                    }
                    if (name.equalsIgnoreCase("startAngle")) {
                        adxv adxvVar = new adxv("startAngle");
                        this.d = adxvVar;
                        adxvVar.b(xmlPullParser);
                    }
                    if (name.equalsIgnoreCase("openingAngle")) {
                        adxv adxvVar2 = new adxv("openingAngle");
                        this.e = adxvVar2;
                        adxvVar2.b(xmlPullParser);
                    }
                } else if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("pos")) {
                    adyn adynVar = new adyn();
                    this.a = adynVar;
                    adynVar.cz(xmlPullParser);
                }
                nextTag = xmlPullParser.nextTag();
                name = xmlPullParser.getName();
                namespace = xmlPullParser.getNamespace();
            } else {
                return;
            }
        }
    }

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
        String str = this.f;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        adyn adynVar = this.a;
        if (adynVar != null) {
            adynVar.cy(xmlSerializer);
        }
        adyc adycVar = this.b;
        if (adycVar != null) {
            adycVar.a(xmlSerializer);
        }
        adyc adycVar2 = this.c;
        if (adycVar2 != null) {
            adycVar2.a(xmlSerializer);
        }
        adxv adxvVar = this.d;
        if (adxvVar != null) {
            adxvVar.a(xmlSerializer);
        }
        adxv adxvVar2 = this.e;
        if (adxvVar2 != null) {
            adxvVar2.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
    }

    @Override // defpackage.adxx
    public final boolean equals(Object obj) {
        if (!(obj instanceof adxw)) {
            return false;
        }
        adxw adxwVar = (adxw) obj;
        if (!Objects.equals(this.b, adxwVar.b) || !Objects.equals(this.e, adxwVar.e) || !Objects.equals(this.c, adxwVar.c) || !this.a.equals(adxwVar.a) || !Objects.equals(this.d, adxwVar.d) || !Objects.equals(this.f, adxwVar.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Objects.toString(this.b, ""), Objects.toString(this.e, ""), Objects.toString(this.c, ""), this.a, Objects.toString(this.d, ""), Objects.toString(this.f, "")});
    }
}
