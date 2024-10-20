package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxx {
    public final String a;
    public final String b;
    public final Optional c;
    public final String d;
    public final Optional e;
    private final Optional f;
    private final Optional g;

    public pxx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxx) {
            pxx pxxVar = (pxx) obj;
            if (this.a.equals(pxxVar.a) && this.b.equals(pxxVar.b) && this.f.equals(pxxVar.f) && this.c.equals(pxxVar.c) && this.d.equals(pxxVar.d) && this.g.equals(pxxVar.g) && this.e.equals(pxxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.g;
        Optional optional3 = this.c;
        return "WwwAuthenticateHeader{schema=" + this.a + ", realm=" + this.b + ", domain=" + String.valueOf(this.f) + ", qop=" + String.valueOf(optional3) + ", nonce=" + this.d + ", stale=" + String.valueOf(optional2) + ", opaque=" + String.valueOf(optional) + "}";
    }

    public pxx(String str, String str2, Optional optional, Optional optional2, String str3, Optional optional3, Optional optional4) {
        this.a = str;
        this.b = str2;
        this.f = optional;
        this.c = optional2;
        this.d = str3;
        this.g = optional3;
        this.e = optional4;
    }
}
