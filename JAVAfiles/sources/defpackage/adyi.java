package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyi implements adye {
    public adyn a;
    public adyc b;
    public String c = "urn:ogc:def:crs:EPSG::4979";

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Sphere");
        xmlSerializer.attribute("", "srsName", Objects.toString(this.c, ""));
        adyn adynVar = this.a;
        if (adynVar != null) {
            adynVar.cy(xmlSerializer);
        }
        adyc adycVar = this.b;
        if (adycVar != null) {
            adycVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Sphere");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyi)) {
            return false;
        }
        adyi adyiVar = (adyi) obj;
        adyn adynVar = this.a;
        if (adynVar == null && adyiVar.a != null) {
            return false;
        }
        if (adynVar != null && !adynVar.equals(adyiVar.a)) {
            return false;
        }
        adyc adycVar = this.b;
        if (adycVar == null && adyiVar.a != null) {
            return false;
        }
        if ((adycVar != null && !adycVar.equals(adyiVar.b)) || !Objects.equals(this.c, adyiVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        adyn adynVar = this.a;
        if (adynVar != null) {
            arrayList.add(adynVar);
        }
        adyc adycVar = this.b;
        if (adycVar != null) {
            arrayList.add(adycVar);
        }
        String str = this.c;
        if (str != null) {
            arrayList.add(str);
        }
        return Arrays.hashCode(arrayList.toArray());
    }
}
