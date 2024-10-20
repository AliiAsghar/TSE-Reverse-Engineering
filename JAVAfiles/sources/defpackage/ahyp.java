package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyp {
    public final ahyr a;
    public final Context b;
    public final apya c = apye.a(aegv.a);
    public final apya d = apxv.c(ahyq.a);
    public final apya e;
    public final apya f;
    public final apya g;
    public final apya h;
    public final apya i;
    public final apya j;
    public final apya k;
    public final apya l;
    private final aicm m;
    private final apya n;
    private final apya o;
    private final apya p;

    public ahyp(Context context, ahyr ahyrVar, aicm aicmVar) {
        this.a = ahyrVar;
        this.b = context;
        this.m = aicmVar;
        apya c = apxv.c(ahxm.a);
        this.n = c;
        apya c2 = apxv.c(new ahxw(c, 2));
        this.o = c2;
        this.e = apxv.c(new ahya(c, c2, 0));
        this.f = apxv.c(new ahya(c, c2, 1));
        this.g = apxv.c(ahxp.a);
        this.h = apxv.c(ahxo.a);
        this.i = apxv.c(new ahxw(c, 1));
        apya c3 = apxv.c(ahxy.a);
        this.p = c3;
        this.j = apxv.c(new ahxw(c3, 0));
        this.k = apxv.c(ahxz.a);
        this.l = apxv.c(new ahxw(c3, 3));
    }

    public final Context a() {
        Context applicationContext = this.b.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    public final hkg b() {
        return hlc.a(a());
    }

    public final ahiy c() {
        return new ahiy((aicq) new aicp(this.b), this.m, this.a);
    }
}
