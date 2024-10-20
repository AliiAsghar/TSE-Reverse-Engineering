package defpackage;

import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxp implements adxa {
    public Double a;
    public String b;

    public adxp() {
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "contact");
        Double d = this.a;
        if (d != null) {
            xmlSerializer.attribute("", "priority", d.toString());
        }
        xmlSerializer.text(this.b);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "contact");
    }

    public adxp(String str) {
        this.b = str;
    }
}
