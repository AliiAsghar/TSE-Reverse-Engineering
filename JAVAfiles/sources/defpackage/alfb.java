package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfb {
    public static final alhz a;

    static {
        alhz alfaVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            alfaVar = new alez();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            alfaVar = new alfa();
        }
        a = alfaVar;
    }
}
