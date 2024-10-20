package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcu {
    private Exception a;
    private long b = -9223372036854775807L;
    private long c = -9223372036854775807L;

    public final void a() {
        this.a = null;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == -9223372036854775807L && !fcx.q()) {
            this.b = 200 + elapsedRealtime;
        }
        long j = this.b;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.a;
            a();
            throw exc3;
        }
        this.c = elapsedRealtime + 50;
    }

    public final boolean c() {
        if (this.a == null || (!fcx.q() && SystemClock.elapsedRealtime() >= this.c)) {
            return false;
        }
        return true;
    }
}
