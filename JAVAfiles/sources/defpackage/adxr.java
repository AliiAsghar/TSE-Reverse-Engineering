package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxr implements adxa {
    public String a;
    public List b;
    public List c;
    public final armf d;
    public final armf e;
    private List f;

    public adxr(armf armfVar, armf armfVar2) {
        this.d = armfVar;
        this.e = armfVar2;
    }

    public final List a() {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return this.f;
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "presence");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "entity", str);
        }
        List<adxu> list = this.b;
        if (list != null) {
            for (adxu adxuVar : list) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "tuple");
                adxuVar.c(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "tuple");
            }
        }
        List list2 = this.c;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((adxq) it.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf");
            }
        }
        List list3 = this.f;
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ((aday) this.d.b()).J(it2.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "presence");
    }

    public final String toString() {
        return "Presence{entity='" + this.a + "', tuples=" + String.valueOf(this.b) + "}";
    }
}
