package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxz implements adye {
    public adyn a;
    public adyc b;
    public adyc c;
    public adxv d;
    public String e = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
        xmlSerializer.attribute("", "srsName", String.valueOf(this.e));
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
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adxz)) {
            return false;
        }
        adxz adxzVar = (adxz) obj;
        if (!this.d.equals(adxzVar.d) || !this.a.equals(adxzVar.a) || !this.b.equals(adxzVar.b) || !this.c.equals(adxzVar.c) || !Objects.equals(this.e, adxzVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c, Objects.toString(this.e, "")});
    }
}
