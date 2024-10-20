package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ariy extends aqsr {
    static final arjw a;
    static final arep b;
    private static final long n;
    private static final arhk o;
    public arep c;
    public arep d;
    public final boolean e;
    public arjw f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public atoi m;
    private final ardy p;
    private SSLSocketFactory q;

    static {
        Logger.getLogger(ariy.class.getName());
        arjv arjvVar = new arjv(arjw.a);
        arjvVar.a(arju.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, arju.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, arju.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, arju.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, arju.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, arju.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        arjvVar.c(arkf.TLS_1_2);
        arjvVar.b();
        a = new arjw(arjvVar);
        n = TimeUnit.DAYS.toNanos(1000L);
        ariu ariuVar = new ariu(0);
        o = ariuVar;
        b = new arhm(ariuVar, 0);
        EnumSet.of(aqwg.MTLS, aqwg.CUSTOM_MANAGERS);
    }

    public ariy(String str) {
        this.m = arhu.i;
        this.c = b;
        this.d = new arhm(arcb.o, 0);
        this.f = a;
        this.l = 1;
        this.g = Long.MAX_VALUE;
        this.h = arcb.k;
        this.i = 65535;
        this.j = 4194304;
        this.k = Integer.MAX_VALUE;
        this.p = new ardy(str, new ariw(this, 0), new ariv(this));
        this.e = false;
    }

    @Override // defpackage.aqsr
    protected final aque b() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SSLSocketFactory j() {
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                try {
                    if (this.q == null) {
                        this.q = SSLContext.getInstance("Default", arkd.b.c).getSocketFactory();
                    }
                    return this.q;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            }
            throw new RuntimeException("Unknown negotiation type: ".concat(aqaw.i(1)));
        }
        throw null;
    }

    public final void k(long j, TimeUnit timeUnit) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.g = nanos;
        long max = Math.max(nanos, arcu.a);
        this.g = max;
        if (max >= n) {
            this.g = Long.MAX_VALUE;
        }
    }

    public final void l(long j, TimeUnit timeUnit) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.h = nanos;
        this.h = Math.max(nanos, arcu.b);
    }

    public final void m(Executor executor) {
        if (executor == null) {
            this.c = b;
        } else {
            this.c = new arhm(executor, 1);
        }
    }

    public ariy(String str, int i) {
        this(arcb.d(str, i));
    }
}
