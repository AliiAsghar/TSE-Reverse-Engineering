package defpackage;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyw {
    private String a;
    private String b;

    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "display-name");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", str);
        }
        xmlSerializer.text(this.a);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "display-name");
    }

    public final void b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        if (attributeValue != null) {
            this.b = attributeValue;
        }
        this.a = xmlPullParser.nextText();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        adyw adywVar = (adyw) obj;
        String str = this.b;
        if (str == null) {
            if (adywVar.b != null) {
                return false;
            }
        } else if (!str.equals(adywVar.b)) {
            return false;
        }
        String str2 = this.a;
        if (str2 == null && adywVar.a != null) {
            return false;
        }
        return str2.equals(adywVar.a);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + 31) * 31) + i;
    }
}
