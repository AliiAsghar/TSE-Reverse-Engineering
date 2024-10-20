package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcr {
    public final aozq a;
    public final Object b;

    public ahcr(aozq aozqVar, Object obj) {
        this.a = aozqVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahcr) {
            ahcr ahcrVar = (ahcr) obj;
            if (this.a.equals(ahcrVar.a) && this.b.equals(ahcrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
