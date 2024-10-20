package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lag implements emx {
    public static final xze a = xze.g("Bugle", "HomeErrorStateLogger");
    public final armf b;
    public final armf c;
    public final armf d;
    public final cj e;
    public Instant f;
    public boolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicInteger k;
    public final AtomicBoolean l;
    private final xnv m;
    private final arwe n;
    private final armf o;
    private final AtomicInteger p;
    private final AtomicInteger q;
    private boolean r;

    public lag(armf armfVar, xnv xnvVar, armf armfVar2, arwe arweVar, armf armfVar3, cj cjVar, armf armfVar4) {
        armfVar.getClass();
        xnvVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        armfVar3.getClass();
        cjVar.getClass();
        armfVar4.getClass();
        this.b = armfVar;
        this.m = xnvVar;
        this.c = armfVar2;
        this.n = arweVar;
        this.d = armfVar3;
        this.e = cjVar;
        this.o = armfVar4;
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.p = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.l = new AtomicBoolean();
    }

    public final Instant a() {
        Instant instant = this.f;
        if (instant != null) {
            return instant;
        }
        arro.b("startTime");
        return null;
    }

    public final void b(int i) {
        ((mbl) this.c.b()).i();
        ((mbl) this.c.b()).e("Bugle.HomeScreen.Empty.Count", i);
    }

    public final void c(int i) {
        this.q.set(i - 1);
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        if (this.f == null) {
            Instant f = this.m.f();
            f.getClass();
            this.f = f;
            if (this.g) {
                Iterator it = aqjn.B(10000L, 30000L).iterator();
                while (it.hasNext()) {
                    qjh.l(this.n, null, new lae(((Number) it.next()).longValue(), this, null), 3);
                }
            }
        }
    }

    @Override // defpackage.emx
    public final void gG(enm enmVar) {
        this.l.set(true);
    }

    @Override // defpackage.emx
    public final void i(enm enmVar) {
        this.l.set(false);
        if (!this.r && this.g) {
            this.r = true;
            if (this.q.get() != 2 && Duration.between(a(), this.m.f()).toMillis() > ((Number) kuw.a.e()).longValue()) {
                xyo c = a.c();
                c.H("About to log HomeScreenBlankError to clearcut");
                c.q();
                aozy createBuilder = amvv.a.createBuilder();
                createBuilder.getClass();
                aozy createBuilder2 = amvu.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amvu amvuVar = (amvu) createBuilder2.b;
                amvuVar.b |= 1;
                amvuVar.c = false;
                amvu amvuVar2 = (amvu) createBuilder2.s();
                amvuVar2.getClass();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amvv amvvVar = (amvv) createBuilder.b;
                amvvVar.e = amvuVar2;
                amvvVar.b |= 8;
                aozy createBuilder3 = amol.a.createBuilder();
                createBuilder3.getClass();
                int Y = a.Y(this.k.get());
                if (Y != 0) {
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amol amolVar = (amol) createBuilder3.b;
                    amolVar.d = Y - 1;
                    amolVar.b |= 2;
                    boolean f = ((izc) this.d.b()).f(this.e);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    amol amolVar2 = (amol) createBuilder3.b;
                    amolVar2.b |= 1;
                    amolVar2.c = f;
                    apag s = createBuilder3.s();
                    s.getClass();
                    amol amolVar3 = (amol) s;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amvv amvvVar2 = (amvv) createBuilder.b;
                    amvvVar2.d = amolVar3;
                    amvvVar2.b |= 4;
                    aozy createBuilder4 = amom.a.createBuilder();
                    createBuilder4.getClass();
                    int Y2 = a.Y(this.p.get());
                    if (Y2 != 0) {
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        amom amomVar = (amom) createBuilder4.b;
                        amomVar.c = Y2 - 1;
                        amomVar.b |= 1;
                        apag s2 = createBuilder4.s();
                        s2.getClass();
                        amom amomVar2 = (amom) s2;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amvv amvvVar3 = (amvv) createBuilder.b;
                        amvvVar3.c = amomVar2;
                        amvvVar3.b |= 2;
                        aozy createBuilder5 = amvt.a.createBuilder();
                        createBuilder5.getClass();
                        int R = a.R(this.q.get());
                        if (R != 0) {
                            if (!createBuilder5.b.isMutable()) {
                                createBuilder5.u();
                            }
                            amvt amvtVar = (amvt) createBuilder5.b;
                            amvtVar.c = R - 1;
                            amvtVar.b |= 1;
                            apag s3 = createBuilder5.s();
                            s3.getClass();
                            amvt amvtVar2 = (amvt) s3;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amvv amvvVar4 = (amvv) createBuilder.b;
                            amvvVar4.f = amvtVar2;
                            amvvVar4.b |= 16;
                            apag s4 = createBuilder.s();
                            s4.getClass();
                            amvv amvvVar5 = (amvv) s4;
                            maq maqVar = (maq) this.o.b();
                            amfq amfqVar = (amfq) amfr.a.createBuilder();
                            amfp amfpVar = amfp.HOME_SCREEN_METRICS_EVENT;
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar = (amfr) amfqVar.b;
                            amfrVar.i = amfpVar.dg;
                            amfrVar.b |= 1;
                            aozy createBuilder6 = amvx.a.createBuilder();
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            amvx amvxVar = (amvx) createBuilder6.b;
                            amvxVar.c = amvvVar5;
                            amvxVar.b = 1;
                            amvx amvxVar2 = (amvx) createBuilder6.s();
                            if (!amfqVar.b.isMutable()) {
                                amfqVar.u();
                            }
                            amfr amfrVar2 = (amfr) amfqVar.b;
                            amvxVar2.getClass();
                            amfrVar2.bf = amvxVar2;
                            amfrVar2.g |= 2;
                            maqVar.k(amfqVar, amrs.HOME_SCREEN_METRICS_EVENT);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                xyo c2 = a.c();
                c2.H("Skipping logging to clearcut since conditions are not met.");
                c2.q();
            }
            if (!this.i.get()) {
                long seconds = Duration.between(a(), this.m.f()).getSeconds();
                a.o(a.cn(seconds, "Home screen is blank for ", " seconds until user leave the app"));
                qjh.l(this.n, null, new laf(this, seconds, (arpe) null, 0), 3);
                return;
            }
            a.l("Home screen and conversation list show after launch");
        }
    }

    public final void j(int i) {
        this.p.set(i - 1);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }
}
