package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
class aljh<K, V> extends alna implements Serializable {
    private static final long serialVersionUID = 1;
    final aljl b;
    final aljl c;
    final algj d;
    final algj e;
    final long f;
    final long g;
    final long h;
    final int i;
    final alhz j;
    transient alib k;
    final alif l;
    final alie m;
    final asqc n;

    public aljh(alkd alkdVar) {
        aljl aljlVar = alkdVar.j;
        aljl aljlVar2 = alkdVar.k;
        algj algjVar = alkdVar.h;
        algj algjVar2 = alkdVar.i;
        long j = alkdVar.n;
        long j2 = alkdVar.m;
        long j3 = alkdVar.l;
        alif alifVar = alkdVar.u;
        int i = alkdVar.g;
        alie alieVar = alkdVar.v;
        alhz alhzVar = alkdVar.p;
        asqc asqcVar = alkdVar.w;
        this.b = aljlVar;
        this.c = aljlVar2;
        this.d = algjVar;
        this.e = algjVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.l = alifVar;
        this.i = i;
        this.m = alieVar;
        this.j = (alhzVar == alhz.b || alhzVar == alig.b) ? null : alhzVar;
        this.n = asqcVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.k = b().a();
    }

    private Object readResolve() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alig b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        alig aligVar = new alig();
        aljl aljlVar = aligVar.g;
        boolean z14 = true;
        if (aljlVar == null) {
            z = true;
        } else {
            z = false;
        }
        albo.X(z, "Key strength was already set to %s", aljlVar);
        aljl aljlVar2 = this.b;
        aljlVar2.getClass();
        aligVar.g = aljlVar2;
        aljl aljlVar3 = aligVar.h;
        if (aljlVar3 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.X(z2, "Value strength was already set to %s", aljlVar3);
        aljl aljlVar4 = this.c;
        aljlVar4.getClass();
        aligVar.h = aljlVar4;
        algj algjVar = aligVar.k;
        if (algjVar == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.X(z3, "key equivalence was already set to %s", algjVar);
        algj algjVar2 = this.d;
        algjVar2.getClass();
        aligVar.k = algjVar2;
        algj algjVar3 = aligVar.l;
        if (algjVar3 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        albo.X(z4, "value equivalence was already set to %s", algjVar3);
        algj algjVar4 = this.e;
        algjVar4.getClass();
        aligVar.l = algjVar4;
        int i = aligVar.d;
        if (i == -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        albo.V(z5, "concurrency level was already set to %s", i);
        int i2 = this.i;
        if (i2 > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        d.s(z6);
        aligVar.d = i2;
        if (aligVar.p == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        albo.T(z7);
        alie alieVar = this.m;
        alieVar.getClass();
        aligVar.p = alieVar;
        aligVar.c = false;
        long j = this.f;
        if (j > 0) {
            aligVar.d(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.g;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = aligVar.j;
            if (j3 == -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            albo.W(z13, "expireAfterAccess was already set to %s ns", j3);
            albo.ac(true, j2, timeUnit);
            aligVar.j = timeUnit.toNanos(j2);
        }
        alif alifVar = this.l;
        if (alifVar != alif.a) {
            if (aligVar.o == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            albo.T(z8);
            if (aligVar.c) {
                long j4 = aligVar.e;
                if (j4 == -1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                albo.W(z12, "weigher can not be combined with maximum size (%s provided)", j4);
            }
            alifVar.getClass();
            aligVar.o = alifVar;
            long j5 = this.h;
            if (j5 != -1) {
                long j6 = aligVar.f;
                if (j6 == -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                albo.W(z9, "maximum weight was already set to %s", j6);
                long j7 = aligVar.e;
                if (j7 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                albo.W(z10, "maximum size was already set to %s", j7);
                if (j5 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d.t(z11, "maximum weight must not be negative");
                aligVar.f = j5;
            }
        } else {
            long j8 = this.h;
            if (j8 != -1) {
                aligVar.e(j8);
            }
        }
        alhz alhzVar = this.j;
        if (alhzVar != null) {
            if (aligVar.m != null) {
                z14 = false;
            }
            albo.T(z14);
            aligVar.m = alhzVar;
        }
        return aligVar;
    }

    @Override // defpackage.alna
    protected final /* synthetic */ Object gV() {
        return this.k;
    }
}
