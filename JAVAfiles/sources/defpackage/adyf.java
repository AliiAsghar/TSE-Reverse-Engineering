package defpackage;

import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyf implements adwz {
    public static final alpt a = new altx(new QName("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv"));
    public static final alpt b = new altx(adyb.class);
    private final armf c;

    public adyf(armf armfVar) {
        this.c = armfVar;
    }

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        if (qName.getLocalPart().equals("geopriv")) {
            adyb adybVar = (adyb) this.c.b();
            adybVar.b(document, xmlPullParser);
            return adybVar;
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
        if (obj instanceof adyb) {
            ((adyb) obj).c(xmlSerializer);
        }
    }
}
