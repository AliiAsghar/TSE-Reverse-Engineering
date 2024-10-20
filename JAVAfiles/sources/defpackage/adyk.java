package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyk extends adcx implements adye {
    public List a;
    public adyo b;

    public adyk() {
        super(null, null);
    }

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "LinearRing");
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((adyn) it.next()).cy(xmlSerializer);
            }
        }
        adyo adyoVar = this.b;
        if (adyoVar != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "posList");
            List<adyn> list2 = adyoVar.a;
            if (list2 != null) {
                String str = "";
                for (adyn adynVar : list2) {
                    String str2 = str.concat("\n") + adynVar.cw() + " ";
                    Double cx = adynVar.cx();
                    Objects.toString(cx);
                    String concat = str2.concat(String.valueOf(cx));
                    Double d = adynVar.a;
                    if (d != null) {
                        str = concat + " " + d;
                    } else {
                        str = concat;
                    }
                }
                xmlSerializer.text(str);
            }
            xmlSerializer.endTag("http://www.opengis.net/gml", "posList");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "LinearRing");
    }

    public final List cw() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }
}
