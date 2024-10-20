package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxd implements adwz {
    private static final alpt a = alpt.s(new QName("urn:oma:xml:xdm:common-policy", "external-list"), new QName("urn:oma:xml:xdm:common-policy", "anonymous-request"), new QName("urn:oma:xml:xdm:common-policy", "other-identity"));
    private static final alpt b = alpt.s(adxc.class, adxe.class, adxf.class);

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        boolean z;
        String attributeValue;
        if ("external-list".equals(qName.getLocalPart())) {
            adxe adxeVar = new adxe();
            String name = xmlPullParser.getName();
            int nextTag = xmlPullParser.nextTag();
            String name2 = xmlPullParser.getName();
            while (true) {
                if (nextTag == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z & name2.equals(name))) {
                    if (name2.equals("entry") && (attributeValue = xmlPullParser.getAttributeValue("", "anc")) != null) {
                        adxeVar.a.add(new adwo(attributeValue));
                    }
                    nextTag = xmlPullParser.nextTag();
                    name2 = xmlPullParser.getName();
                } else {
                    return adxeVar;
                }
            }
        } else {
            if ("other-identity".equals(qName.getLocalPart())) {
                return new adxf();
            }
            if ("anonymous-request".equals(qName.getLocalPart())) {
                return new adxc();
            }
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
        if (obj instanceof adxe) {
            ((adxe) obj).c(xmlSerializer);
            return;
        }
        if (obj instanceof adxf) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "other-identity");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "other-identity");
        } else if (obj instanceof adxc) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
        }
    }
}
