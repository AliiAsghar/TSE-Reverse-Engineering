package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdo implements agar {
    static final /* synthetic */ artm[] a;
    public static final alvi b;
    public final agdq c;
    public final agak d;
    public final arqr e;
    public final aged f;
    public final Map g;
    private final anca h;
    private final da i;
    private final arqg j;
    private final ageo k;
    private final arsn l;
    private final arsn m;
    private final ahjj n;
    private final aday o;
    private final aday p;

    static {
        arrr arrrVar = new arrr(agdo.class, "currentScreen", "getCurrentScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(agdo.class, "currentState", "getCurrentState()Lcom/google/android/libraries/compose/ui/rendering/RenderingState;", 0)};
        b = alvi.m("com/google/android/libraries/compose/ui/rendering/RenderingManager");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    public agdo(anca ancaVar, aday adayVar, aday adayVar2, da daVar, arqg arqgVar, agdq agdqVar, agak agakVar, ageo ageoVar, arqr arqrVar) {
        aged agedVar;
        this.h = ancaVar;
        this.o = adayVar;
        this.p = adayVar2;
        this.i = daVar;
        this.j = arqgVar;
        this.c = agdqVar;
        this.d = agakVar;
        this.k = ageoVar;
        this.e = arqrVar;
        if (agdqVar.a) {
            Context context = (Context) adayVar.a.b();
            context.getClass();
            adwo adwoVar = (adwo) adayVar.b.b();
            adwoVar.getClass();
            agedVar = new ageg(context, adwoVar, daVar, agdqVar, agakVar);
        } else {
            Context context2 = (Context) adayVar2.a.b();
            context2.getClass();
            adwo adwoVar2 = (adwo) adayVar2.b.b();
            adwoVar2.getClass();
            agedVar = new aged(context2, adwoVar2, daVar, agdqVar, agakVar);
        }
        this.f = agedVar;
        this.n = new ahjj(this, (byte[]) null);
        this.l = new agdm(this);
        this.m = new agdn(agdp.d, this);
        this.g = new LinkedHashMap();
    }

    public static /* synthetic */ boolean p(agdo agdoVar) {
        agdp b2 = agdoVar.b();
        b2.getClass();
        if (b2 == agdp.d) {
            return false;
        }
        return true;
    }

    private final Object q(arqr arqrVar, Object obj) {
        try {
            return arqrVar.a(this.j.a());
        } catch (arna unused) {
            ((alvg) b.g().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "safelyRunWithDraftController", 373, "RenderingManager.kt")).t("DraftController not initialized. Returning default value %s.", obj);
            return obj;
        }
    }

    public final int a(agdp agdpVar) {
        agdpVar.getClass();
        return this.f.b();
    }

    public final agdp b() {
        return (agdp) this.m.c(a[1]);
    }

    public final agem c(agek agekVar) {
        agekVar.getClass();
        return this.f.d(agekVar);
    }

    public final agem d() {
        return (agem) this.l.c(a[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup$OnHierarchyChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, arqr] */
    public final void e() {
        aged agedVar = this.f;
        adec adecVar = agedVar.i;
        if (((agdq) adecVar.c).h) {
            adecVar.h(adecVar.b);
        }
        ((agdq) adecVar.c).c.setOnHierarchyChangeListener(adecVar.a);
        agedVar.h();
    }

    public final void f(agem agemVar) {
        agemVar.gA(this.c, this.n);
        agemVar.gB(this.j);
    }

    public final void g() {
        agdp b2 = b();
        agaq agaqVar = agaq.a;
        int ordinal = b2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            o(agdp.d);
            i(d());
        }
        h();
    }

    public final void h() {
        this.f.f();
    }

    public final void i(agem agemVar) {
        Instant a2 = this.h.a();
        a2.getClass();
        if (agemVar != null) {
            agemVar.aX();
            ageo ageoVar = this.k;
            agek aM = agemVar.aM();
            int intValue = ((Number) q(agdl.b, 0)).intValue();
            Duration between = Duration.between(agemVar.aN, a2);
            between.getClass();
            ageoVar.a(aM, intValue, between);
            agemVar.bq(Instant.EPOCH);
        }
    }

    public final void j() {
        Duration bm;
        agem d = d();
        if (d != null) {
            if (true != d.br()) {
                d = null;
            }
            if (d != null) {
                f(d);
                if (b() == agdp.a && this.d.d() == agaq.a) {
                    this.d.i();
                }
                if (b() != agdp.d) {
                    if (d.F(d.aN, Instant.EPOCH)) {
                        d.bq(this.h.a());
                        bm = Duration.ZERO;
                    } else {
                        bm = d.bm();
                    }
                    bm.getClass();
                    d.aY();
                    this.k.b(d.aM(), ((Number) q(agdl.a, 0)).intValue(), bm);
                }
            }
        }
    }

    public final void k(agem agemVar) {
        agemVar.getClass();
        e();
        if (!d.F(agemVar, d())) {
            n(agemVar);
        }
        agdp b2 = b();
        agaq agaqVar = agaq.a;
        if (b2.ordinal() != 3) {
            return;
        }
        o(agdp.a);
        j();
    }

    @Override // defpackage.agar
    public final void l(int i) {
        agdp b2 = b();
        agaq agaqVar = agaq.a;
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aged.m(this.f, i, 2);
            }
        } else if (i > this.f.b()) {
            this.f.i(i, false);
        }
    }

    @Override // defpackage.agar
    public final void m(agaq agaqVar) {
        agaqVar.getClass();
        agaq agaqVar2 = agaq.a;
        int ordinal = agaqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3 && !this.c.a && b().ordinal() == 1) {
                g();
                return;
            }
            return;
        }
        int ordinal2 = b().ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return;
            }
            agak agakVar = this.d;
            aged agedVar = this.f;
            agdq agdqVar = this.c;
            int b2 = agakVar.b();
            agedVar.k(b2, agdqVar.a() - b2);
            return;
        }
        g();
    }

    public final void n(agem agemVar) {
        this.l.d(a[0], agemVar);
    }

    public final void o(agdp agdpVar) {
        this.m.d(a[1], agdpVar);
    }
}
