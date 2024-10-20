package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhx {
    private final dix a;

    public dhx(dix dixVar) {
        this.a = dixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhx)) {
            return false;
        }
        dix dixVar = this.a;
        dhx dhxVar = (dhx) obj;
        if (d.F(dixVar.a, dhxVar.a.a) && dixVar.b.x(dhxVar.a.b) && d.F(dixVar.c, dhxVar.a.c)) {
            int i = dixVar.d;
            dix dixVar2 = dhxVar.a;
            if (i == dixVar2.d && dixVar.e == dixVar2.e && a.bA(dixVar.f, dixVar2.f) && d.F(dixVar.g, dixVar2.g)) {
                drk drkVar = dixVar.h;
                dix dixVar3 = dhxVar.a;
                if (drkVar == dixVar3.h && dixVar.i == dixVar3.i) {
                    long j = dixVar.j;
                    long j2 = dixVar3.j;
                    if (dqs.b(j) == dqs.b(j2)) {
                        if (dqs.a(j) == dqs.a(j2)) {
                            return true;
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        dix dixVar = this.a;
        int hashCode = dixVar.a.hashCode() * 31;
        dje djeVar = dixVar.b;
        dip dipVar = djeVar.b;
        long j = dipVar.b;
        dlx dlxVar = dipVar.c;
        int i10 = 0;
        if (dlxVar != null) {
            i = dlxVar.h;
        } else {
            i = 0;
        }
        int A = ((a.A(j) * 31) + i) * 31;
        dls dlsVar = dipVar.d;
        if (dlsVar != null) {
            i2 = dlsVar.a;
        } else {
            i2 = 0;
        }
        int i11 = (A + i2) * 31;
        dlt dltVar = dipVar.e;
        if (dltVar != null) {
            i3 = dltVar.a;
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        dli dliVar = dipVar.f;
        if (dliVar != null) {
            i4 = dliVar.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str = dipVar.g;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int A2 = (((i13 + i5) * 31) + a.A(dipVar.h)) * 31;
        dqa dqaVar = dipVar.i;
        if (dqaVar != null) {
            i6 = Float.floatToIntBits(dqaVar.a);
        } else {
            i6 = 0;
        }
        int i14 = (A2 + i6) * 31;
        dqn dqnVar = dipVar.j;
        if (dqnVar != null) {
            i7 = dqnVar.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        dpc dpcVar = dipVar.k;
        if (dpcVar != null) {
            i8 = dpcVar.hashCode();
        } else {
            i8 = 0;
        }
        int A3 = (((i15 + i8) * 31) + a.A(dipVar.l)) * 31;
        din dinVar = dipVar.o;
        if (dinVar != null) {
            i9 = dinVar.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((A3 + i9) * 31) + djeVar.c.hashCode()) * 31;
        dio dioVar = djeVar.d;
        if (dioVar != null) {
            i10 = dioVar.hashCode();
        }
        int hashCode3 = (((((((((((((((hashCode + hashCode2 + i10) * 31) + dixVar.c.hashCode()) * 31) + dixVar.d) * 31) + a.v(dixVar.e)) * 31) + dixVar.f) * 31) + dixVar.g.hashCode()) * 31) + dixVar.h.hashCode()) * 31) + dixVar.i.hashCode()) * 31;
        long j2 = dixVar.j;
        return ((hashCode3 + dqs.b(j2)) * 31) + dqs.a(j2);
    }
}
