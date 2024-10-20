package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsz implements adxa {
    public adtb a;
    public String b;
    public final armf c;
    public final armf d;
    private List e;

    public adsz(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.d = armfVar2;
    }

    public final adtb a() {
        if (this.a == null) {
            this.a = (adtb) this.d.b();
        }
        return this.a;
    }

    public final List b() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        return this.e;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "entity", str);
        }
        adtb adtbVar = this.a;
        if (adtbVar != null) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
            xmlSerializer.attribute("", "id", adtbVar.a);
            String str2 = adtbVar.b;
            if (str2 != null) {
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, str2);
            }
            adyb adybVar = adtbVar.d;
            if (adybVar != null) {
                adybVar.c(xmlSerializer);
            }
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.text(adxb.a(new Date(adtbVar.c)));
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
        }
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aday) this.c.b()).J(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
    }
}
