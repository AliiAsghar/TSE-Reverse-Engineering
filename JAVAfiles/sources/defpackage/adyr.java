package defpackage;

import java.util.HashMap;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyr implements adwz {
    public static final alpt a = alpt.s(new QName("urn:ietf:params:xml:ns:pidf:rpid", "status-icon"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "class"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "place-type"));
    public static final alpt b = alpt.s(adys.class, adyp.class, adyq.class);
    private final armf c;

    public adyr(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (qName.getLocalPart().equals("status-icon")) {
            adys adysVar = new adys();
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                String attributeNamespace = xmlPullParser.getAttributeNamespace(i);
                String attributeName = xmlPullParser.getAttributeName(i);
                String attributeValue = xmlPullParser.getAttributeValue(i);
                if (attributeName.equals("id")) {
                    adysVar.c = attributeValue;
                } else if (attributeName.equals("from")) {
                    adysVar.a = adxb.b(attributeValue);
                } else if (attributeName.equals("until")) {
                    adysVar.b = adxb.b(attributeValue);
                } else {
                    if (adysVar.e == null) {
                        adysVar.e = new HashMap();
                    }
                    adysVar.e.put(new QName(attributeNamespace, attributeName), attributeValue);
                }
            }
            adysVar.d = xmlPullParser.nextText();
            return adysVar;
        }
        if (qName.getLocalPart().equals("class")) {
            adyp adypVar = new adyp();
            adypVar.a = xmlPullParser.nextText();
            return adypVar;
        }
        if (qName.getLocalPart().equals("place-type")) {
            adyq adyqVar = (adyq) this.c.b();
            adyqVar.e(document, xmlPullParser);
            return adyqVar;
        }
        throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
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
        if (obj instanceof adys) {
            ((adys) obj).c(xmlSerializer);
        } else if (obj instanceof adyp) {
            ((adyp) obj).c(xmlSerializer);
        } else if (obj instanceof adyq) {
            ((adyq) obj).c(xmlSerializer);
        }
    }
}
