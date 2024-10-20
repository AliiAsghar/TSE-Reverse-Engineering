package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpj extends ArrayList {
    private static final long serialVersionUID = 5193682565287307651L;
    public final acpg a;

    public acpj(acpg acpgVar) {
        acpgVar.getClass();
        this.a = acpgVar;
    }

    public static acpj a(XmlPullParser xmlPullParser) {
        acpg a;
        char c;
        String name = xmlPullParser.getName();
        String attributeValue = xmlPullParser.getAttributeValue("", "state");
        if (attributeValue == null) {
            a = acpg.FULL;
        } else {
            a = acpg.a(attributeValue);
        }
        acpj acpjVar = new acpj(a);
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name2 = xmlPullParser.getName();
        while (true) {
            if (nextTag == 3 && name2.equals(name)) {
                return acpjVar;
            }
            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace)) {
                if (name2.equals("entry")) {
                    String name3 = xmlPullParser.getName();
                    int nextTag2 = xmlPullParser.nextTag();
                    String namespace2 = xmlPullParser.getNamespace();
                    String name4 = xmlPullParser.getName();
                    acoz acozVar = null;
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (true) {
                        if (nextTag2 == 3 && name4.equals(name3)) {
                            acpjVar.add(new acpi(str, str2, str3, acozVar));
                        } else {
                            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace2)) {
                                switch (name4.hashCode()) {
                                    case -615513399:
                                        if (name4.equals("modified")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case -220463842:
                                        if (name4.equals("purpose")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 116076:
                                        if (name4.equals(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case 1569093464:
                                        if (name4.equals("display-text")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                }
                                c = 65535;
                                if (c != 0) {
                                    if (c != 1) {
                                        if (c != 2) {
                                            if (c == 3) {
                                                acozVar = acoz.a(xmlPullParser);
                                            }
                                        } else {
                                            str3 = xmlPullParser.nextText();
                                        }
                                    } else {
                                        str2 = xmlPullParser.nextText();
                                    }
                                } else {
                                    str = xmlPullParser.nextText();
                                }
                            }
                            nextTag2 = xmlPullParser.nextTag();
                            namespace2 = xmlPullParser.getNamespace();
                            name4 = xmlPullParser.getName();
                        }
                    }
                } else if (acon.a()) {
                    adxb.e(xmlPullParser);
                }
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name2 = xmlPullParser.getName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlSerializer xmlSerializer, String str) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        acpg acpgVar = this.a;
        if (acpgVar != acpg.NONE && acpgVar != acpg.FULL) {
            xmlSerializer.attribute("", "state", acpgVar.e);
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            acpi acpiVar = (acpi) get(i);
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
            if (!acpiVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                xmlSerializer.text(acpiVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            }
            if (!acpiVar.b.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(acpiVar.b);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (!acpiVar.c.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "purpose");
                xmlSerializer.text(acpiVar.c);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "purpose");
            }
            acoz acozVar = acpiVar.d;
            if (acozVar != null) {
                acozVar.b(xmlSerializer, "modified");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof acpj)) {
            acpj acpjVar = (acpj) obj;
            if (this.a == acpjVar.a) {
                return super.equals(acpjVar);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
