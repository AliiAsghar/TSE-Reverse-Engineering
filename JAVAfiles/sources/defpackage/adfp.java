package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfp {
    public final Optional a;
    public final String b;
    public final apfs c;
    public final ailh d;
    public final int e;
    public final String f;
    public final Optional g;
    public final alpt h;

    public adfp() {
        throw null;
    }

    public static ajqc a() {
        ajqc ajqcVar = new ajqc(null, null);
        ajqcVar.o(altg.a);
        return ajqcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfp) {
            adfp adfpVar = (adfp) obj;
            if (this.a.equals(adfpVar.a) && this.b.equals(adfpVar.b) && this.c.equals(adfpVar.c) && this.d.equals(adfpVar.d) && this.e == adfpVar.e && this.f.equals(adfpVar.f) && this.g.equals(adfpVar.g) && this.h.equals(adfpVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        alpt alptVar = this.h;
        Optional optional = this.g;
        ailh ailhVar = this.d;
        apfs apfsVar = this.c;
        return "RegistrationContext{publicGruu=" + String.valueOf(this.a) + ", username=" + this.b + ", localIpAddress=" + String.valueOf(apfsVar) + ", proxyProtocol=" + String.valueOf(ailhVar) + ", listeningPort=" + this.e + ", instance=" + this.f + ", accessNetworkInfoHeader=" + String.valueOf(optional) + ", registeredFeatureTags=" + String.valueOf(alptVar) + "}";
    }

    public adfp(Optional optional, String str, apfs apfsVar, ailh ailhVar, int i, String str2, Optional optional2, alpt alptVar) {
        this.a = optional;
        this.b = str;
        this.c = apfsVar;
        this.d = ailhVar;
        this.e = i;
        this.f = str2;
        this.g = optional2;
        this.h = alptVar;
    }
}
