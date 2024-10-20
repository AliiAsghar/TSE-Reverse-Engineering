package defpackage;

import defpackage.dhv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dij implements dhv.a {
    public final int a;
    public final int b;
    public final long c;
    public final dqo d;
    public final dim e;
    public final dqg f;
    public final int g;
    public final int h;
    public final dqp i;

    public dij(int i, int i2, long j, dqo dqoVar, dim dimVar, dqg dqgVar, int i3, int i4, dqp dqpVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = dqoVar;
        this.e = dimVar;
        this.f = dqgVar;
        this.g = i3;
        this.h = i4;
        this.i = dqpVar;
        if (!a.bB(j, drm.a) && drm.a(j) < brg.a) {
            doz.c("lineHeight can't be negative (" + drm.a(j) + ')');
        }
    }

    public final dij a(dij dijVar) {
        if (dijVar == null) {
            return this;
        }
        return dik.a(this, dijVar.a, dijVar.b, dijVar.c, dijVar.d, dijVar.e, dijVar.f, dijVar.g, dijVar.h, dijVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dij)) {
            return false;
        }
        dij dijVar = (dij) obj;
        if (a.bA(this.a, dijVar.a) && a.bA(this.b, dijVar.b) && a.bB(this.c, dijVar.c) && d.F(this.d, dijVar.d) && d.F(this.e, dijVar.e) && d.F(this.f, dijVar.f) && a.bA(this.g, dijVar.g) && a.bA(this.h, dijVar.h) && d.F(this.i, dijVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        long j = drm.a;
        dqo dqoVar = this.d;
        int i4 = 0;
        if (dqoVar != null) {
            i = dqoVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = this.a;
        int i6 = this.b;
        long j2 = this.c;
        dim dimVar = this.e;
        if (dimVar != null) {
            i2 = dimVar.hashCode();
        } else {
            i2 = 0;
        }
        int A = (((((i5 * 31) + i6) * 31) + a.A(j2)) * 31) + i;
        dqg dqgVar = this.f;
        if (dqgVar != null) {
            i3 = dqgVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = ((((((((A * 31) + i2) * 31) + i3) * 31) + this.g) * 31) + this.h) * 31;
        dqp dqpVar = this.i;
        if (dqpVar != null) {
            i4 = dqpVar.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) dqi.a(this.a)) + ", textDirection=" + ((Object) dqk.a(this.b)) + ", lineHeight=" + ((Object) drm.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) dqe.a(this.g)) + ", hyphens=" + ((Object) dqd.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
