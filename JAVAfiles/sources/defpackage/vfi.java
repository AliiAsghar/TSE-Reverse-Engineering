package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vfi {
    public static final xze a = xze.g("BugleNetwork", "TachyonConnectionCheckHandler");
    private static final long i = TimeUnit.SECONDS.toMillis(10);
    public final xnv b;
    public final vcy c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicInteger e = new AtomicInteger(-1);
    public final AtomicLong f = new AtomicLong(-1);
    public final AtomicBoolean g = new AtomicBoolean(true);
    public final vfh h;
    private final anen j;
    private final xyt k;
    private final wpp l;

    public vfi(anen anenVar, xyt xytVar, wpp wppVar, xnv xnvVar, vcy vcyVar, vfh vfhVar) {
        this.j = anenVar;
        this.k = xytVar;
        this.l = wppVar;
        this.b = xnvVar;
        this.c = vcyVar;
        this.h = vfhVar;
    }

    public final void a() {
        long epochMilli = this.b.f().toEpochMilli();
        if (!this.g.get() && epochMilli - this.f.get() <= i) {
            a.o("Connectivity check is already going on, cancel current one");
            return;
        }
        this.g.set(false);
        akul h = akul.g(((yaq) this.k.a()).f()).h(new veg(this, 16), this.j);
        aqgb aqgbVar = (aqgb) this.l.S("Bugle").s();
        aozy createBuilder = aqdm.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdm aqdmVar = (aqdm) createBuilder.b;
        aqgbVar.getClass();
        aqdmVar.c = aqgbVar;
        aqdmVar.b |= 1;
        aqdm aqdmVar2 = (aqdm) createBuilder.s();
        a.o("Check Tachyon connectivity");
        aktp.an(h, akul.g(aktp.ag(aqdmVar2)).i(new vek(this, 2), this.j).h(new veg(this, 17), this.j).e(Throwable.class, new veg(this, 18), this.j)).h(new uvp(this, 20), this.j).k(qiu.b(), this.j);
    }
}
