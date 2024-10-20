package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acop {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public acpl d = new acpl(acpg.NONE);
    public acpj e = new acpj(acpg.NONE);
    public acpe f = new acpe(acpg.NONE);
    public final String g;
    public final acpg h;
    public int i;

    public acop(acpg acpgVar, String str, int i) {
        this.h = acpgVar;
        this.g = str;
        this.i = i;
    }

    public static acop a(XmlPullParser xmlPullParser) {
        return b(xmlPullParser, "conference-info");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x016e, code lost:
    
        if (r8 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0170, code lost:
    
        r0 = "participant";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017a, code lost:
    
        throw new java.lang.IllegalStateException("subject-ext is missing ".concat(r0));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00fd. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.acop b(org.xmlpull.v1.XmlPullParser r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 2936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acop.b(org.xmlpull.v1.XmlPullParser, java.lang.String):acop");
    }

    public final void c() {
        acpl acplVar = this.d;
        if (!acplVar.isEmpty()) {
            Iterator it = acplVar.iterator();
            while (it.hasNext()) {
                acpk acpkVar = (acpk) it.next();
                if (!acpkVar.g() || !acpkVar.h()) {
                    it.remove();
                }
                acoy acoyVar = acoy.PENDING;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(XmlSerializer xmlSerializer, String str) {
        String str2;
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        String str3 = this.g;
        if (str3 != null) {
            xmlSerializer.attribute("", "entity", str3);
        }
        if (this.h != acpg.NONE) {
            xmlSerializer.attribute("", "state", this.h.e);
        }
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, Integer.toString(this.i));
        if (!this.a.isPresent()) {
            str2 = "entity";
        } else {
            Object obj = this.a.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
            acom acomVar = (acom) obj;
            if (!acomVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(acomVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (acomVar.b.isPresent() && !((String) acomVar.b.get()).isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject");
                xmlSerializer.text((String) acomVar.b.get());
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject");
            }
            if (!acomVar.c.isPresent()) {
                str2 = "entity";
            } else {
                Object obj2 = acomVar.c.get();
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "participant");
                acph acphVar = (acph) obj2;
                str2 = "entity";
                xmlSerializer.text(acphVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "participant");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                Optional optional = acphVar.b;
                if (optional.isPresent()) {
                    xmlSerializer.text(((advi) optional.get()).toString());
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
            }
            if (!acomVar.d.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "free-text");
                xmlSerializer.text(acomVar.d);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "free-text");
            }
            if (!acomVar.e.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "keywords");
                xmlSerializer.text(acomVar.e);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "keywords");
            }
            if (!acomVar.f.isEmpty()) {
                acpj acpjVar = acomVar.f;
                if (acpjVar.a != acpg.NONE) {
                    acpjVar.b(xmlSerializer, "conf-uris");
                }
            }
            if (!acomVar.g.isEmpty()) {
                acpj acpjVar2 = acomVar.g;
                if (acpjVar2.a != acpg.NONE) {
                    acpjVar2.b(xmlSerializer, "service-uris");
                }
            }
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            xmlSerializer.text(Integer.toString(acomVar.h));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            if (!acomVar.i.isEmpty()) {
                acor acorVar = acomVar.i;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "available-media");
                int size = acorVar.size();
                int i = 0;
                while (i < size) {
                    acoq acoqVar = (acoq) acorVar.get(i);
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                    if (!acoqVar.d.isEmpty()) {
                        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, acoqVar.d);
                    }
                    if (!acoqVar.a.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        xmlSerializer.text(acoqVar.a);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    }
                    if (!acoqVar.b.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                        xmlSerializer.text(acoqVar.b);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                    }
                    acor acorVar2 = acorVar;
                    if (acoqVar.c != acpd.NONE) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                        xmlSerializer.text(acoqVar.c.f);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                    i++;
                    acorVar = acorVar2;
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "available-media");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
        }
        if (this.b.isPresent()) {
            Object obj3 = this.b.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "host-info");
            acpa acpaVar = (acpa) obj3;
            if (!acpaVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(acpaVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (!acpaVar.b.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "web-page");
                xmlSerializer.text(acpaVar.b);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "web-page");
            }
            acpaVar.c.b(xmlSerializer, "uris");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "host-info");
        }
        if (this.c.isPresent()) {
            Object obj4 = this.c.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            acos acosVar = (acos) obj4;
            xmlSerializer.text(Integer.toString(acosVar.a));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.text(acos.a(acosVar.b));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.text(acos.a(acosVar.c));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
        }
        if (!this.d.isEmpty()) {
            acpl acplVar = this.d;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "users");
            acpg acpgVar = acplVar.a;
            if (acpgVar != acpg.NONE && acpgVar != acpg.FULL) {
                xmlSerializer.attribute("", "state", acpgVar.e);
            }
            int size2 = acplVar.size();
            int i2 = 0;
            while (i2 < size2) {
                acpk acpkVar = (acpk) acplVar.get(i2);
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user");
                String str4 = acpkVar.g;
                acpl acplVar2 = acplVar;
                String str5 = str2;
                if (str4 != null) {
                    xmlSerializer.attribute("", str5, str4);
                }
                acpg acpgVar2 = acpkVar.h;
                int i3 = size2;
                if (acpgVar2 != acpg.NONE) {
                    xmlSerializer.attribute("", "state", acpgVar2.e);
                }
                if (acpkVar.i) {
                    xmlSerializer.attribute("", "yourown", "true");
                }
                if (acpkVar.j) {
                    xmlSerializer.attribute("", "joined", "true");
                }
                if (acpkVar.a != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    xmlSerializer.text(acpkVar.a);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                }
                if (!acpkVar.b.isEmpty()) {
                    acpkVar.b.b(xmlSerializer, "associated-aors");
                }
                if (!acpkVar.c.isEmpty()) {
                    acpm acpmVar = acpkVar.c;
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "roles");
                    int size3 = acpmVar.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        acpm acpmVar2 = acpmVar;
                        String str6 = (String) acpmVar.get(i4);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        xmlSerializer.text(str6);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        i4++;
                        acpmVar = acpmVar2;
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "roles");
                }
                if (acpkVar.d != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "languages");
                    xmlSerializer.text(acpkVar.d);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "languages");
                }
                if (acpkVar.e != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                    xmlSerializer.text(acpkVar.e);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                }
                if (!acpkVar.f.isEmpty()) {
                    int i5 = 0;
                    while (i5 < acpkVar.f.size()) {
                        acox acoxVar = (acox) acpkVar.f.get(i5);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        String str7 = acoxVar.j;
                        if (str7 != null) {
                            xmlSerializer.attribute("", str5, str7);
                        }
                        acpg acpgVar3 = acoxVar.k;
                        String str8 = str5;
                        if (acpgVar3 != acpg.NONE && acpgVar3 != acpg.FULL) {
                            xmlSerializer.attribute("", "state", acpgVar3.e);
                        }
                        String str9 = acoxVar.a;
                        if (str9 != null) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            xmlSerializer.text(str9);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        }
                        if (acoxVar.b.isPresent()) {
                            ((acoz) acoxVar.b.get()).b(xmlSerializer, "referred");
                        }
                        if (acoxVar.c != acoy.NONE) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                            xmlSerializer.text(acoxVar.c.k);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                        }
                        if (acoxVar.d != acpb.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                            xmlSerializer.text(acoxVar.d.e);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                        }
                        if (acoxVar.e.isPresent()) {
                            ((acoz) acoxVar.e.get()).b(xmlSerializer, "joining-info");
                        }
                        if (acoxVar.f != acow.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                            xmlSerializer.text(acoxVar.f.f);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                        }
                        if (acoxVar.g.isPresent()) {
                            ((acoz) acoxVar.g.get()).b(xmlSerializer, "disconnection-info");
                        }
                        Iterator it = acoxVar.h.iterator();
                        while (it.hasNext()) {
                            acpc acpcVar = (acpc) it.next();
                            Iterator it2 = it;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "media");
                            acpk acpkVar2 = acpkVar;
                            xmlSerializer.attribute("", "id", acpcVar.a);
                            if (acpcVar.b != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(acpcVar.b);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            if (acpcVar.c != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                                xmlSerializer.text(acpcVar.c);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                            }
                            if (acpcVar.d != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                                xmlSerializer.text(acpcVar.d);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                            }
                            if (acpcVar.e != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                                xmlSerializer.text(acpcVar.e);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                            }
                            if (acpcVar.f != acpd.NONE) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                                xmlSerializer.text(acpcVar.f.f);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "media");
                            it = it2;
                            acpkVar = acpkVar2;
                        }
                        acpk acpkVar3 = acpkVar;
                        if (acoxVar.i.isPresent()) {
                            Object obj5 = acoxVar.i.get();
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                            acpf acpfVar = ((acol) obj5).a;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            if (!acpfVar.a.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(acpfVar.a);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            if (!acpfVar.b.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                                xmlSerializer.text(acpfVar.b);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                            }
                            if (!acpfVar.c.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                                xmlSerializer.text(acpfVar.c);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                            }
                            if (!acpfVar.d.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                                xmlSerializer.text(acpfVar.d);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                        }
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        i5++;
                        str5 = str8;
                        acpkVar = acpkVar3;
                    }
                }
                String str10 = str5;
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user");
                i2++;
                size2 = i3;
                acplVar = acplVar2;
                str2 = str10;
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "users");
        }
        if (!this.e.isEmpty()) {
            this.e.b(xmlSerializer, "sidebars-by-ref");
        }
        if (!this.f.isEmpty()) {
            acpe acpeVar = this.f;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
            acpg acpgVar4 = acpeVar.a;
            if (acpgVar4 != acpg.NONE && acpgVar4 != acpg.FULL) {
                xmlSerializer.attribute("", "state", acpgVar4.toString());
            }
            if (!acpeVar.isEmpty()) {
                int size4 = acpeVar.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    ((acop) acpeVar.get(i6)).d(xmlSerializer, "entry");
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        acpl acplVar = this.d;
        int size = acplVar.size();
        for (int i = 0; i < size; i++) {
            ((acpk) acplVar.get(i)).f();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof acop)) {
            return false;
        }
        acop acopVar = (acop) obj;
        if (!TextUtils.equals(this.g, acopVar.g) || this.i != acopVar.i || this.h != acopVar.h || !this.a.equals(acopVar.a) || !this.c.equals(acopVar.c) || !this.b.equals(acopVar.b) || !this.e.equals(acopVar.e) || !this.f.equals(acopVar.f) || !this.d.equals(acopVar.d)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(acop acopVar, yjr yjrVar) {
        if (this.d.isEmpty() && this.d.a == acpg.NONE) {
            this.d = acopVar.d;
            e();
            return;
        }
        acpl acplVar = this.d;
        acpl acplVar2 = acopVar.d;
        if (acplVar2.b()) {
            acpg acpgVar = acplVar2.a;
            if (acpgVar == acpg.FULL) {
                int size = acplVar.size();
                for (int i = 0; i < size; i++) {
                    acpk acpkVar = (acpk) acplVar.get(i);
                    Optional a = acplVar2.a(acpkVar.g, yjrVar);
                    if (a.isPresent()) {
                        acpkVar.d((acpk) a.get(), yjrVar);
                    } else {
                        acpkVar.c();
                    }
                }
                int size2 = acplVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    acpk acpkVar2 = (acpk) acplVar2.get(i2);
                    if (acpkVar2.h() && acpkVar2.g() && !acplVar.a(acpkVar2.g, yjrVar).isPresent()) {
                        acplVar.add(acpkVar2);
                        acpkVar2.f();
                    }
                }
                return;
            }
            if (acpgVar == acpg.PARTIAL || acpgVar == acpg.DELETED) {
                int size3 = acplVar2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    acpk acpkVar3 = (acpk) acplVar2.get(i3);
                    if (!acpkVar3.h()) {
                        advr.g("Skipping invalid user during partial update: %s", acpkVar3);
                    } else {
                        Optional a2 = acplVar.a(acpkVar3.g, yjrVar);
                        if (a2.isEmpty()) {
                            acplVar.add(acpkVar3);
                            acpkVar3.f();
                        } else {
                            ((acpk) a2.get()).d(acpkVar3, yjrVar);
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Integer.valueOf(this.i), this.h, this.a, this.c, this.b, this.e, this.d});
    }

    public final String toString() {
        return "Entity: " + advq.USER_ID.c(this.g) + ", version: " + this.i + ", state: " + String.valueOf(this.h) + ", host info: " + String.valueOf(this.b) + ", users: " + String.valueOf(this.d) + ", conference state: " + String.valueOf(this.c) + ", conference description: " + String.valueOf(this.a);
    }
}
