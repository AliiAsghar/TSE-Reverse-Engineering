package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfj extends gnt {
    private static final alwo h = alwo.o("BugleWelcome");
    private final armf i;
    private final cj j;

    public abfj(armf armfVar, cj cjVar) {
        super(cjVar);
        this.i = armfVar;
        this.j = cjVar;
    }

    @Override // defpackage.gnt
    public final cg F(int i) {
        alvw m = h.m();
        m.X(ydl.M, "WelcomeFlowFragmentStateAdapter");
        m.r("#createFragment(%s)", i);
        int M = M(i) - 1;
        if (M != 1) {
            if (M != 2) {
                if (M != 3) {
                    if (M == 5) {
                        abfk abfkVar = new abfk();
                        apxh.e(abfkVar);
                        return abfkVar;
                    }
                    throw new IllegalArgumentException("Attempted to create invalid fragment");
                }
                abfs abfsVar = new abfs();
                apxh.e(abfsVar);
                return abfsVar;
            }
            abfv abfvVar = new abfv();
            apxh.e(abfvVar);
            return abfvVar;
        }
        abfo abfoVar = new abfo();
        apxh.e(abfoVar);
        return abfoVar;
    }

    public final int M(int i) {
        if (i != 0) {
            if (i != 1) {
                if (((abgg) this.i.b()).f()) {
                    return 4;
                }
                throw new IllegalStateException("Adapter should not return TOS page without eligibility");
            }
            return 3;
        }
        if (this.j.getIntent().hasExtra("extra_gaia_account_info")) {
            return 6;
        }
        return 2;
    }

    @Override // defpackage.no
    public final int b() {
        if (aczv.D() || !((abgg) this.i.b()).f()) {
            return 2;
        }
        return 3;
    }
}
