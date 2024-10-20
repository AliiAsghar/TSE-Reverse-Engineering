package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxl implements adwz {
    private static final alpt a = new altx(new QName("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness"));
    private static final alpt b = new altx(adxm.class);
    private final armf c;

    public adxl(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        boolean z;
        if ("overriding-willingness".equals(qName.getLocalPart())) {
            adxm adxmVar = (adxm) this.c.b();
            int nextTag = xmlPullParser.nextTag();
            String name = xmlPullParser.getName();
            String namespace = xmlPullParser.getNamespace();
            if (xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until") != null) {
                String attributeValue = xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until");
                if (!Objects.isNull(attributeValue)) {
                    adxmVar.c = adxb.b(attributeValue);
                }
            }
            while (true) {
                if (nextTag == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z & name.equals("overriding-willingness"))) {
                    if (!"urn:oma:xml:pde:pidf:ext".equals(namespace) && !"urn:oma:params:xml:ns:pidf:oma-pres".equals(namespace)) {
                        if (adxmVar.a == null) {
                            adxmVar.a = new ArrayList();
                        }
                        adxmVar.a.add(((aday) adxmVar.d.b()).I(document, new QName(namespace, name), xmlPullParser));
                    } else if (name.equals("basic")) {
                        adxmVar.b = adxo.a(xmlPullParser.nextText());
                    }
                    nextTag = xmlPullParser.nextTag();
                    name = xmlPullParser.getName();
                    namespace = xmlPullParser.getNamespace();
                } else {
                    return adxmVar;
                }
            }
        } else {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
    }

    @Override // defpackage.adwz
    public final Set b() {
        return a;
    }

    @Override // defpackage.adwz
    public final Set c() {
        return b;
    }

    @Override // defpackage.adwz
    public final void d(Object obj, XmlSerializer xmlSerializer) {
        if (obj instanceof adxm) {
            ((adxm) obj).c(xmlSerializer);
        }
    }
}
