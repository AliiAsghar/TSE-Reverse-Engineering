package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adya implements adye {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public adyn b;
    public adyc c;
    public adyc d;
    public adyc e;
    public adxv f;

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        adyn adynVar = this.b;
        if (adynVar != null) {
            adynVar.cy(xmlSerializer);
        }
        adyc adycVar = this.c;
        if (adycVar != null) {
            adycVar.a(xmlSerializer);
        }
        adyc adycVar2 = this.d;
        if (adycVar2 != null) {
            adycVar2.a(xmlSerializer);
        }
        adyc adycVar3 = this.e;
        if (adycVar3 != null) {
            adycVar3.a(xmlSerializer);
        }
        adxv adxvVar = this.f;
        if (adxvVar != null) {
            adxvVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adya)) {
            return false;
        }
        adya adyaVar = (adya) obj;
        if (!this.f.equals(adyaVar.f) || !this.b.equals(adyaVar.b) || !this.c.equals(adyaVar.c) || !this.d.equals(adyaVar.d) || !this.e.equals(adyaVar.e) || !Objects.equals(this.a, adyaVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.b, this.c, this.d, this.e, Objects.toString(this.a, "")});
    }
}
