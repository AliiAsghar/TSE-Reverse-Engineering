package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbd implements mbl {
    private static final xze a = xze.g("BugleUsageStatistics", "ClearcutCounterEventLogger");
    private final armf b;
    private final armf c;
    private boolean d = false;

    public mbd(armf armfVar, armf armfVar2) {
        this.c = armfVar;
        this.b = armfVar2;
    }

    public static void j() {
        a.l("Clearcut loggings are disabled.");
    }

    @Override // defpackage.mbl
    public final void a() {
        if (!this.d) {
            j();
        } else if (this.b.b() != null) {
            ((maq) this.b.b()).a();
        }
    }

    @Override // defpackage.mbl
    public final void b(String str, amdy amdyVar, long j) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).c(str, amdyVar, j);
        }
    }

    @Override // defpackage.mbl
    public final void c(String str) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).d(str);
        }
    }

    @Override // defpackage.mbl
    public final void d(String str, int i) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).e(str, i);
        }
    }

    @Override // defpackage.mbl
    public final void e(String str, int i) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).f(str, i);
        }
    }

    @Override // defpackage.mbl
    public final void f(String str, int i, long j) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).g(str, i, j);
        }
    }

    @Override // defpackage.mbl
    public final void g(String str, long j) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).h(str, j);
        }
    }

    @Override // defpackage.mbl
    public final void h(String str, long j, String str2) {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).i(str, j, str2);
        }
    }

    @Override // defpackage.mbl
    public final void i() {
        if (!((yep) this.c.b()).i("bugle_enable_analytics", true)) {
            return;
        }
        this.d = true;
    }

    @Override // defpackage.mbl
    public final void k() {
        if (!this.d) {
            j();
        } else {
            ((maq) this.b.b()).r();
        }
    }
}
