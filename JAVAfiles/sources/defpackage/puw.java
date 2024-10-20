package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puw {
    public static final Duration a;
    public final puu b;
    public final anen c;
    public final xnv d;
    public final nwf e;
    public final qdq f;
    public final qdq g;
    private final ptg h;
    private final ptg i;
    private final puu j;
    private final puu k;
    private final pvp l;
    private final nej m;
    private final qnu n;
    private final hgj o;
    private final qdq p;

    static {
        long j = arut.a;
        Duration ofSeconds = Duration.ofSeconds(arut.h(arsd.o(36500, aruv.g)), arut.d(r0));
        ofSeconds.getClass();
        a = ofSeconds;
        pvm pvmVar = new pvm();
        pvmVar.c(ofSeconds);
        pvmVar.b(ofSeconds);
        pvmVar.a();
    }

    public puw(qdq qdqVar, nej nejVar, qdq qdqVar2, qnu qnuVar, qdq qdqVar3, ptg ptgVar, ptg ptgVar2, puu puuVar, puu puuVar2, puu puuVar3, hgj hgjVar, pvp pvpVar, anen anenVar, xnv xnvVar, nwf nwfVar) {
        qdqVar.getClass();
        qdqVar2.getClass();
        qdqVar3.getClass();
        puuVar3.getClass();
        anenVar.getClass();
        xnvVar.getClass();
        this.p = qdqVar;
        this.m = nejVar;
        this.g = qdqVar2;
        this.n = qnuVar;
        this.f = qdqVar3;
        this.h = ptgVar;
        this.i = ptgVar2;
        this.j = puuVar;
        this.k = puuVar2;
        this.b = puuVar3;
        this.o = hgjVar;
        this.l = pvpVar;
        this.c = anenVar;
        this.d = xnvVar;
        this.e = nwfVar;
    }

    private final puu g() {
        if (this.e.a()) {
            return this.f.l(this.g.n(this.b, new pup(new nfz(14))));
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    public final puu a(puu puuVar, pvp pvpVar) {
        pvo m = this.o.m(new pvr(pvpVar, this.l, 1));
        ptg ptgVar = this.i;
        puu g = g();
        anen anenVar = this.c;
        pul pulVar = new pul(this.h, new pul(ptgVar, g, m, anenVar), m, anenVar);
        qnu qnuVar = this.n;
        lgg lggVar = (lgg) qnuVar.a.b();
        lggVar.getClass();
        anen anenVar2 = (anen) qnuVar.b.b();
        anenVar2.getClass();
        puv n = this.g.n(new pus(puuVar, pulVar, lggVar, anenVar2, m), new pup(new nfz(15)));
        nej nejVar = this.m;
        vco vcoVar = (vco) nejVar.c.b();
        vcoVar.getClass();
        anen anenVar3 = (anen) nejVar.b.b();
        anenVar3.getClass();
        return new pun(new puz(n, vcoVar, nejVar.a, anenVar3), (anen) ((kru) this.p.a).a.m.b());
    }

    public final puu b(pvp pvpVar, Executor executor) {
        hgj hgjVar = this.o;
        return a(new pul(this.h, this.j, hgjVar.m(pvpVar), executor), pvpVar);
    }

    public final puu c(pvp pvpVar) {
        return f(pvpVar, g());
    }

    public final puu d(pvp pvpVar) {
        return a(e(this.k, pvpVar), pvpVar);
    }

    public final puu e(puu puuVar, pvp pvpVar) {
        pvo m = this.o.m(pvpVar);
        ptg ptgVar = this.i;
        anen anenVar = this.c;
        return new pul(this.h, new pul(ptgVar, puuVar, m, anenVar), m, anenVar);
    }

    public final puu f(pvp pvpVar, puu puuVar) {
        pvo m = this.o.m(pvpVar);
        ptg ptgVar = this.i;
        anen anenVar = this.c;
        return a(new pul(this.h, new pul(ptgVar, puuVar, m, anenVar), m, anenVar), pvpVar);
    }
}
