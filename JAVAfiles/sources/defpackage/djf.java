package defpackage;

import defpackage.dpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djf {
    public static final dje a(dje djeVar, drk drkVar) {
        long j;
        int i;
        int i2;
        float f;
        String str;
        int i3;
        int i4;
        int i5;
        dip dipVar = djeVar.b;
        dqm e = dipVar.a.e(diq.a);
        if (drm.b(dipVar.b) == 0) {
            j = dir.a;
        } else {
            j = dipVar.b;
        }
        long j2 = j;
        dlx dlxVar = dipVar.c;
        if (dlxVar == null) {
            dlxVar = dlx.e;
        }
        dlx dlxVar2 = dlxVar;
        dls dlsVar = dipVar.d;
        if (dlsVar != null) {
            i = dlsVar.a;
        } else {
            i = 0;
        }
        dls dlsVar2 = new dls(i);
        dlt dltVar = dipVar.e;
        if (dltVar != null) {
            i2 = dltVar.a;
        } else {
            i2 = 65535;
        }
        dlt dltVar2 = new dlt(i2);
        dli dliVar = dipVar.f;
        if (dliVar == null) {
            dliVar = dli.a;
        }
        dli dliVar2 = dliVar;
        String str2 = dipVar.g;
        long j3 = dipVar.h;
        if (drm.b(j3) == 0) {
            j3 = dir.b;
        }
        long j4 = j3;
        dqa dqaVar = dipVar.i;
        if (dqaVar != null) {
            f = dqaVar.a;
        } else {
            f = brg.a;
        }
        dqa dqaVar2 = new dqa(f);
        dqn dqnVar = dipVar.j;
        if (dqnVar == null) {
            dqnVar = dqn.a;
        }
        dqn dqnVar2 = dqnVar;
        dpc dpcVar = dipVar.k;
        if (dpcVar == null) {
            dpc dpcVar2 = dpc.a;
            dpcVar = dpc.a.a();
        }
        dpc dpcVar3 = dpcVar;
        long j5 = dipVar.l;
        if (j5 == 16) {
            j5 = dir.c;
        }
        long j6 = j5;
        dqj dqjVar = dipVar.m;
        if (dqjVar == null) {
            dqjVar = dqj.a;
        }
        dqj dqjVar2 = dqjVar;
        cma cmaVar = dipVar.n;
        if (cmaVar == null) {
            cmaVar = cma.a;
        }
        cma cmaVar2 = cmaVar;
        din dinVar = dipVar.o;
        cnz cnzVar = dipVar.p;
        if (cnzVar == null) {
            cnzVar = coc.a;
        }
        cnz cnzVar2 = cnzVar;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        dip dipVar2 = new dip(e, j2, dlxVar2, dlsVar2, dltVar2, dliVar2, str, j4, dqaVar2, dqnVar2, dpcVar3, j6, dqjVar2, cmaVar2, dinVar, cnzVar2);
        dij dijVar = djeVar.c;
        if (a.bA(dijVar.a, Integer.MIN_VALUE)) {
            i3 = 5;
        } else {
            i3 = dijVar.a;
        }
        int i6 = dijVar.b;
        if (a.bA(i6, 3)) {
            drk drkVar2 = drk.a;
            int ordinal = drkVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i4 = 5;
                } else {
                    throw new armm();
                }
            } else {
                i6 = 4;
                i4 = i6;
            }
        } else {
            if (a.bA(i6, Integer.MIN_VALUE)) {
                drk drkVar3 = drk.a;
                int ordinal2 = drkVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        i6 = 2;
                    } else {
                        throw new armm();
                    }
                } else {
                    i4 = 1;
                }
            }
            i4 = i6;
        }
        long j7 = dijVar.c;
        if (drm.b(j7) == 0) {
            j7 = dik.a;
        }
        dqo dqoVar = dijVar.d;
        if (dqoVar == null) {
            dqoVar = dqo.a;
        }
        dim dimVar = dijVar.e;
        dqg dqgVar = dijVar.f;
        int i7 = dijVar.g;
        if (true == a.bA(i7, 0)) {
            i7 = 66305;
        }
        int i8 = i7;
        int i9 = dijVar.h;
        boolean bA = a.bA(i9, Integer.MIN_VALUE);
        dqp dqpVar = dijVar.i;
        if (dqpVar == null) {
            dqpVar = dqp.a;
        }
        dqp dqpVar2 = dqpVar;
        if (true == bA) {
            i5 = 1;
        } else {
            i5 = i9;
        }
        return new dje(dipVar2, new dij(i3, i4, j7, dqoVar, dimVar, dqgVar, i8, i5, dqpVar2), djeVar.d);
    }
}
