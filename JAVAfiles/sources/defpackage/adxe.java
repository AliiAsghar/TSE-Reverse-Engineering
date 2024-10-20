package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxe implements adxa {
    public final List a = new ArrayList(1);

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "external-list");
        for (adwo adwoVar : this.a) {
            Object obj = adwoVar.a;
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "entry");
            xmlSerializer.attribute("", "anc", (String) adwoVar.a);
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "entry");
        }
        xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "external-list");
    }
}
