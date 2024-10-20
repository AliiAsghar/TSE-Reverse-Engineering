package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoe extends acny {
    public acoe(adeo adeoVar, adtn adtnVar, amnn amnnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnnVar, anenVar, acnuVar);
    }

    public final void d(Context context, int i) {
        aozy createBuilder = apkd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apkd apkdVar = (apkd) apagVar;
        apkdVar.d = i - 1;
        apkdVar.b |= 2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apkd apkdVar2 = (apkd) createBuilder.b;
        apkdVar2.c = 3;
        apkdVar2.b |= 1;
        apkd apkdVar3 = (apkd) createBuilder.s();
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apkdVar3.getClass();
        apjhVar.d = apkdVar3;
        apjhVar.c = 10;
        super.u(context, (apjh) A.s());
    }

    public final void e(Context context, apkb apkbVar) {
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apkbVar.getClass();
        apjhVar.d = apkbVar;
        apjhVar.c = 8;
        super.u(context, (apjh) A.s());
    }

    public final void f(Context context, apjn apjnVar) {
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apjnVar.getClass();
        apjhVar.d = apjnVar;
        apjhVar.c = 4;
        super.u(context, (apjh) A.s());
    }

    public final void g(Context context, apjt apjtVar) {
        aozy A = A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apjtVar.getClass();
        apjhVar.d = apjtVar;
        apjhVar.c = 5;
        super.u(context, (apjh) A.s());
    }

    public final void h(Context context, int i, long j, int i2) {
        advr.o("Logging Configuration Update: Version: %d Validity: %d Remaining Validity : %d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j));
        aozy createBuilder = apfu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apfu apfuVar = (apfu) apagVar;
        apfuVar.b = 2 | apfuVar.b;
        apfuVar.d = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apfu apfuVar2 = (apfu) apagVar2;
        apfuVar2.b |= 4;
        apfuVar2.e = j;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apfu apfuVar3 = (apfu) createBuilder.b;
        apfuVar3.b |= 16;
        apfuVar3.g = i2;
        apfu apfuVar4 = (apfu) createBuilder.s();
        aozy A = acny.A();
        if (!A.b.isMutable()) {
            A.u();
        }
        apjh apjhVar = (apjh) A.b;
        apjh apjhVar2 = apjh.a;
        apfuVar4.getClass();
        apjhVar.d = apfuVar4;
        apjhVar.c = 6;
        super.u(context, (apjh) A.s());
    }
}
