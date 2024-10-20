package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyq implements adxa {
    private List a;
    private List b;
    private adxq c;
    private Date d;
    private Date e;
    private final armf f;

    public adyq(armf armfVar) {
        this.f = armfVar;
    }

    public final String a() {
        adxq adxqVar = this.c;
        if (adxqVar == null) {
            return null;
        }
        return (String) adxqVar.b;
    }

    public final List b() {
        if (this.a == null) {
            this.a = new ArrayList(3);
        }
        return this.a;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
        Date date = this.e;
        if (date != null && this.d != null) {
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "from", adxb.a(date));
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "until", adxb.a(this.d));
        }
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((adxq) it.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf:rpid");
            }
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
            xmlSerializer.text((String) this.c.b);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
    }

    public final List d() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public final void e(Document document, XmlPullParser xmlPullParser) {
        boolean z;
        String attributeValue = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "from");
        if (attributeValue != null) {
            this.e = adxb.b(attributeValue);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
        if (attributeValue2 != null) {
            this.d = adxb.b(attributeValue2);
        }
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        while (true) {
            if (nextTag == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!(z & name.equals("place-type"))) {
                if ("urn:ietf:params:xml:ns:pidf:rpid".equals(namespace)) {
                    if ("note".equals(name)) {
                        adxq adxqVar = new adxq();
                        adxqVar.b(xmlPullParser);
                        d().add(adxqVar);
                    } else if ("other".equals(name)) {
                        this.c = new adxq(xmlPullParser.nextText());
                    } else {
                        b().add(((aday) this.f.b()).I(document, new QName(namespace, name), xmlPullParser));
                    }
                } else {
                    b().add(((aday) this.f.b()).I(document, new QName(namespace, name), xmlPullParser));
                }
                nextTag = xmlPullParser.nextTag();
                namespace = xmlPullParser.getNamespace();
                name = xmlPullParser.getName();
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        long j;
        if (!(obj instanceof adyq)) {
            return false;
        }
        adyq adyqVar = (adyq) obj;
        if (this.b != null && adyqVar.d() != null && this.b.size() != adyqVar.d().size()) {
            return false;
        }
        long j2 = 0;
        if (this.d != null && adyqVar.d != null) {
            j2 = TimeUnit.MILLISECONDS.toSeconds(this.d.getTime());
            j = TimeUnit.MILLISECONDS.toSeconds(adyqVar.d.getTime());
        } else {
            j = 0;
        }
        if (j2 != j || !Objects.equals(a(), adyqVar.a())) {
            return false;
        }
        return true;
    }
}
