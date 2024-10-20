package defpackage;

import j$.util.Objects;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyl extends adcx implements adye {
    public adyn a;
    public String b;

    public adyl() {
        super(null, null);
        this.b = "urn:ogc:def:crs:EPSG::4326";
    }

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Point");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        adyn adynVar = this.a;
        if (adynVar != null) {
            adynVar.cy(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Point");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyl)) {
            return false;
        }
        return this.a.equals(((adyl) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
