package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbk implements mbl {
    private static final xze a = xze.g("BugleUsageStatistics", "ConfiguredClearcutCounterEventLogger");
    private final armf b;
    private final armf c;

    public mbk(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static void j() {
        a.l("Clearcut loggings are disabled.");
    }

    private final boolean l() {
        return ((yep) this.b.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.mbl
    public final void a() {
        if (!l()) {
            j();
        } else if (this.c.b() != null) {
            ((aboj) ((kor) this.c.b()).b).f();
        }
    }

    @Override // defpackage.mbl
    public final void b(String str, amdy amdyVar, long j) {
        if (!l()) {
            j();
            return;
        }
        kor korVar = (kor) this.c.b();
        str.getClass();
        amdyVar.getClass();
        aozy createBuilder = amfk.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amfk amfkVar = (amfk) apagVar;
        amfkVar.t = amdyVar.bI;
        amfkVar.b |= 131072;
        int i = xyp.a;
        if (i != 0) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amfk amfkVar2 = (amfk) createBuilder.b;
            amfkVar2.u = i - 1;
            amfkVar2.b |= 262144;
            apag s = createBuilder.s();
            s.getClass();
            abog e = ((aboj) korVar.b).e(str);
            abod a2 = abod.a((amfk) s);
            abob abobVar = e.f;
            e.a(j, 1L, a2);
            return;
        }
        throw null;
    }

    @Override // defpackage.mbl
    public final void c(String str) {
        if (!l()) {
            j();
        } else {
            ((kor) this.c.b()).p(str, 1);
        }
    }

    @Override // defpackage.mbl
    public final void d(String str, int i) {
        if (!l()) {
            j();
        } else {
            ((kor) this.c.b()).p(str, Long.valueOf(Integer.valueOf(i).longValue()));
        }
    }

    @Override // defpackage.mbl
    public final void e(String str, int i) {
        if (!l()) {
            j();
        } else {
            ((kor) this.c.b()).q(str, i, 1L);
        }
    }

    @Override // defpackage.mbl
    public final void f(String str, int i, long j) {
        if (!l()) {
            j();
            return;
        }
        kor korVar = (kor) this.c.b();
        str.getClass();
        korVar.q(str, i, j);
    }

    @Override // defpackage.mbl
    public final void g(String str, long j) {
        if (!l()) {
            j();
            return;
        }
        kor korVar = (kor) this.c.b();
        str.getClass();
        abog e = ((aboj) korVar.b).e(str);
        abob abobVar = e.f;
        e.a(j, 1L, aboj.b);
    }

    @Override // defpackage.mbl
    public final void h(String str, long j, String str2) {
        if (!l()) {
            j();
            return;
        }
        kor korVar = (kor) this.c.b();
        str2.getClass();
        abog e = ((lrf) korVar.a).h(str2).e(str);
        abob abobVar = e.f;
        e.a(j, 1L, aboj.b);
    }

    @Override // defpackage.mbl
    public final void k() {
        if (!l()) {
            j();
        } else {
            ((lrf) ((kor) this.c.b()).a).h("112855188").c("Bugle.BugOccurrence.Counts").a(0L, 1L, aboj.b);
        }
    }

    @Override // defpackage.mbl
    public final void i() {
    }
}
