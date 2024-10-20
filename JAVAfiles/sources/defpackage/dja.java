package defpackage;

import defpackage.dli;
import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dja {
    private final dli.a a;
    private final dqv b;
    private final drk c;
    private final diw d = new diw(null);

    public dja(dli.a aVar, dqv dqvVar, drk drkVar) {
        this.a = aVar;
        this.b = dqvVar;
        this.c = drkVar;
    }

    public static /* synthetic */ diy a(dja djaVar, String str, dje djeVar, int i, int i2, long j, int i3) {
        dje djeVar2;
        int i4;
        boolean z;
        int i5;
        long j2;
        if ((i3 & 2) != 0) {
            djeVar2 = dje.a;
        } else {
            djeVar2 = djeVar;
        }
        int i6 = 1;
        if ((i3 & 4) != 0) {
            i4 = 1;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i7 = Integer.MAX_VALUE;
        if ((i3 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            j2 = dqt.l(0, 0, 15);
        } else {
            j2 = j;
        }
        long j3 = j2;
        dix dixVar = new dix(new dhv(str), djeVar2, arnv.a, i5, z, i4, djaVar.b, djaVar.c, djaVar.a, j3);
        diy diyVar = (diy) djaVar.d.a.b(new dhx(dixVar));
        if (diyVar == null || diyVar.b.a.c()) {
            diyVar = null;
        }
        if (diyVar != null) {
            return diyVar.o(dixVar, dqt.e(j3, (dii.a(diyVar.b.c) << 32) | (4294967295L & dii.a(diyVar.b.d))));
        }
        dhv dhvVar = dixVar.a;
        dje djeVar3 = dixVar.b;
        drk drkVar = dixVar.h;
        dic dicVar = new dic(dhvVar, djf.a(djeVar3, drkVar), dixVar.c, dixVar.g, dixVar.i);
        long j4 = dixVar.j;
        boolean z2 = dixVar.e;
        if ((z2 || a.bw(dixVar.f)) && dqs.h(j4)) {
            i7 = dqs.b(j4);
        }
        int i8 = i7;
        if (z2 || !a.bw(dixVar.f)) {
            i6 = dixVar.d;
        }
        int d = dqs.d(j4);
        if (d != i8) {
            i8 = arrn.u(dii.a(dicVar.a()), d, i8);
        }
        diy diyVar2 = new diy(dixVar, new dia(dicVar, dqs.a.b(0, i8, 0, dqs.a(dixVar.j)), i6, dixVar.f), dqt.e(dixVar.j, (4294967295L & ((int) Math.ceil(r3.d))) | (((int) Math.ceil(r3.c)) << 32)));
        djaVar.d.a.c(new dhx(dixVar), diyVar2);
        return diyVar2;
    }
}
