package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqx {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public Object e;

    public ahqx() {
    }

    public final ahqz a() {
        int i;
        Object obj;
        if (this.c == 7 && (i = this.d) != 0 && (obj = this.e) != null) {
            return new ahqz(i, this.a, (ahqy) obj, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.e == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.c & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.c & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.d = i;
    }

    public final ahpm c() {
        int i;
        if (this.c == 3 && (i = this.a) != 0) {
            ahpm ahpmVar = new ahpm(i, this.d, this.b, (algw) this.e);
            d.t(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
            return ahpmVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void e(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aneo] */
    public final ahki f() {
        boolean z = true;
        if (this.c != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" primesMetricExecutorPriority");
            }
            if ((this.c & 2) == 0) {
                sb.append(" primesMetricExecutorPoolSize");
            }
            if ((this.c & 4) == 0) {
                sb.append(" enableDeferredTasks");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ahki ahkiVar = new ahki(this.e, this.a, this.d, this.b);
        if (ahkiVar.c <= 0) {
            z = false;
        }
        albo.V(z, "Thread pool size must be less than or equal to %s", 2);
        return ahkiVar;
    }

    public final void g() {
        this.b = true;
        this.c = (byte) (this.c | 4);
    }

    public ahqx(byte[] bArr, byte[] bArr2) {
        this.e = alfd.a;
    }
}
