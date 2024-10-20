package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqe {
    public static final ahqe a = new ahqe();
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile ahmz g;
    public volatile ahmz h;
    public volatile ahmz i;
    public volatile ahmz j;
    public volatile ahmz k;
    public volatile ahmz l;
    public volatile ahmz m;
    public volatile ahmz n;
    public volatile ahmz o;
    public volatile ahmz p;
    public volatile ahmz q;
    public volatile ahka r;
    private volatile boolean[] u = new boolean[5];
    public final ahqa s = new ahqa();
    public final ahqa t = new ahqa();

    public static void e(String str, long j) {
        long startElapsedRealtime;
        if (Build.VERSION.SDK_INT >= 29) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            Trace.setCounter(str, j - startElapsedRealtime);
            Trace.setCounter(str, 0L);
        }
    }

    public final void a(int i) {
        boolean z;
        if (i < 5) {
            boolean[] zArr = this.u;
            if (this.s.b != null) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            if (this.u[i]) {
                for (int i2 = i + 1; i2 < 5; i2++) {
                    this.u[i2] = true;
                }
                return;
            }
            aiut.e(new ebm(this, i, 17));
        }
    }

    public final void b(Activity activity) {
        if (aiut.g() && this.q == null) {
            this.q = ahmz.b();
            e("Primes-tti-end-and-length-ms", this.q.a);
            if (activity != null) {
                try {
                    activity.reportFullyDrawn();
                } catch (RuntimeException e) {
                    Log.d("PrimesStartupMeasure", "Failed to report App usable time.", e);
                }
            }
        }
    }

    public final void c(ahmz ahmzVar) {
        ahmz ahmzVar2 = this.s.b;
        if (aiut.g() && this.g != null && ahmzVar.a <= SystemClock.elapsedRealtime()) {
            if ((ahmzVar2 == null || ahmzVar.a <= ahmzVar2.a) && this.l == null) {
                this.l = ahmzVar;
            }
        }
    }

    public final void d(ahka ahkaVar) {
        if (this.r == null) {
            this.r = ahkaVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(boolean z, long j, ahqh ahqhVar) {
        if (z) {
            return this.u[((int) j) - 1];
        }
        int ordinal = ahqhVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return this.b;
                    }
                    return this.f;
                }
                return this.e;
            }
            return this.d;
        }
        return this.c;
    }
}
