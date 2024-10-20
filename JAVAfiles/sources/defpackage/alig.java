package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alig {
    static final alhr a = new alhw(new albo());
    static final alhz b;
    aljl g;
    aljl h;
    algj k;
    algj l;
    alhz m;
    alif o;
    alie p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final alhr n = a;

    static {
        new alii();
        b = new alic();
    }

    private final void g() {
        boolean z = true;
        if (this.o == null) {
            if (this.f != -1) {
                z = false;
            }
            albo.U(z, "maximumWeight requires weigher");
        } else if (this.c) {
            if (this.f == -1) {
                z = false;
            }
            albo.U(z, "weigher requires maximumWeight");
        } else if (this.f == -1) {
            alid.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final alib a() {
        g();
        albo.U(true, "refreshAfterWrite requires a LoadingCache");
        return new aljg(new alkd(this, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aljl b() {
        return (aljl) albo.ak(this.g, aljl.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aljl c() {
        return (aljl) albo.ak(this.h, aljl.STRONG);
    }

    public final void d(long j, TimeUnit timeUnit) {
        boolean z;
        long j2 = this.i;
        boolean z2 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.W(z, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z2 = false;
        }
        albo.ac(z2, j, timeUnit);
        this.i = timeUnit.toNanos(j);
    }

    public final void e(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.e;
        boolean z4 = true;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        albo.W(z, "maximum size was already set to %s", j2);
        long j3 = this.f;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        albo.W(z2, "maximum weight was already set to %s", j3);
        if (this.o == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        albo.U(z3, "maximum size can not be combined with weigher");
        if (j < 0) {
            z4 = false;
        }
        d.t(z4, "maximum size must not be negative");
        this.e = j;
    }

    public final alij f(asqc asqcVar) {
        g();
        return new aljf(this, asqcVar);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        int i = this.d;
        if (i != -1) {
            aj.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            aj.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            aj.g("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            aj.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            aj.b("expireAfterAccess", j4 + "ns");
        }
        aljl aljlVar = this.g;
        if (aljlVar != null) {
            aj.b("keyStrength", albo.ap(aljlVar.toString()));
        }
        aljl aljlVar2 = this.h;
        if (aljlVar2 != null) {
            aj.b("valueStrength", albo.ap(aljlVar2.toString()));
        }
        if (this.k != null) {
            aj.a("keyEquivalence");
        }
        if (this.l != null) {
            aj.a("valueEquivalence");
        }
        if (this.p != null) {
            aj.a("removalListener");
        }
        return aj.toString();
    }
}
