package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxn implements adxa {
    public List a;
    public String b;
    public String c;
    public String d;
    public final aday e;

    public adxn(aday adayVar, String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.e = adayVar;
        if (str3 != null) {
            this.d = str3;
        }
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "service-description");
        if (this.b != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "service-id");
            xmlSerializer.text(this.b);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "service-id");
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        }
        if (this.d != null) {
            xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "description");
            xmlSerializer.text(this.d);
            xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "description");
        }
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.e.J(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "service-description");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adxn)) {
            return false;
        }
        adxn adxnVar = (adxn) obj;
        String str = this.b;
        if ((str == null && adxnVar.b != null) || (str != null && !str.equals(adxnVar.b))) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (adxnVar.c == null) {
                return true;
            }
            return false;
        }
        return str2.equals(adxnVar.c);
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.c;
        int i2 = i * 31;
        if (str2 != null) {
            return i2 + str2.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return "ServiceDescription{serviceID='" + this.b + "', version='" + this.c + "', description='" + this.d + "'}";
    }
}
