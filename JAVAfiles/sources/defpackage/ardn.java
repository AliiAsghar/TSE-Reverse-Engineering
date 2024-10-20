package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ardn extends arbd {
    final aqsm c;
    final aqux d;
    final aqrr e;
    final /* synthetic */ ardo f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ardn(defpackage.ardo r3, defpackage.aqsm r4, defpackage.aqux r5, defpackage.aqrr r6) {
        /*
            r2 = this;
            r2.f = r3
            ardr r3 = r3.c
            java.util.concurrent.Executor r0 = r3.g(r6)
            ardp r3 = r3.j
            aqsn r1 = r6.b
            r2.<init>(r0, r3, r1)
            r2.c = r4
            r2.d = r5
            r2.e = r6
            long r3 = java.lang.System.nanoTime()
            r2.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ardn.<init>(ardo, aqsm, aqux, aqrr):void");
    }

    @Override // defpackage.arbd
    protected final void b() {
        this.f.c.m.execute(new arbg(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        aray arayVar;
        aqsm a = this.c.a();
        try {
            aqru c = this.f.c(this.d, this.e.e(aqrx.k, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    arayVar = null;
                } else {
                    super.i(c);
                    arayVar = new aray(this, this.a);
                }
            }
            if (arayVar == null) {
                this.f.c.m.execute(new arbg(this, 20));
            } else {
                this.f.c.g(this.e).execute(new ardm(this, arayVar, 2, null));
            }
        } finally {
            this.c.f(a);
        }
    }
}
