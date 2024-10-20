package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsk implements bti {
    private final cfq.c a;
    private final cfq.c b;
    private final int c;

    public bsk(cfq.c cVar, cfq.c cVar2, int i) {
        this.a = cVar;
        this.b = cVar2;
        this.c = i;
    }

    @Override // defpackage.bti
    public final int a(drg drgVar, long j, int i) {
        int a = this.b.a(0, drgVar.a());
        return drgVar.c + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsk)) {
            return false;
        }
        bsk bskVar = (bsk) obj;
        if (d.F(this.a, bskVar.a) && d.F(this.b, bskVar.b) && this.c == bskVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
