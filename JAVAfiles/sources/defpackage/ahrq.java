package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahrq {
    private final armf b;
    private final Object a = new Object();
    private int c = 0;
    private long d = 0;

    public ahrq(armf armfVar) {
        this.b = armfVar;
    }

    public static ahrq a(final int i) {
        return new ahrq(new armf() { // from class: ahrp
            @Override // defpackage.armf, defpackage.arme
            public final Object b() {
                return Integer.valueOf(i);
            }
        });
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.a) {
            this.c++;
            if (elapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = elapsedRealtime;
            }
        }
    }

    public final boolean c() {
        int intValue = ((Integer) this.b.b()).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != Integer.MAX_VALUE) {
            synchronized (this.a) {
                if (this.c >= intValue) {
                    long j = this.d;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
