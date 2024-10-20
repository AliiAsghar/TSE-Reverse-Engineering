package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admx {
    public final apkn a;
    public final String b;
    public final String c;
    public final String d;
    public final apig e;
    public final Optional f;
    public final int g;
    private final Optional h;

    public admx() {
        throw null;
    }

    public static admw a(apkn apknVar, Optional optional) {
        String str = (String) optional.map(new adkk(20)).orElse("unknown");
        admw admwVar = new admw(null);
        admwVar.g(apknVar);
        admwVar.c = 2;
        admwVar.f(UUID.randomUUID().toString());
        admwVar.e(str);
        admwVar.h(2);
        admwVar.d("");
        return admwVar;
    }

    public static String d(apic apicVar) {
        return TextUtils.join(",", apicVar.b);
    }

    public static admw e(int i) {
        String uuid = UUID.randomUUID().toString();
        admw admwVar = new admw(null);
        admwVar.g(apkn.RCS_PROVISIONING_UNKNOWN_STATE);
        admwVar.c = i;
        admwVar.f(uuid);
        admwVar.e(uuid);
        admwVar.h(2);
        admwVar.d("");
        return admwVar;
    }

    public final alor b() {
        alok alokVar = new alok();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(this.e.f), new lui(alokVar, 12));
        return alokVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c(String str) {
        apig apigVar = this.e;
        apic apicVar = apic.a;
        apbo apboVar = apigVar.f;
        if (apboVar.containsKey(str)) {
            apicVar = (apic) apboVar.get(str);
        }
        return d(apicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof admx) {
            admx admxVar = (admx) obj;
            if (this.a.equals(admxVar.a)) {
                int i = this.g;
                int i2 = admxVar.g;
                if (i != 0) {
                    if (i == i2 && this.b.equals(admxVar.b) && this.c.equals(admxVar.c) && this.d.equals(admxVar.d) && this.h.equals(admxVar.h) && this.e.equals(admxVar.e) && this.f.equals(admxVar.f)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.g;
        a.bm(i);
        return (((((((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        int i = this.g;
        if (i != 0) {
            str = appn.i(i);
        } else {
            str = "null";
        }
        Optional optional = this.h;
        apig apigVar = this.e;
        Optional optional2 = this.f;
        return "ProvisioningHttpRequest{requestState=" + valueOf + ", provisioningEngineWorker=" + str + ", requestId=" + this.b + ", provisioningSessionId=" + this.c + ", constructedServerUrl=" + this.d + ", requestPath=" + String.valueOf(optional) + ", httpRequestEvent=" + String.valueOf(apigVar) + ", droidGuardAttestation=" + String.valueOf(optional2) + "}";
    }

    public admx(apkn apknVar, int i, String str, String str2, String str3, Optional optional, apig apigVar, Optional optional2) {
        this.a = apknVar;
        this.g = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.h = optional;
        this.e = apigVar;
        this.f = optional2;
    }
}
