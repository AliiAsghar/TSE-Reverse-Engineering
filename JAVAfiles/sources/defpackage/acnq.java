package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnq {
    public static final /* synthetic */ int a = 0;

    static {
        aczd.a(185025024);
    }

    public static adqu a(adrc adrcVar, String str, String str2, byte[] bArr, apwq apwqVar) {
        aijw aijwVar = adrcVar.l;
        if (adrcVar.F) {
            String str3 = aijwVar.g;
            String str4 = adrcVar.J;
            aifd b = b(str2, bArr, str, apwqVar, adrcVar.ak());
            if (str3 != null) {
                b.l(str3);
            }
            b.p("sip:anonymous@anonymous.invalid");
            return d(b, str);
        }
        String str5 = aijwVar.g;
        adrcVar.y();
        return c(str, str2, bArr, apwqVar, adrcVar.ak());
    }

    public static aifd b(String str, byte[] bArr, String str2, apwq apwqVar, boolean z) {
        String str3;
        aifd aifdVar = new aifd(str, "utf-8");
        aifdVar.m("DateTime", advi.a().toString());
        aifdVar.j(bArr);
        aifdVar.o("imdn", "urn:ietf:params:imdn");
        if (aczx.w() && z) {
            str3 = adrc.E + ", " + aiff.INTERWORKING_SMS.p;
        } else {
            str3 = adrc.E;
        }
        aifdVar.n("urn:ietf:params:imdn", "Disposition-Notification", str3);
        aifdVar.n("urn:ietf:params:imdn", "Message-ID", str2);
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(apwqVar.b).entrySet()) {
            String str4 = (String) entry.getKey();
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((apws) entry.getValue()).b).entrySet()) {
                aifdVar.n(str4, (String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return aifdVar;
    }

    public static adqu c(String str, String str2, byte[] bArr, apwq apwqVar, boolean z) {
        aifd b = b(str2, bArr, str, apwqVar, z);
        b.l("sip:anonymous@anonymous.invalid");
        b.p("sip:anonymous@anonymous.invalid");
        return d(b, str);
    }

    private static adqu d(aifd aifdVar, String str) {
        String i = aifdVar.i();
        i.getClass();
        adqu adquVar = new adqu(i, aifdVar);
        adquVar.k = str;
        String f = aifdVar.f();
        f.getClass();
        adquVar.c = f;
        return adquVar;
    }
}
