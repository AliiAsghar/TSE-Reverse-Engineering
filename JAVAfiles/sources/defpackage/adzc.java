package defpackage;

import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adzc implements adxa {
    public String a;
    public adzh b;
    public String c;
    public String d;
    public List e;
    public final armf f;

    public adzc(armf armfVar) {
        this.f = armfVar;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "instance");
        xmlSerializer.attribute("", "id", this.a);
        xmlSerializer.attribute("", "state", this.b.d);
        String str = this.c;
        if (str != null) {
            xmlSerializer.attribute("", "reason", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            xmlSerializer.attribute("", "cid", str2);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "instance");
    }
}
