package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqn {
    public algw a;
    public int b;
    private int c;
    private float d;
    private byte e;

    public ahqn() {
        throw null;
    }

    public final ahqo a() {
        int i;
        boolean z;
        boolean z2 = true;
        if (this.e == 3 && (i = this.b) != 0) {
            ahqo ahqoVar = new ahqo(i, this.c, this.d, this.a);
            if (ahqoVar.a >= 0) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Rate limit per second must be >= 0");
            float f = ahqoVar.b;
            if (f <= brg.a || f > 1.0f) {
                z2 = false;
            }
            albo.U(z2, "Sampling Probability shall be > 0 and <= 1");
            return ahqoVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if ((this.e & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.e & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    public final void c(float f) {
        this.d = f;
        this.e = (byte) (this.e | 2);
    }

    public final void d(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.b = i;
    }

    public ahqn(byte[] bArr) {
        this.a = alfd.a;
    }
}
