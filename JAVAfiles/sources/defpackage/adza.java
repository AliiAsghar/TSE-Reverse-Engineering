package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adza extends adyu {
    public final List b = new ArrayList();
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private String e;

    public final void a(Document document, XmlPullParser xmlPullParser) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("name")) {
                this.e = xmlPullParser.getAttributeValue(i);
            } else {
                this.d.put(new QName(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i)), xmlPullParser.getAttributeValue(i));
            }
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
            if (!(z & name.equals("list"))) {
                if ("urn:ietf:params:xml:ns:resource-lists".equals(namespace)) {
                    if (name.equals("list")) {
                        adza adzaVar = new adza();
                        adzaVar.a(document, xmlPullParser);
                        this.b.add(adzaVar);
                    } else if (name.equals("entry")) {
                        adyy adyyVar = new adyy();
                        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                            if (xmlPullParser.getAttributeName(i2).equals(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                                adyyVar.d = xmlPullParser.getAttributeValue(i2);
                            } else {
                                if (adyyVar.e == null) {
                                    adyyVar.e = new HashMap();
                                }
                                adyyVar.e.put(new QName(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2)), xmlPullParser.getAttributeValue(i2));
                            }
                        }
                        int nextTag2 = xmlPullParser.nextTag();
                        String namespace2 = xmlPullParser.getNamespace();
                        String name2 = xmlPullParser.getName();
                        while (true) {
                            if (nextTag2 == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && name2.equals("entry")) {
                                break;
                            }
                            if ("urn:ietf:params:xml:ns:resource-lists".equals(namespace2)) {
                                if (name2.equals("display-name")) {
                                    adyyVar.b = new adyw();
                                    adyyVar.b.b(xmlPullParser);
                                }
                            } else {
                                Element d = adxb.d(document, xmlPullParser);
                                if (adyyVar.c == null) {
                                    adyyVar.c = new ArrayList(1);
                                }
                                adyyVar.c.add(d);
                            }
                            nextTag2 = xmlPullParser.nextTag();
                            namespace2 = xmlPullParser.getNamespace();
                            name2 = xmlPullParser.getName();
                        }
                        this.b.add(adyyVar);
                    } else if (name.equals("external")) {
                        adyz adyzVar = new adyz();
                        for (int i3 = 0; i3 < xmlPullParser.getAttributeCount(); i3++) {
                            if (xmlPullParser.getAttributeName(i3).equals("anchor")) {
                                adyzVar.c = xmlPullParser.getAttributeValue(i3);
                            } else {
                                new QName(xmlPullParser.getAttributeNamespace(i3), xmlPullParser.getAttributeName(i3));
                                xmlPullParser.getAttributeValue(i3);
                                throw null;
                            }
                        }
                        int nextTag3 = xmlPullParser.nextTag();
                        String namespace3 = xmlPullParser.getNamespace();
                        String name3 = xmlPullParser.getName();
                        while (true) {
                            if (nextTag3 == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 && name3.equals("external")) {
                                break;
                            }
                            if ("urn:ietf:params:xml:ns:resource-lists".equals(namespace3)) {
                                if (name3.equals("display-name")) {
                                    adyw adywVar = new adyw();
                                    adywVar.b(xmlPullParser);
                                    adyzVar.a = adywVar;
                                }
                            } else {
                                Element d2 = adxb.d(document, xmlPullParser);
                                if (adyzVar.b == null) {
                                    adyzVar.b = new ArrayList();
                                }
                                adyzVar.b.add(d2);
                            }
                            nextTag3 = xmlPullParser.nextTag();
                            namespace3 = xmlPullParser.getNamespace();
                            name3 = xmlPullParser.getName();
                        }
                        this.b.add(adyzVar);
                    } else if (name.equals("entry-ref")) {
                        adyx adyxVar = new adyx();
                        for (int i4 = 0; i4 < xmlPullParser.getAttributeCount(); i4++) {
                            if (xmlPullParser.getAttributeName(i4).equals("ref")) {
                                adyxVar.c = xmlPullParser.getAttributeValue(i4);
                            } else {
                                new QName(xmlPullParser.getAttributeNamespace(i4), xmlPullParser.getAttributeName(i4));
                                xmlPullParser.getAttributeValue(i4);
                                throw null;
                            }
                        }
                        int nextTag4 = xmlPullParser.nextTag();
                        String namespace4 = xmlPullParser.getNamespace();
                        String name4 = xmlPullParser.getName();
                        while (true) {
                            if (nextTag4 == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2 && name4.equals("entry-ref")) {
                                break;
                            }
                            if ("urn:ietf:params:xml:ns:resource-lists".equals(namespace4)) {
                                if (name4.equals("display-name")) {
                                    adyw adywVar2 = new adyw();
                                    adywVar2.b(xmlPullParser);
                                    adyxVar.a = adywVar2;
                                }
                            } else {
                                Element d3 = adxb.d(document, xmlPullParser);
                                if (adyxVar.b == null) {
                                    adyxVar.b = new ArrayList();
                                }
                                adyxVar.b.add(d3);
                            }
                            nextTag4 = xmlPullParser.nextTag();
                            namespace4 = xmlPullParser.getNamespace();
                            name4 = xmlPullParser.getName();
                        }
                        this.b.add(adyxVar);
                    } else if (name.equals("display-name")) {
                        adyw adywVar3 = new adyw();
                        adywVar3.b(xmlPullParser);
                        this.a = adywVar3;
                    }
                } else {
                    this.c.add(adxb.d(document, xmlPullParser));
                }
                nextTag = xmlPullParser.nextTag();
                namespace = xmlPullParser.getNamespace();
                name = xmlPullParser.getName();
            } else {
                return;
            }
        }
    }

    public final void b(XmlSerializer xmlSerializer) {
        String str = this.e;
        if (str != null) {
            xmlSerializer.attribute("", "name", str);
        }
        adyw adywVar = this.a;
        if (adywVar != null) {
            adywVar.a(xmlSerializer);
        }
        for (int i = 0; i < this.b.size(); i++) {
            Object obj = this.b.get(i);
            if (obj instanceof adza) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "list");
                ((adza) obj).b(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "list");
            } else if (obj instanceof adyy) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry");
                adyy adyyVar = (adyy) obj;
                if (adyyVar.f != adyv.NONE) {
                    xmlSerializer.attribute("urn:ietf:params:xml:ns:copycontrol", "copyControl", adyyVar.f.e);
                }
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, adyyVar.d);
                Map map = adyyVar.e;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        xmlSerializer.attribute(((QName) entry.getKey()).getPrefix(), ((QName) entry.getKey()).getLocalPart(), (String) entry.getValue());
                    }
                }
                adyw adywVar2 = adyyVar.b;
                if (adywVar2 != null) {
                    adywVar2.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry");
            } else if (obj instanceof adyx) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
                adyx adyxVar = (adyx) obj;
                xmlSerializer.attribute("", "ref", adyxVar.c);
                adyw adywVar3 = adyxVar.a;
                if (adywVar3 != null) {
                    adywVar3.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
            } else if (obj instanceof adyz) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "external");
                adyz adyzVar = (adyz) obj;
                xmlSerializer.attribute("", "anchor", adyzVar.c);
                adyw adywVar4 = adyzVar.a;
                if (adywVar4 != null) {
                    adywVar4.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "external");
            }
        }
    }
}
