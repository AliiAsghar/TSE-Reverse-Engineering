package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyh implements adxa {
    public final armf a;
    private List b;

    public adyh(armf armfVar) {
        this.a = armfVar;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aday) this.a.b()).J(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyh) || a().size() != ((adyh) obj).a().size()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(a().size()));
    }
}
