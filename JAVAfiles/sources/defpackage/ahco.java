package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahco {
    public final aozq a;
    public final Object b;

    public ahco(aozq aozqVar, Object obj) {
        boolean z = false;
        if (aozqVar.a() >= 200000000 && aozqVar.a() < 300000000) {
            z = true;
        }
        d.s(z);
        this.a = aozqVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahco) {
            ahco ahcoVar = (ahco) obj;
            if (this.a.equals(ahcoVar.a) && this.b.equals(ahcoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
