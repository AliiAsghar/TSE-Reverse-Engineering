package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argd {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public argd(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = alpt.o(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof argd)) {
            return false;
        }
        argd argdVar = (argd) obj;
        if (this.a != argdVar.a || this.b != argdVar.b || this.c != argdVar.c || Double.compare(this.d, argdVar.d) != 0 || !d.B(this.e, argdVar.e) || !d.B(this.f, argdVar.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.f("maxAttempts", this.a);
        aj.g("initialBackoffNanos", this.b);
        aj.g("maxBackoffNanos", this.c);
        aj.d("backoffMultiplier", this.d);
        aj.b("perAttemptRecvTimeoutNanos", this.e);
        aj.b("retryableStatusCodes", this.f);
        return aj.toString();
    }
}
