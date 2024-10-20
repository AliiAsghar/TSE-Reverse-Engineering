package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahoy {
    public int a;
    public algw b;
    public boolean c;
    public byte d;
    public int e;
    private boolean f;
    private boolean g;

    public ahoy() {
        throw null;
    }

    public final ahoz a() {
        int i;
        if (this.d == Byte.MAX_VALUE && (i = this.e) != 0) {
            return new ahoz(i, this.a, this.f, this.b, this.g, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.d & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.d & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.d & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        if ((this.d & 32) == 0) {
            sb.append(" recordMemoryPeriodically");
        }
        if ((this.d & 64) == 0) {
            sb.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(boolean z) {
        this.f = z;
        this.d = (byte) (this.d | 2);
    }

    public ahoy(byte[] bArr) {
        this.b = alfd.a;
    }
}
