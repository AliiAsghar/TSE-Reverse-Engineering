package defpackage;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adzf implements adxa {
    private String a;
    private String b;

    public final void a(XmlPullParser xmlPullParser) {
        this.b = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        this.a = xmlPullParser.nextText();
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "name");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", str);
        }
        xmlSerializer.text(this.a);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "name");
    }
}
