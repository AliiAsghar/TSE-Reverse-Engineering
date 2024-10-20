package defpackage;

import defpackage.cfq;
import defpackage.cfr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buc implements bth {
    private final cfq.b a;
    private final int b = 0;

    public buc(cfq.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.bth
    public final int a(drg drgVar, long j, int i, drk drkVar) {
        if (i >= dri.b(j)) {
            int i2 = cfq.a;
            return cfq.a.n.a(i, dri.b(j), drkVar);
        }
        cfq.b bVar = this.a;
        int b = dri.b(j);
        return arrn.u(Math.round(((b - i) / 2.0f) * (((cfr.a) bVar).a + 1.0f)), 0, dri.b(j) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buc)) {
            return false;
        }
        buc bucVar = (buc) obj;
        if (!d.F(this.a, bucVar.a)) {
            return false;
        }
        int i = bucVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
