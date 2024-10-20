package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bud implements bti {
    private final cfq.c a;
    private final int b;

    public bud(cfq.c cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    @Override // defpackage.bti
    public final int a(drg drgVar, long j, int i) {
        int i2 = this.b;
        if (i >= dri.a(j) - (i2 + i2)) {
            int i3 = cfq.a;
            return cfq.a.k.a(i, dri.a(j));
        }
        cfq.c cVar = this.a;
        int a = dri.a(j);
        return arrn.u(cVar.a(i, a), i2, (dri.a(j) - i2) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bud)) {
            return false;
        }
        bud budVar = (bud) obj;
        if (d.F(this.a, budVar.a) && this.b == budVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Vertical(alignment=" + this.a + ", margin=" + this.b + ')';
    }
}
