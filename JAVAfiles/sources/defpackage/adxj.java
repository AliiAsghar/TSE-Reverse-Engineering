package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxj implements adwz {
    private static final alpt a = new altx(new QName("urn:ietf:params:xml:ns:pidf:cipid", "display-name"));
    private static final alpt b = new altx(adxk.class);

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if ("display-name".equals(qName.getLocalPart())) {
            adxk adxkVar = new adxk();
            adxkVar.a = xmlPullParser.nextText();
            return adxkVar;
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
        if (obj instanceof adxk) {
            ((adxk) obj).c(xmlSerializer);
        }
    }
}
