package defpackage;

import j$.util.Objects;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxm implements adxa {
    public List a;
    public adxo b;
    public Date c;
    public final armf d;

    public adxm(armf armfVar) {
        this.d = armfVar;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
        Date date = this.c;
        if (date != null) {
            xmlSerializer.attribute("urn:oma:xml:pde:pidf:ext", "until", adxb.a(date));
        }
        if (!Objects.isNull(this.b)) {
            String str = this.b.c;
            xmlSerializer.startTag("urn:oma:xml:pde:pidf:ext", "basic");
            xmlSerializer.text(str);
            xmlSerializer.endTag("urn:oma:xml:pde:pidf:ext", "basic");
        }
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aday) this.d.b()).J(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
    }
}
