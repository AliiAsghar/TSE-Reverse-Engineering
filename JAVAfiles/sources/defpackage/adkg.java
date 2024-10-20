package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Optional h;

    public adkg() {
        throw null;
    }

    public static adkf a() {
        adkf adkfVar = new adkf(null);
        adkfVar.d = "";
        adkfVar.c("");
        adkfVar.d("");
        adkfVar.a = "";
        adkfVar.b = "";
        adkfVar.b("");
        adkfVar.e = Optional.empty();
        String uuid = UUID.randomUUID().toString();
        if (uuid != null) {
            adkfVar.c = uuid;
            return adkfVar;
        }
        throw new NullPointerException("Null salt");
    }

    public static String b(String str, String str2) {
        return anhx.a.c(String.valueOf(str).concat(String.valueOf(str2)), StandardCharsets.UTF_8).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adkg) {
            adkg adkgVar = (adkg) obj;
            if (this.a.equals(adkgVar.a) && this.b.equals(adkgVar.b) && this.c.equals(adkgVar.c) && this.d.equals(adkgVar.d) && this.e.equals(adkgVar.e) && this.f.equals(adkgVar.f) && this.g.equals(adkgVar.g) && this.h.equals(adkgVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "DroidGuardContentBinding{imsi=" + this.a + ", msisdn=" + this.b + ", msisdnToken=" + this.c + ", gmsCoreIidToken=" + this.d + ", cookie=" + this.e + ", salt=" + this.f + ", imei=" + this.g + ", provisioningSessionId=" + String.valueOf(this.h) + "}";
    }

    public adkg(String str, String str2, String str3, String str4, String str5, String str6, String str7, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = optional;
    }
}
