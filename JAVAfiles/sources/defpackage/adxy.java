package defpackage;

import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxy implements adye {
    public adyn a;
    public adyc b;
    private final String c = "urn:ogc:def:crs:EPSG::4326";

    public adxy() {
    }

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
        xmlSerializer.attribute("", "srsName", this.c);
        adyn adynVar = this.a;
        if (adynVar != null) {
            adynVar.cy(xmlSerializer);
        }
        adyc adycVar = this.b;
        if (adycVar != null) {
            adycVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adxy)) {
            return false;
        }
        adxy adxyVar = (adxy) obj;
        if (!this.a.equals(adxyVar.a) || !this.b.equals(adxyVar.b) || !this.c.equals(adxyVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.valueOf(String.valueOf(this.a)).concat(String.valueOf(String.valueOf(this.b)));
    }

    public adxy(adyn adynVar, Double d) {
        this.a = adynVar;
        this.b = new adyc(d);
    }
}
