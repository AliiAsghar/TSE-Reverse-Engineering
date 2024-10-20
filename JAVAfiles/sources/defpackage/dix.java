package defpackage;

import defpackage.dli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dix {
    public final dhv a;
    public final dje b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final dqv g;
    public final drk h;
    public final dli.a i;
    public final long j;

    public dix(dhv dhvVar, dje djeVar, List list, int i, boolean z, int i2, dqv dqvVar, drk drkVar, dli.a aVar, long j) {
        this.a = dhvVar;
        this.b = djeVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = dqvVar;
        this.h = drkVar;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dix)) {
            return false;
        }
        dix dixVar = (dix) obj;
        if (d.F(this.a, dixVar.a) && d.F(this.b, dixVar.b) && d.F(this.c, dixVar.c) && this.d == dixVar.d && this.e == dixVar.e && a.bA(this.f, dixVar.f) && d.F(this.g, dixVar.g) && this.h == dixVar.h && d.F(this.i, dixVar.i) && a.bB(this.j, dixVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dqv dqvVar = this.g;
        return (((((((((((((hashCode * 31) + this.d) * 31) + a.v(this.e)) * 31) + this.f) * 31) + dqvVar.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a.A(this.j);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) dqq.a(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) dqs.e(this.j)) + ')';
    }
}
