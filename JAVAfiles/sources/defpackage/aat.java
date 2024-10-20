package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aat implements aar {
    private final float a;
    private final float b;
    private final float c;
    private final abl d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aat() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aat.<init>():void");
    }

    @Override // defpackage.zr
    public final /* bridge */ /* synthetic */ ack a(acg acgVar) {
        ack f;
        f = f();
        return f;
    }

    @Override // defpackage.aar
    public final float b(float f, float f2, float f3) {
        return brg.a;
    }

    @Override // defpackage.aar
    public final float c(long j, float f, float f2, float f3) {
        abl ablVar = this.d;
        ablVar.a = f2;
        return Float.intBitsToFloat((int) (ablVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.aar
    public final float d(long j, float f, float f2, float f3) {
        abl ablVar = this.d;
        ablVar.a = f2;
        return Float.intBitsToFloat((int) (ablVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    @Override // defpackage.aar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(float r35, float r36, float r37) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aat.e(float, float, float):long");
    }

    @Override // defpackage.aar
    public final /* synthetic */ acr f() {
        return new acr(this);
    }

    public aat(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        abl ablVar = new abl();
        if (f < brg.a) {
            abi.a("Damping ratio must be non-negative");
        }
        ablVar.c = f;
        if (ablVar.a() <= brg.a) {
            abi.a("Spring stiffness constant must be positive.");
        }
        ablVar.b = Math.sqrt(f2);
        this.d = ablVar;
    }

    public /* synthetic */ aat(float f, float f2, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
