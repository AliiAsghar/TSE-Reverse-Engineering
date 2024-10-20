package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkm {
    public static final boolean a = hkn.b;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str, long j) {
        if (!this.c) {
            this.b.add(new mkk(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void b(String str) {
        long j;
        this.c = true;
        if (this.b.size() == 0) {
            j = 0;
        } else {
            j = ((mkk) this.b.get(r1.size() - 1)).a - ((mkk) this.b.get(0)).a;
        }
        if (j > 0) {
            long j2 = ((mkk) this.b.get(0)).a;
            hkn.a("(%-4d ms) %s", Long.valueOf(j), str);
            for (mkk mkkVar : this.b) {
                long j3 = mkkVar.a;
                hkn.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(mkkVar.b), mkkVar.c);
                j2 = j3;
            }
        }
    }

    protected final void finalize() {
        if (!this.c) {
            b("Request on the loose");
            hkn.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
