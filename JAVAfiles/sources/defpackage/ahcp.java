package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcp {
    public final aozq a;
    public final Object b;

    public ahcp(aozq aozqVar, Object obj) {
        boolean z = false;
        if (aozqVar.a() >= 100000000 && aozqVar.a() < 200000000) {
            z = true;
        }
        d.s(z);
        this.a = aozqVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahcp) {
            ahcp ahcpVar = (ahcp) obj;
            if (this.a.equals(ahcpVar.a) && this.b.equals(ahcpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
