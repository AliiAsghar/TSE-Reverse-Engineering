package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyd implements adxa {
    public List a;
    public final armf b;
    private List c;

    public adyd(armf armfVar) {
        this.b = armfVar;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((adye) it.next()).c(xmlSerializer);
            }
        }
        List list2 = this.a;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((aday) this.b.b()).J(it2.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyd)) {
            return false;
        }
        adyd adydVar = (adyd) obj;
        if (a().size() != adydVar.a().size()) {
            return false;
        }
        for (int i = 0; i < a().size(); i++) {
            if (!Objects.equals((adye) a().get(i), (adye) adydVar.a().get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = a().size() * 37;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            size += ((adye) it.next()).hashCode() * 37;
        }
        return size;
    }
}
