package defpackage;

import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsj implements bth {
    private final cfq.b a;
    private final cfq.b b;
    private final int c;

    public bsj(cfq.b bVar, cfq.b bVar2, int i) {
        this.a = bVar;
        this.b = bVar2;
        this.c = i;
    }

    @Override // defpackage.bth
    public final int a(drg drgVar, long j, int i, drk drkVar) {
        int i2;
        int a = this.b.a(0, drgVar.b(), drkVar);
        int i3 = -this.a.a(0, i, drkVar);
        if (drkVar == drk.a) {
            i2 = this.c;
        } else {
            i2 = -this.c;
        }
        return drgVar.b + a + i3 + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj)) {
            return false;
        }
        bsj bsjVar = (bsj) obj;
        if (d.F(this.a, bsjVar.a) && d.F(this.b, bsjVar.b) && this.c == bsjVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
