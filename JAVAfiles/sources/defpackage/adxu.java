package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxu implements adxa {
    public adxt b;
    public adxn c;
    public adxp d;
    public List e;
    public advi f;
    public final armf h;
    public final armf i;
    public final adwp j;
    private List k;
    public List g = new ArrayList();
    public String a = "i".concat(aikx.a());

    public adxu(adwp adwpVar, armf armfVar, armf armfVar2) {
        this.j = adwpVar;
        this.h = armfVar;
        this.i = armfVar2;
    }

    public final List a() {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        return this.k;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.attribute("", "id", String.valueOf(this.a));
        adxt adxtVar = this.b;
        if (adxtVar != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "status");
            if (!Objects.isNull(adxtVar.a)) {
                String str = adxtVar.a.c;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "basic");
                xmlSerializer.text(str);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "basic");
            }
            List list = adxtVar.b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((aday) adxtVar.c.b()).J(it.next(), xmlSerializer);
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "status");
        }
        adxn adxnVar = this.c;
        if (adxnVar != null) {
            adxnVar.c(xmlSerializer);
        }
        List list2 = this.k;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((aday) this.i.b()).J(it2.next(), xmlSerializer);
            }
        }
        adxp adxpVar = this.d;
        if (adxpVar != null) {
            adxpVar.c(xmlSerializer);
        }
        List list3 = this.e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((adxq) it3.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf");
            }
        }
        if (this.f != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "timestamp");
            xmlSerializer.text(this.f.toString());
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "timestamp");
        }
    }

    public final String toString() {
        return "TupleType{id='" + this.a + "', status=" + String.valueOf(this.b) + ", serviceDescription=" + String.valueOf(this.c) + "}";
    }
}
