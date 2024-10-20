package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxj {
    public static final long a;
    public final long b;
    public final ety c;
    public final fuy d;
    public final fwp e;
    public fxn f;
    public String g;
    public int h;
    public hka i;
    public final qdq j;
    private final Context k;
    private final fxh l;
    private final esi m;
    private final fvl n;
    private final Looper o;
    private final eqg p;
    private final eti q;
    private final etu r;
    private final dyf s;

    static {
        long j;
        erf.b("media3.transformer");
        if (true != eul.Z()) {
            j = 10000;
        } else {
            j = 21000;
        }
        a = j;
    }

    public fxj(Context context, fxh fxhVar, long j, ety etyVar, dyf dyfVar, esi esiVar, fvl fvlVar, fuy fuyVar, Looper looper, eqg eqgVar, eti etiVar) {
        dzg.e(true, "Audio and video cannot both be removed.");
        this.k = context;
        this.l = fxhVar;
        this.b = j;
        this.c = etyVar;
        this.s = dyfVar;
        this.m = esiVar;
        this.n = fvlVar;
        this.d = fuyVar;
        this.o = looper;
        this.p = eqgVar;
        this.q = etiVar;
        this.h = 0;
        this.r = etiVar.b(looper, null);
        this.j = new qdq(this, null);
        this.e = new fwp();
    }

    public final void a() {
        this.c.d(-1, new fbq(this, 3));
        this.c.c();
        this.h = 0;
    }

    public final void b() {
        if (Looper.myLooper() == this.o) {
        } else {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public final void d(hka hkaVar, String str) {
        b();
        this.i = hkaVar;
        this.g = str;
        this.e.b();
        e(hkaVar, new fwy(str, this.d, this.j, this.b), this.j);
    }

    public final void e(hka hkaVar, fwy fwyVar, qdq qdqVar) {
        boolean z;
        fxh fxhVar;
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.e(z, "There is already an export in progress.");
        int i = hkaVar.a;
        fxh fxhVar2 = this.l;
        if (i != 0) {
            fxg fxgVar = new fxg(fxhVar2);
            fxgVar.b = i;
            fxhVar = fxgVar.a();
        } else {
            fxhVar = fxhVar2;
        }
        fwr fwrVar = new fwr(hkaVar, this.c, this.r, fxhVar);
        Context context = this.k;
        fvn fvnVar = new fvn(context, new fvr(new fvq(context)), this.q);
        ewx.b();
        fxn fxnVar = new fxn(this.k, hkaVar, fxhVar, fvnVar, this.s, this.m, this.n, fwyVar, qdqVar, fwrVar, this.r, this.p, this.q);
        this.f = fxnVar;
        fxnVar.c();
        fxnVar.d.e(1);
        synchronized (fxnVar.j) {
        }
        int i2 = eul.a;
    }
}
