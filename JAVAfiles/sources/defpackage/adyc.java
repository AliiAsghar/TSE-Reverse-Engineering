package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyc {
    public Double a;
    private final String b;
    private String c;

    public adyc(Double d) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = "radius";
        this.a = d;
    }

    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", this.b);
        xmlSerializer.attribute("", "uom", String.valueOf(this.c));
        Double d = this.a;
        if (d != null) {
            xmlSerializer.text(d.toString());
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", this.b);
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue("", "uom");
        this.a = Double.valueOf(xmlPullParser.nextText());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyc)) {
            return false;
        }
        adyc adycVar = (adyc) obj;
        if (!this.b.equals(adycVar.b) || !anbe.b(this.a.doubleValue(), adycVar.a.doubleValue(), 1.0E-5d) || !Objects.equals(this.c, adycVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, Objects.toString(this.c, "")});
    }

    public adyc(String str) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = str;
    }
}
