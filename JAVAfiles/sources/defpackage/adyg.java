package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyg implements adye {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public adxx b;
    public adyc c;

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Prism");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        adxx adxxVar = this.b;
        if (adxxVar != null) {
            adxxVar.a(xmlSerializer);
        }
        adyc adycVar = this.c;
        if (adycVar != null) {
            adycVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Prism");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyg)) {
            return false;
        }
        adyg adygVar = (adyg) obj;
        if (!this.b.equals(adygVar.b) || !this.c.equals(adygVar.c) || !Objects.equals(this.a, adygVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Objects.toString(this.a, "")});
    }
}
