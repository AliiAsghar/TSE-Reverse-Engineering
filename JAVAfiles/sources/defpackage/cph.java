package defpackage;

import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cph {
    public static final void a(cou couVar, cpd cpdVar) {
        int size = cpdVar.j.size();
        for (int i = 0; i < size; i++) {
            cpf cpfVar = (cpf) cpdVar.j.get(i);
            if (cpfVar instanceof cpi) {
                cox coxVar = new cox();
                cpi cpiVar = (cpi) cpfVar;
                coxVar.c = cpiVar.b;
                coxVar.m = true;
                coxVar.f();
                coxVar.p.m(cpiVar.c);
                coxVar.f();
                String str = cpiVar.a;
                coxVar.f();
                coxVar.a = cpiVar.d;
                coxVar.f();
                coxVar.b = cpiVar.e;
                coxVar.f();
                coxVar.f = cpiVar.f;
                coxVar.f();
                coxVar.d = cpiVar.g;
                coxVar.f();
                coxVar.e = cpiVar.h;
                coxVar.n = true;
                coxVar.f();
                coxVar.g = cpiVar.i;
                coxVar.n = true;
                coxVar.f();
                coxVar.h = cpiVar.j;
                coxVar.n = true;
                coxVar.f();
                coxVar.i = cpiVar.k;
                coxVar.n = true;
                coxVar.f();
                coxVar.j = cpiVar.l;
                coxVar.o = true;
                coxVar.f();
                coxVar.k = cpiVar.m;
                coxVar.o = true;
                coxVar.f();
                coxVar.l = cpiVar.n;
                coxVar.o = true;
                coxVar.f();
                couVar.c(i, coxVar);
            } else if (cpfVar instanceof cpd) {
                cou couVar2 = new cou();
                cpd cpdVar2 = (cpd) cpfVar;
                couVar2.f = cpdVar2.a;
                couVar2.f();
                couVar2.g = cpdVar2.b;
                couVar2.n = true;
                couVar2.f();
                couVar2.j = cpdVar2.e;
                couVar2.n = true;
                couVar2.f();
                couVar2.k = cpdVar2.f;
                couVar2.n = true;
                couVar2.f();
                couVar2.l = cpdVar2.g;
                couVar2.n = true;
                couVar2.f();
                couVar2.m = cpdVar2.h;
                couVar2.n = true;
                couVar2.f();
                couVar2.h = cpdVar2.c;
                couVar2.n = true;
                couVar2.f();
                couVar2.i = cpdVar2.d;
                couVar2.n = true;
                couVar2.f();
                couVar2.c = cpdVar2.i;
                couVar2.d = true;
                couVar2.f();
                a(couVar2, cpdVar2);
                couVar.c(i, couVar2);
            }
        }
    }

    public static final cpg b(cov covVar, bwj bwjVar) {
        ckl cklVar;
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        float ec = dqvVar.ec();
        boolean F = bwjVar.F((Float.floatToRawIntBits(covVar.l) << 32) | (Float.floatToRawIntBits(ec) & 4294967295L));
        Object h = bwjVar.h();
        if (F || h == bwj.a.a) {
            cou couVar = new cou();
            a(couVar, covVar.h);
            float f = covVar.d;
            float f2 = covVar.e;
            float em = dqvVar.em(f);
            float em2 = dqvVar.em(f2);
            long floatToRawIntBits = Float.floatToRawIntBits(em);
            long floatToRawIntBits2 = Float.floatToRawIntBits(em2);
            float f3 = covVar.f;
            float f4 = covVar.g;
            long j = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            if (Float.isNaN(f3)) {
                f3 = Float.intBitsToFloat((int) (j >> 32));
            }
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits3 = Float.floatToRawIntBits(f3) << 32;
            long floatToRawIntBits4 = Float.floatToRawIntBits(f4) & 4294967295L;
            cpg cpgVar = new cpg(couVar);
            String str = covVar.c;
            long j2 = covVar.i;
            int i = covVar.j;
            if (j2 != 16) {
                cklVar = new ckl(j2, i);
            } else {
                cklVar = null;
            }
            boolean z = covVar.k;
            cpgVar.a.h(new cjt(j));
            cpgVar.b.h(Boolean.valueOf(z));
            cpgVar.c.e.h(cklVar);
            cpgVar.c.f.h(new cjt(floatToRawIntBits3 | floatToRawIntBits4));
            cpgVar.c.b = str;
            bwjVar.B(cpgVar);
            h = cpgVar;
        }
        return (cpg) h;
    }
}
