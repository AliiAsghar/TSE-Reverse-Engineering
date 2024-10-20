package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tro {
    public final aqfn a;
    public final String b;
    public final Optional c;
    public final aqfn d;

    public tro(aqfn aqfnVar, String str, Optional optional) {
        aqfnVar.getClass();
        str.getClass();
        aozy builder = aqfnVar.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((aqfn) builder.b).c = str;
        apag s = builder.s();
        s.getClass();
        this.a = aqfnVar;
        this.b = str;
        this.c = optional;
        this.d = (aqfn) s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tro)) {
            return false;
        }
        tro troVar = (tro) obj;
        if (d.F(this.a, troVar.a) && d.F(this.b, troVar.b) && d.F(this.c, troVar.c) && d.F(this.d, troVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DittoIdContainer(tachyonId=" + this.a + ", desktopId=" + this.b + ", destinationRegistrationId=" + this.c + ", desktopIdAsTachyonId=" + this.d + ")";
    }
}
