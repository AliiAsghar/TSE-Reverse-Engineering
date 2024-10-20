package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aau implements aar {
    private final int a;
    private final aak b;
    private final long c;
    private final long d;

    public aau(int i, int i2, aak aakVar) {
        this.a = i;
        this.b = aakVar;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.zr
    public final /* bridge */ /* synthetic */ ack a(acg acgVar) {
        ack f;
        f = f();
        return f;
    }

    @Override // defpackage.aar
    public final /* synthetic */ float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.aar
    public final float c(long j, float f, float f2, float f3) {
        float f4;
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            long j2 = j - this.d;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = this.c;
            if (j2 > j3) {
                j2 = j3;
            }
            f4 = ((float) j2) / ((float) j3);
        }
        float a = this.b.a(f4);
        return (f * (1.0f - a)) + (f2 * a);
    }

    @Override // defpackage.aar
    public final float d(long j, float f, float f2, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (c(j2, f, f2, f3) - c(j2 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.aar
    public final long e(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.aar
    public final /* synthetic */ acr f() {
        return new acr(this);
    }

    public aau() {
        this(300, 0, aao.a);
    }
}
