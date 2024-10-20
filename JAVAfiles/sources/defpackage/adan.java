package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adan implements apyp {
    public final Object a;
    public final aneo b;
    public final aegu c;
    public final apyi d;
    public final apya e;
    public final apya f;
    private final adan g = this;
    private final apya h;
    private final apya i;
    private final apya j;
    private final apya k;
    private final apyi l;
    private final apya m;
    private final apyi n;
    private final apya o;
    private final apyi p;
    private final apya q;
    private final apyi r;
    private final apya s;
    private final apyi t;
    private final apya u;
    private final apyi v;
    private final apya w;
    private final apyi x;
    private final apyi y;
    private final apyi z;

    public adan(Object obj, Context context, Executor executor, addp addpVar, aegu aeguVar, aneo aneoVar, wcf wcfVar) {
        this.a = obj;
        this.b = aneoVar;
        this.c = aeguVar;
        apxw a = apxx.a(executor);
        this.h = a;
        apya c = apxv.c(a);
        this.i = c;
        this.e = apxx.a(this);
        apya c2 = apxv.c(new adao(this, 0, 1));
        this.j = c2;
        adao adaoVar = new adao(this, 1, 1);
        this.k = adaoVar;
        apyi d = apys.d(adaoVar);
        this.l = d;
        apxw a2 = apxx.a(context);
        this.m = a2;
        apyi d2 = apys.d(a2);
        this.n = d2;
        apxw a3 = apxx.a(addpVar);
        this.o = a3;
        apyi d3 = apys.d(a3);
        this.p = d3;
        this.f = apxx.a(wcfVar);
        adao adaoVar2 = new adao(this, 2, 1);
        this.q = adaoVar2;
        apyi d4 = apys.d(adaoVar2);
        this.r = d4;
        adao adaoVar3 = new adao(this, 3, 1);
        this.s = adaoVar3;
        apyi d5 = apys.d(adaoVar3);
        this.t = d5;
        adao adaoVar4 = new adao(this, 4, 1);
        this.u = adaoVar4;
        apyi d6 = apys.d(adaoVar4);
        this.v = d6;
        adao adaoVar5 = new adao(this, 5, 1);
        this.w = adaoVar5;
        apyi d7 = apys.d(adaoVar5);
        this.x = d7;
        adbd adbdVar = new adbd(c, c2, d, d4, d5, d6, d7);
        this.y = adbdVar;
        adbe adbeVar = new adbe(c, c2, d, d2, d3, adbdVar);
        this.z = adbeVar;
        this.d = apys.b(adbeVar, this);
    }

    @Override // defpackage.apyp
    public final void a(boolean z) {
        apys.e(this.z, z);
        apys.e(this.y, z);
        apys.e(this.x, z);
        apys.e(this.v, z);
        apys.e(this.t, z);
        apys.e(this.r, z);
        apys.e(this.p, z);
        apys.e(this.n, z);
        apys.e(this.l, z);
    }
}
