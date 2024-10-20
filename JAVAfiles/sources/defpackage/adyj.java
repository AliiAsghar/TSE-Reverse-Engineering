package defpackage;

import j$.util.Objects;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyj implements adxa {
    public Boolean a;
    public String b;
    public String c;
    public Date d;
    public String e;

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
        if (this.a != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retransmission-allowed");
            if (this.a.booleanValue()) {
                xmlSerializer.text("yes");
            } else {
                xmlSerializer.text("no");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retransmission-allowed");
        }
        if (this.b != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "note-well");
            String str = this.e;
            if (str != null) {
                xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:geopriv10", "xml:lang", str);
            }
            xmlSerializer.text(this.b);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "note-well");
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "ruleset-reference");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "ruleset-reference");
        }
        if (this.d != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry");
            xmlSerializer.text(adxb.a(this.d));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
    }

    public final boolean equals(Object obj) {
        long j;
        if (!(obj instanceof adyj)) {
            return false;
        }
        adyj adyjVar = (adyj) obj;
        long j2 = 0;
        if (this.d != null && adyjVar.d != null) {
            j2 = TimeUnit.MILLISECONDS.toSeconds(this.d.getTime());
            j = TimeUnit.MILLISECONDS.toSeconds(adyjVar.d.getTime());
        } else {
            j = 0;
        }
        if (j2 != j) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d);
    }
}
